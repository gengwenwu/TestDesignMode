package org.logan.design.mode.behavior.iterator;

/**
 * 迭代器模式(Iterator) 调用客户端 <br/>
 * 使用场景：<br/>
 * 1，为遍历不同的聚合结构提供一个统一的接口。<br/>
 * 2，提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部实现。<br/>
 * 3，需要为聚合对象提供多种遍历方式。<br/>
 * 如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象。<br/>
 * 关键代码：定义接口：hasNext, next。<br/>
 * time: 2018/8/14 上午10:43 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		IProject project = new Project();

		// 增加星球大战项目
		project.add("星球大战项目ddddd", 10, 100000);
		// 增加扭转时空项目
		project.add("扭转时空项目", 100, 10000000);
		// 增加超人改造项目
		project.add("超人改造项目", 10000, 1000000000);

		// 这边100个项目
		for (int i = 4; i < 104; i++) {
			project.add("第" + i + "个项目", i * 5, i * 1000000);
		}

		// 遍历一下ArrayList，把所有的数据都取出
		IProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()) {
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}

	}

}