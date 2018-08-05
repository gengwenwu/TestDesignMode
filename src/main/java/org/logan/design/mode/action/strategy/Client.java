package org.logan.design.mode.action.strategy;

/**
 * desc: 策略模式调用客户端 <br/>
 * time: 2018/8/5 下午12:27 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		Context context = new Context(new StrategyAdd());
		context.operate(1, 2);

		context = new Context(new StrategyMultiply());
		context.operate(1, 2);

		context = new Context(new StrategySubstract());
		context.operate(1, 2);
	}

}
