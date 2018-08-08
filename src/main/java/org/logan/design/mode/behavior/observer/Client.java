package org.logan.design.mode.behavior.observer;

/**
 * desc: 观察者模式调用客户端 <br/>
 * time: 2018/8/6 上午11:46 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		WeChatServer server = new WeChatServer();

		Observer logan = new User("Logan");
		server.registerObserver(logan);
		server.registerObserver(new User("Nice"));
		server.registerObserver(new User("mcRate"));

		server.setInformation("Hello World!");

		System.out.println("=========");

		server.removeObserver(logan);
		server.setInformation("HaHa!");
	}

}
