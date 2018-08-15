package org.logan.design.mode.behavior.command;

/**
 * desc: 项目组 <br/>
 * time: 2018/8/15 下午3:32 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
interface Group {

	// 查找项目组
	void find();

	// 被要求增加功能
	void add();

	// 被要求删除功能
	void delete();

	// 被要求修改功能
	void change();

	// 被要求给出所有的变更计划
	void plan();

}
