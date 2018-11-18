package org.logan.design.mode.struct.bridge.biz.abstraction;

import org.logan.design.mode.struct.bridge.biz.implementor.IProduct;

/**
 * desc: 房地产公司 <br/>
 * time: 2018/11/18 下午12:44 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class HouseCorp extends Corp {

	public HouseCorp(IProduct product) {
		super(product);
	}

	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
