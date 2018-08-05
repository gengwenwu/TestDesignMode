package org.logan.design.mode.action.strategy;

/**
 * desc: 策略：减法 <br/>
 * time: 2018/8/5 下午12:21 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class StrategySubstract implements IStrategy {

	@Override
	public void operate(int num1, int num2) {
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	}

}
