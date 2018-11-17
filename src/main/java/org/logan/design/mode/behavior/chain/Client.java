package org.logan.design.mode.behavior.chain;

/**
 * desc: 责任链模式 (Chain of Responsibility) - 调用客户端 <br/>
 * 责任链模式的核心：<br/>
 * 责任链模式屏蔽了请求的处理过程，你发起一个请求到底是谁处理的，这个你不用关心，
 * 只要你把请求抛给责任链的第一个处理者，最终会返回一个处理结果(当然也可以不做任何处理)，
 * 作为请求者可以不用知道到底是需要谁来处理的。<br/>
 * <p>
 * 缺点是大家在开发的时候要注意:调试不是很方便，特􏰂是链条比较长，环节比较多的时候，
 * 由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
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
