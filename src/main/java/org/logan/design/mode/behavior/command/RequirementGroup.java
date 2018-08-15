package org.logan.design.mode.behavior.command;

/**
 * desc: 产品组 <br/>
 * time: 2018/8/15 下午3:34 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class RequirementGroup implements Group {

	// 请求产品支持
	@Override
	public void find() {
		System.out.println("找到需求组...");
	}

	// 客户要求增加一项需求
	@Override
	public void add() {
		System.out.println("客户要求增加一项需求...");
	}

	// 客户要求修改一项需求
	@Override
	public void change() {
		System.out.println("客户要求修改一项需求...");
	}

	// 客户要求删除一项需求
	@Override
	public void delete() {
		System.out.println("客户要求删除一项需求...");
	}

	// 客户要求出变更计划
	@Override
	public void plan() {
		System.out.println("客户要求需求变更计划...");
	}

}
