package org.logan.design.mode.singleton;

/**
 * desc: 饿加载方式单例 <br/>
 * 该方式最致命的缺点：会影响性能。
 * time: 2018/7/22 下午12:21 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class HungrySingleton {

	private static final String TAG = "HungrySingleton";
	private static HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
		System.out.println(TAG + " is create");
	}

	public static HungrySingleton getInstance() {
		//System.out.println(TAG + " getInstance()");
		return instance;
	}

	public static void createString() {
		System.out.println(TAG + " createString() ");
	}

}
