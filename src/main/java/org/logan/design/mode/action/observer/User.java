package org.logan.design.mode.action.observer;

/**
 * desc: 微信用户（观察者） <br/>
 * time: 2018/8/6 上午11:43 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class User implements Observer {

	private String name;

	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(String msg) {
		System.out.println(name + "收到了'" + msg + "'推送消息。");
	}

}
