package org.logan.design.mode.behavior.command;

/**
 * desc: 添加产品需求 <br/>
 * time: 2018/8/15 下午3:58 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class AddRequirementCommand extends Command {

	@Override
	public void execute() {
		// 找到需求组
		super.rg.find();
		// 增加一份需求
		super.rg.add();
		// 页面也要增加
		super.pg.add();
		// 功能也要增加
		super.cg.add();
		// 给出计划
		super.rg.plan();

		System.out.println("");
	}

}
