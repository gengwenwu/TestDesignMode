package org.logan.design.mode.struct.decrator;

/**
 * desc: 装饰者 调用客户端 <br/>
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。<br/>
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。<br/>
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。<br/>
 * 继承是静态的给类增加功能，而装饰模式则是动态的给增加功能。<br/>
 * time: 2018/8/12 下午12:33 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		System.out.println("");

		Shape redCircle = new RedBorderShapeDecorator(new Circle());
		redCircle.draw();
		System.out.println("");

		Shape redRectangle = new RedBorderShapeDecorator(new Rectangle());
		Shape beautifulShape = new PinkBackgroundShapeDecorator(redRectangle);
		beautifulShape.draw();
	}

}
