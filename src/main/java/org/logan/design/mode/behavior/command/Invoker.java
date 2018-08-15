package org.logan.design.mode.behavior.command;

/**
 * desc: 接头人的职责就是接收命令，并执行 <br/>
 * time: 2018/8/15 下午3:47 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Invoker {

	private Command command;

	// 接收客户发出的命令
	public void setCommand(Command command) {
		this.command = command;
	}

	// 执行客户的命令
	public void action() {
		this.command.execute();
	}

}
