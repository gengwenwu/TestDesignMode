package org.logan.design.mode.action.templatemethod;

/**
 * desc: 宝马车 <br/>
 * time: 2018/7/29 下午5:23 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class BMWCar extends CarModel {

	public BMWCar() {
		System.out.println("\r\n制造了一辆宝马车");
	}

	@Override
	public void start() {
		System.out.println("虹膜启动");
	}

	@Override
	public void alarm() {
		System.out.println("自动鸣笛");
	}

	@Override
	public void stop() {
		System.out.println("自动熄火");
	}

}
