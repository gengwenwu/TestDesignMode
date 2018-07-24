package org.logan.design.mode.creator.singleton;

/**
 * desc: 单例最佳方案。 <br/>
 * 使用内部类维护单例的实例，单StaticSingleton被加载时，其内部类并不会被初始化，<br/>
 * 当getInstance()被调用，才会加载SingletonHolder。由于实例的建立是在类加载时完成，<br/>
 * 所以不出出现多线程问题。所以getInstance不必使用synchronized关键字。
 * time: 2018/7/22 下午4:22 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class StaticSingleton {

	private static final String TAG = "StaticSingleton";

	private StaticSingleton() {
		System.out.println(TAG + " is create.");
	}

	private static class SingletonHolder {
		private static StaticSingleton instance = new StaticSingleton();
	}

	public static StaticSingleton getInstance() {
		return SingletonHolder.instance;
	}

}