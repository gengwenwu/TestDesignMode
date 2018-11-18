package org.logan.design.mode.struct.bridge;

/**
 * desc: 绿色正方形 <br/>
 * time: 2018/11/18 上午11:42 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class GreenSquare implements DrawAPI {

	@Override
	public void drawSquare(int x, int y) {
		System.out.println("green square draw："
				+ "，x：" + x + "，y：" + y);
	}

}
