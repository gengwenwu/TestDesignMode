package org.logan.design.mode.behavior.chain.log;

/**
 * desc: 文件日志记录器  <br/>
 * time: 2018/11/17 下午5:05 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class FileLogger extends AbstractLogger {

	public FileLogger() {
		super(LogLevel.DEBUG);
	}

	@Override
	protected void write(String message) {
		System.out.println("文件日志：" + message);
	}

}
