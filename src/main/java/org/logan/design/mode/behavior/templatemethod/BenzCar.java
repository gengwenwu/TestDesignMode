package org.logan.design.mode.behavior.templatemethod;

/**
 * desc: 奔驰车 <br/>
 * time: 2018/7/29 下午5:21 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class BenzCar extends CarModel {

	public BenzCar() {
		System.out.println("制造了一辆奔驰车");
	}

	@Override
	public void start() {
		System.out.println("一键启动");
	}

	@Override
	public void alarm() {
		System.out.println("清脆的笛声");
	}

	@Override
	public void stop() {
		System.out.println("熄火了");
	}

}
