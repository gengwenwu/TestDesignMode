package org.logan.design.mode.behavior.command;

/**
 * desc: 命令：为新增加的页面添加代码  <br/>
 * time: 2018/8/15 下午3:46 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class AddCodeCommand extends Command {

	@Override
	public void execute() {
		super.cg.find();

		super.cg.add();

		super.cg.plan();

		// 可以执行其它内容...
		
		System.out.println("");
	}

}
