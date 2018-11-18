package org.logan.design.mode.struct.bridge;

/**
 * desc: 桥接模式-调用客户端 <br/>
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
