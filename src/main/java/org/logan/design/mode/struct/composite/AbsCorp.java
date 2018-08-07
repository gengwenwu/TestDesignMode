package org.logan.design.mode.struct.composite;

/**
 * desc: 抽象每个员工公有的信息 （Component角色）<br/>
 * time: 2018/8/7 上午10:39 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class AbsCorp {

	// 树枝节点的名称
	private String name = "";
	// 树枝节点的职位
	private String position = "";
	// 树枝节点的薪水
	private int salary = 0;

	// 父节点是谁
	private AbsCorp parent = null;


	public AbsCorp(String name, String position, int salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	/**
	 * 获取人员信息
	 */
	public String getInfo() {
		String info = "名称:" + this.name;
		info = info + "\t 职位:" + this.position;
		info = info + "\t 薪水: " + this.salary;
		return info;
	}

	public AbsCorp getParent() {
		return parent;
	}

	public void setParent(AbsCorp parent) {
		this.parent = parent;
	}

}
