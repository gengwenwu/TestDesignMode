package org.logan.design.mode.struct.decrator;

/**
 * desc: Shape装饰者(具体功能职责划分) <br/>
 * time: 2018/8/12 下午12:19 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ShapeDecorator implements Shape {

	// 关键：Decorator的属性里必然有一个变量指向 Component，这里即：decoratedShape
	protected Shape decoratedShape;

	public ShapeDecorator(Shape shape) {
		this.decoratedShape = shape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
