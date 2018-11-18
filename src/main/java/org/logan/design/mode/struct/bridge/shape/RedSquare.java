package org.logan.design.mode.struct.bridge.shape;

/**
 * desc: 红色正方形 <br/>
 * time: 2018/11/18 上午11:38 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class RedSquare implements DrawAPI {

	@Override
	public void drawSquare(int x, int y) {
		System.out.println("red square draw："
				+ "，x：" + x + "，y：" + y);
	}

}
