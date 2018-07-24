package org.logan.design.mode.creator.singleton;

/**
 * desc: 懒加载方式单例 <br/>
 * time: 2018/7/22 下午3:59 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class LazySingleton {

	private static final String TAG = "LazySingleton";
	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println(TAG + " is create");
	}

	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}

		return instance;
	}

}
