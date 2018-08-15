package org.logan.design.mode.behavior.command;

/**
 * desc: 美工组 <br/>
 * time: 2018/8/15 下午3:36 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class PageGroup implements Group {

	// 请求美工组支持
	@Override
	public void find() {
		System.out.println("找到美工组...");
	}

	// 美工被要求增加一个页面
	@Override
	public void add() {
		System.out.println("客户要求增加一个页面...");
	}

	// 客户要求对现有界面做修改
	@Override
	public void change() {
		System.out.println("客户要求修改一个页面...");
	}

	// 甲方是老大，要求删除一些页面
	@Override
	public void delete() {
		System.out.println("客户要求删除一个页面...");
	}

	@Override
	public void plan() {
		System.out.println("客户要求页面变更计划...");
	}

}
