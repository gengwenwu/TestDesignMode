package org.logan.design.mode.behavior.chain;

/**
 * desc: 控制台日志记录器 <br/>
 * time: 2018/11/17 下午4:58 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger() {
		super(LogLevel.INFO);
	}

	@Override
	protected void write(String message) {
		System.out.println("控制台日志：" + message);
	}

}
