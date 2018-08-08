package org.logan.design.mode.behavior.strategy;

/**
 * desc: 策略使用环境类 <br/>
 * time: 2018/8/5 下午12:24 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Context {

	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate(int num1, int num2) {
		strategy.operate(num1, num2);
	}

}
