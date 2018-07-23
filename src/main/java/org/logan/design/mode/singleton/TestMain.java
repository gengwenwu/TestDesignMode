package org.logan.design.mode.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.function.Consumer;

/**
 * desc: 测试单例模式 <br/>
 * 单例的两大好处：<br/>
 * 1，对于频繁使用的对象，可以省略创建对象消耗的时间，特别是重量级对象。<br/>
 * 2，由于new操作次数减少，可以减轻GC压力，缩短GC停顿时间。<br/>
 * time: 2018/7/22 下午12:23 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class TestMain {

	public static void main(String[] args) throws Exception {
		// testHungrySingleton();
		// testLazySingleton();
		// testStaticSingleton();
		testSerSingleton();
	}

	/**
	 * 测试饥饿方式单例
	 */
	private static void testHungrySingleton() {
		//createString()的执行，导致了Singleton1构造函数的执行，
		//并没有使用getInstance()单例的实例。
		HungrySingleton.createString();

		HungrySingleton.getInstance();
	}

	/**
	 * 测试懒加载单例
	 */
	private static void testLazySingleton() {
		testSingletonPerformance(z -> {
			LazySingleton.getInstance();
		});
	}

	/**
	 * 最好的单例
	 */
	private static void testStaticSingleton() {
		testSingletonPerformance(z -> {
			StaticSingleton.getInstance();
		});
	}

	/**
	 * 测试单例性能
	 */
	private static void testSingletonPerformance(Consumer<Void> consumer) {
		for (int i = 0; i < 7; i++) {
			final String tag = "Thread_" + i;

			new Thread(() -> {
				long beginTime = System.currentTimeMillis();
				for (int j = 0; j < 1000000; j++) {
					consumer.accept(null);
				}
				System.out.println(tag + " usedTime " + (System.currentTimeMillis() - beginTime));
			}).start();
		}
	}

	/**
	 * 最安全单例
	 */
	private static void testSerSingleton() throws Exception {
		SecuritySingleton s = SecuritySingleton.getInstance();
		FileOutputStream fos = new FileOutputStream("SecuritySingleton.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.flush();
		oos.close();

		FileInputStream fis = new FileInputStream("SecuritySingleton.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SecuritySingleton s1 = (SecuritySingleton) ois.readObject();

		System.out.println("s==s1:" + (s == s1));
	}

}
