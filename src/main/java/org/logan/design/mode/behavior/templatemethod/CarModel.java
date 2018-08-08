package org.logan.design.mode.behavior.templatemethod;

/**
 * desc: 汽车模型 <br/>
 * time: 2018/7/29 下午4:56 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class CarModel {

	/**
	 * 汽车启动
	 */
	public abstract void start();

	/**
	 * 汽车鸣笛
	 */
	public abstract void alarm();

	/**
	 * 汽车停止
	 */
	public abstract void stop();

	/**
	 * 汽车行驶过程
	 */
	public void run() {
		start();
		alarm();
		stop();
	}

}
