package org.logan.design.mode.struct.bridge.biz.abstraction;

import org.logan.design.mode.struct.bridge.biz.implementor.IProduct;

/**
 * desc: 山寨公司 <br/>
 * time: 2018/11/18 下午12:46 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
public class ShanZhaiCorp extends Corp {

	public ShanZhaiCorp(IProduct product) {
		super(product);
	}

	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("山寨我赚钱呀...");
	}

}
