package org.logan.design.mode.struct.composite;

import java.util.ArrayList;

/**
 * desc:  树枝节点 （Composite角色，本例子中是：各个部门经理和小弟的角色) <br/>
 * time: 2018/8/7 上午10:15 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Branch extends AbsCorp {

	// 存储子节点的信息
	private ArrayList<AbsCorp> subordinateList = new ArrayList<AbsCorp>(5);


	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}


	public void addSubordinate(AbsCorp corp) {
		corp.setParent(this); // 设置父节点
		subordinateList.add(corp);
	}

	public ArrayList<AbsCorp> getSubordinateInfo() {
		return subordinateList;
	}


}
