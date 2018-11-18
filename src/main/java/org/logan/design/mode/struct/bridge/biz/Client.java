package org.logan.design.mode.struct.bridge.biz;

import org.logan.design.mode.struct.bridge.biz.abstraction.HouseCorp;
import org.logan.design.mode.struct.bridge.biz.abstraction.ShanZhaiCorp;
import org.logan.design.mode.struct.bridge.biz.implementor.Clothes;
import org.logan.design.mode.struct.bridge.biz.implementor.House;

/**
 * desc: 桥接模式-调用客户端 <br/>
 * time: 2018/11/18 下午12:48 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		HouseCorp houseCorp = new HouseCorp(new House());
		houseCorp.makeMoney();
		System.out.println("======");

		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
		//ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();
	}

}