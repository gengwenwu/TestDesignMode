package org.logan.design.mode.struct.facade;

/**
 * desc: facade模式调用客户端 <br/>
 * time: 2018/8/5 上午11:37 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		ModenPostOffice office = new ModenPostOffice();

		String address = "浙江省杭州市江干区";
		String context = "妈妈喊你回家吃饭啦！^_^";
		office.sendLetter(address, context);

		System.out.println("");

		String address2 = "俄罗斯车臣";
		String context2 = "枪支交易...";
		office.sendLetter(address2, context2);
	}


}
