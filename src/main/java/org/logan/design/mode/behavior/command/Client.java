package org.logan.design.mode.behavior.command;

/**
 * 命令模式(Command) 调用客户端 <br/>
 * time: 2018/8/15 下午3:06 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		//定义我们的接头人
		Invoker invoker = new Invoker();

		// 客户要求添加页面
		Command command = new AddPageCommand();
		executeCommand(invoker, command);

		// 添加代码
		command = new AddCodeCommand();
		executeCommand(invoker, command);

		// 添加新需求
		command = new AddRequirementCommand();
		executeCommand(invoker, command);

		// 添加其它命令....
	}

	private static void executeCommand(Invoker invoker, Command command) {
		//接头人接收到命令
		invoker.setCommand(command);
		//接头人执行命令
		invoker.action();
	}

}
