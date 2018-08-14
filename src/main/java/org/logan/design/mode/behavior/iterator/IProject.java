package org.logan.design.mode.behavior.iterator;

/**
 * desc: 所有的项目都是这接口 <br/>
 * time: 2018/8/14 上午10:44 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
interface IProject {

	// 增加项目
	void add(String name, int num, int cost);

	// 从老板这里看到的就是项目信息
	String getProjectInfo();

	// 获得一个可以被遍历的对象
	IProjectIterator iterator();

}
