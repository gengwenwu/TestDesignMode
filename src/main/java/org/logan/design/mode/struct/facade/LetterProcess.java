package org.logan.design.mode.struct.facade;

/**
 * desc: 抽象信件处理过程 <br/>
 * time: 2018/8/5 上午11:28 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
interface LetterProcess {

	//1，首先，要写信的内容
	void writeContext(String context);

	//2，其次，写信封信息(收件人、地址)
	void fillEnvelope(String address);

	//3，然后，把信放到信封里
	void letterIntoEnvelope();

	//4，最后，邮递
	void sendLetter();

}
