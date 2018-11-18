package org.logan.design.mode.struct.bridge.biz.implementor;

/**
 * desc: 电子产品 - ipod <br/>
 * time: 2018/11/18 下午12:37 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class IPod implements IProduct {

	@Override
	public void beProducted() {
		System.out.println("生产出的iPod是这个样子的...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的iPod卖出去了...");
	}

}
