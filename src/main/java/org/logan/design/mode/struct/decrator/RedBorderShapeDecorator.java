package org.logan.design.mode.struct.decrator;

/**
 * desc: 红色边框形状 (继承了ShapeDecorator装饰类)<br/>
 * time: 2018/8/12 下午12:21 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class RedBorderShapeDecorator extends ShapeDecorator {

	public RedBorderShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		super.draw();
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println("Border Color: Red");
	}

}
