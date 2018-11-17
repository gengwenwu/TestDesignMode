package org.logan.design.mode.behavior.chain;

/**
 * desc: 责任链模式 (Chain of Responsibility) - 调用客户端 <br/>
 * time: 2018/11/17 下午4:43 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.log(LogLevel.INFO, "an information.");
		System.out.println("=====");
		loggerChain.log(LogLevel.DEBUG, "an debug level information.");
		System.out.println("=====");
		loggerChain.log(LogLevel.ERROR, "an error information");

	}

	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger();
		AbstractLogger fileLogger = new FileLogger();
		AbstractLogger consoleLogger = new ConsoleLogger();

		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

}
