package org.logan.design.mode.struct.facade;

/**
 * desc: 实现信件处理过程 <br/>
 * time: 2018/8/5 上午11:30 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class LetterProcessImpl implements LetterProcess {

	@Override
	public void writeContext(String context) {
		System.out.println("填写信件内容：" + context);
	}

	@Override
	public void fillEnvelope(String address) {
		System.out.println("填写收件人信息：" + address);
	}

	@Override
	public void letterIntoEnvelope() {
		System.out.println("将信放入信封。");
	}

	@Override
	public void sendLetter() {
		System.out.println("邮递信件 ---->");
	}

}
