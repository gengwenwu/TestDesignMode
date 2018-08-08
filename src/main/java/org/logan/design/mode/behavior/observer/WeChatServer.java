package org.logan.design.mode.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * desc: 微信服务（被观察者）， 实现Observable接口。<br/>
 * time: 2018/8/6 上午11:33 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class WeChatServer implements Observable {

	/**
	 * 观察者集合
	 */
	private List<Observer> list;


	public WeChatServer() {
		this.list = new ArrayList<>(3);
	}


	@Override
	public void registerObserver(Observer o) {
		list.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		list.remove(0);
	}

	@Override
	public void notifyObserver(final String message) {
		list.forEach(observer -> observer.update(message));
	}

	public void setInformation(String message) {
		System.out.println("微信服务更新新消息了。");
		notifyObserver(message);
	}

}
