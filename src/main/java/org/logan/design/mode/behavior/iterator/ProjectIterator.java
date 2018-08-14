package org.logan.design.mode.behavior.iterator;

import java.util.ArrayList;

/**
 * desc: 项目迭代器实现类 <br/>
 * time: 2018/8/14 上午11:02 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ProjectIterator implements IProjectIterator {

	// 所有的项目都放在这里ArrayList中
	private ArrayList<IProject> projectList = new ArrayList<IProject>();
	// 当前位置
	private int currentItem = 0;


	public ProjectIterator(ArrayList<IProject> projectList) {
		this.projectList = projectList;
	}


	@Override
	public boolean hasNext() {
		return this.currentItem < projectList.size() &&
				this.projectList.get(this.currentItem) != null;
	}

	@Override
	public IProject next() {
		return projectList.get(currentItem++);
	}

}
