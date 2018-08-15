package org.logan.design.mode.behavior.command;

/**
 * desc: 开发小组 <br/>
 * time: 2018/8/15 下午3:40 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class CodeGroup implements Group {

	// 客户要求代码组过去和他们谈
	@Override
	public void find() {
		System.out.println("找到代码组...");
	}

	// 客户要求增加一项功能
	@Override
	public void add() {
		System.out.println("客户要求增加一项功能...");
	}

	// 客户要求修改一项功能
	@Override
	public void change() {
		System.out.println("客户要求修改一项功能...");
	}

	// 客户要求删除一项功能
	@Override
	public void delete() {
		System.out.println("客户要求删除一项功能...");
	}

	// 客户要求出变更计划
	@Override
	public void plan() {
		System.out.println("客户要求代码变更计划...");
	}

}
