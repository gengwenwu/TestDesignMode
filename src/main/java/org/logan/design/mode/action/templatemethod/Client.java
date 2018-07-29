package org.logan.design.mode.action.templatemethod;

/**
 * desc: 测试模版方法 <br/>
 * time: 2018/7/29 下午5:24 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		CarModel benz = new BenzCar();
		benz.run();

		CarModel bmw = new BMWCar();
		bmw.run();
	}

}
