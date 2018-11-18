package org.logan.design.mode.struct.bridge.biz.implementor;

/**
 * desc: 服装产品 - 衣服 <br/>
 * time: 2018/11/18 下午12:36 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class Clothes implements IProduct {

	@Override
	public void beProducted() {
		System.out.println("生产出的衣服是这个样子的...");
	}

	@Override
	public void beSelled() {
		System.out.println("生产出的衣服卖出去了...");
	}

}
