package org.logan.design.mode.action.observer;

/**
 * desc: 抽象被观察者 <br/>
 * time: 2018/8/6 上午11:30 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
interface Observable {

	/**
	 * 注册观察者
	 */
	void registerObserver(Observer o);

	/**
	 * 注销观察者
	 */
	void removeObserver(Observer o);

	/**
	 * 更新观察者
	 */
	void notifyObserver(final String message);

}