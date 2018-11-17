package org.logan.design.mode.behavior.chain;

/**
 * desc: 日志记录器核心类 <br/>
 * time: 2018/11/17 下午4:42 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class AbstractLogger {

	/**
	 * 日志级别
	 */
	private LogLevel level;
	/**
	 * 责任链下一个元素
	 */
	protected AbstractLogger nextLogger;


	public AbstractLogger(LogLevel level) {
		this.level = level;
	}

	/**
	 * 写日志
	 */
	protected abstract void write(String message);


	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void log(LogLevel level, String message) {
		if (this.level.value <= level.value) {
			write(message);
		}

		if (nextLogger != null) {
			nextLogger.log(level, message);
		}
	}

}
