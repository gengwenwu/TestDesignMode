package org.logan.design.mode.struct.bridge;

/**
 * desc: 正方形绘制器 <br/>
 * time: 2018/11/18 上午11:45 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Square extends Shape {

	// x轴
	private int x;
	// y轴
	private int y;

	protected Square(int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawSquare(x, y);
	}

}
