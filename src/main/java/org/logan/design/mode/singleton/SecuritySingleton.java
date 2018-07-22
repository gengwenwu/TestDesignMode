package org.logan.design.mode.singleton;

import java.io.Serializable;

/**
 * desc: 序列化、反序列化会破坏单例，实现readResolve()可以解决这样的问题 <br/>
 * time: 2018/7/22 下午4:38 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class SecuritySingleton implements Serializable {

	private static final String TAG = "SecuritySingleton";
	private static SecuritySingleton instance;

	private SecuritySingleton() {
		System.out.println(TAG + " is create.");
	}

	public static synchronized SecuritySingleton getInstance() {
		if (instance == null) {
			instance = new SecuritySingleton();
		}

		return instance;
	}

	/**
	 * 防止反序列化后，生成新的实例，总是返回当前对象 。
	 */
	private Object readResolve() {
		return instance;
	}

}
