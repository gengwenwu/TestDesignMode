package org.logan.design.mode.behavior.command;

/**
 * desc: 命令的抽象类，我们把客户发出的命令定义成一个一个的对象 <br/>
 * time: 2018/8/15 下午3:42 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class Command {

	protected RequirementGroup rg = new RequirementGroup();
	protected PageGroup pg = new PageGroup();
	protected CodeGroup cg = new CodeGroup();


	public abstract void execute();

}
