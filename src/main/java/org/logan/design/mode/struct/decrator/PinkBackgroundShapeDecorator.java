package org.logan.design.mode.struct.decrator;

/**
 * desc: 粉色背景形状装饰者 <br/>
 * time: 2018/8/12 下午12:50 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class PinkBackgroundShapeDecorator extends ShapeDecorator {

	public PinkBackgroundShapeDecorator(Shape shape) {
		super(shape);
	}

	@Override
	public void draw() {
		super.draw();
		setPinkBackground(decoratedShape);
	}

	private void setPinkBackground(Shape decoratedShape) {
		System.out.println("Background Color: Pink");
	}
}
