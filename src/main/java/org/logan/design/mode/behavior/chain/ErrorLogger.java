package org.logan.design.mode.behavior.chain;

/**
 * desc: 错误日志记录器 <br/>
 * time: 2018/11/17 下午5:03 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ErrorLogger extends AbstractLogger {

	public ErrorLogger() {
		super(LogLevel.ERROR);
	}

	@Override
	protected void write(String message) {
		System.out.println("错误日志：" + message);
	}

}
