package org.logan.design.mode.behavior.command;

/**
 * desc: 命令：客户要求页面 <br/>
 * time: 2018/8/15 下午3:44 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class AddPageCommand extends Command {

	@Override
	public void execute() {
		super.pg.find();

		super.pg.add();

		super.pg.plan();

		System.out.println("");
	}

}
