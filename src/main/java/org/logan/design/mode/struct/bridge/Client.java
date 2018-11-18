package org.logan.design.mode.struct.bridge;

/**
 * desc: 桥接模式-调用客户端 <br/>
 * 1，意图：桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。<br/>
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类。这两种类型的类可被结构化改变而互不影响。<br/>
 * 2，主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。 <br/>
 * 3，何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。<br/>
 * 4，如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。<br/>
 * 5，关键代码：抽象类依赖实现类。<be/>
 * 6，有点：(1)、抽象和实现的分离。 (2)、优秀的扩展能力。 (3)、实现细节对客户透明。
 * 7，缺点：桥接模式的引入会增加系统的理解与设计难度，由于聚合关联关系建立在抽象层，要求开发者针对抽象进行设计与编程。
 * time: 2018/11/18 上午11:53 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		Shape redSquare = new Square(1, 2, new RedSquare());
		redSquare.draw();

		Shape greenSquare = new Square(11, 22, new GreenSquare());
		greenSquare.draw();
	}

}
