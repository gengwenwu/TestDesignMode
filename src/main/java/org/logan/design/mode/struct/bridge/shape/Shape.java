package org.logan.design.mode.struct.bridge.shape;

/**
 * desc: 使用 DrawAPI 接口创建抽象类 Shape <br/>
 * time: 2018/11/18 上午11:43 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
