package org.logan.design.mode.struct.composite;

import java.util.ArrayList;

/**
 * desc: 组合模式(也叫合成模式) 调用客户端 <br/>
 * time: 2018/8/7 上午10:20 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		// 首先是组装一个组织结构出来
		Branch ceo = compositeCorpTree();

		// 然后把CEO的信息打印出来
		System.out.println(ceo.getInfo());

		// 最后打印所有员工信息
		System.out.println(getTreeInfo(ceo));
	}

	/**
	 * 组装一个组织结构
	 */
	private static Branch compositeCorpTree() {
		// 首先产生了一个根节点
		// 注意：这里的声明是具体的Branch，非接口，在面向接口编程上是很不恰当的。这是组合模式缺陷之一。
		Branch ceo = new Branch("王大麻子", "总经理", 100000);

		// 产生三个部门经理，也就是树枝节点
		Branch developDep = new Branch("刘一", "研发部门经理", 10000);
		Branch salesDep = new Branch("马二", "销售部门经理", 20000);
		Branch financeDep = new Branch("赵三", "财务部经理", 30000);

		// 再把三个小组长产生出来
		Branch firstDevGroup = new Branch("杨四", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("吴六", "开发二组组长", 6000);

		//剩下的及时我们这些小兵了,就是路人甲，路人乙
		Leaf a = new Leaf("a", "开发人员", 2000);
		Leaf b = new Leaf("b", "开发人员", 2000);
		Leaf c = new Leaf("c", "开发人员", 2000);
		Leaf d = new Leaf("d", "开发人员", 2000);
		Leaf e = new Leaf("e", "开发人员", 2000);
		Leaf f = new Leaf("f", "开发人员", 2000);
		Leaf g = new Leaf("g", "开发人员", 2000);
		Leaf h = new Leaf("h", "销售人员", 5000);
		Leaf i = new Leaf("i", "销售人员", 4000);
		Leaf j = new Leaf("j", "财务人员", 5000);
		Leaf k = new Leaf("k", "CEO秘书", 8000);
		Leaf zhengLaoQi = new Leaf("郑老七", "研发部副总", 20000);


		// 该产生的人都产生出来了，然后我们怎么组装这棵树
		// 首先是定义总经理下有三个部门经理
		ceo.addSubordinate(developDep);
		ceo.addSubordinate(salesDep);
		ceo.addSubordinate(financeDep);

		// 总经理下还有一个秘书
		ceo.addSubordinate(k);

		// 定义研发部门下的结构
		{
			developDep.addSubordinate(firstDevGroup);
			developDep.addSubordinate(secondDevGroup);
			// 研发部经理下还有一个副总
			developDep.addSubordinate(zhengLaoQi);

			// 看看开发两个开发小组下有什么
			firstDevGroup.addSubordinate(a);
			firstDevGroup.addSubordinate(b);
			firstDevGroup.addSubordinate(c);
			secondDevGroup.addSubordinate(d);
			secondDevGroup.addSubordinate(e);
			secondDevGroup.addSubordinate(f);
		}


		// 再看销售部下的人员情况
		{
			salesDep.addSubordinate(g);
			salesDep.addSubordinate(h);
			salesDep.addSubordinate(i);
		}

		// 最后一个财务
		{
			financeDep.addSubordinate(j);
		}

		return ceo;
	}

	/**
	 * 递归树数据
	 */
	private static String getTreeInfo(Branch root) {
		ArrayList<AbsCorp> subordinateList = root.getSubordinateInfo();
		String info = "";


		for (AbsCorp corp : subordinateList) {
			if (corp instanceof Leaf) {
				info = info + corp.getInfo() + "\n";
			} else if (corp instanceof Branch) {
				info = info + corp.getInfo() + "\n" + getTreeInfo((Branch) corp);
			}
		}

		return info;
	}

}
