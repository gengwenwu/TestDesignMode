package org.logan.design.mode.struct.facade;

/**
 * desc: 现代化邮局服务 <br/>
 * time: 2018/8/5 上午11:34 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ModenPostOffice {

	private LetterProcess letterProcess;
	private Police police;

	public ModenPostOffice() {
		this.letterProcess = new LetterProcessImpl();
		this.police = new Police();
	}

	/**
	 * 邮递邮件
	 *
	 * @param address 收件人地址
	 * @param context 邮件内容
	 */
	public void sendLetter(String address, String context) {
		letterProcess.writeContext(context);
		letterProcess.fillEnvelope(address);

		// 警方介入
		//if (police.isSafeLetter(context)) {
		letterProcess.letterIntoEnvelope();
		letterProcess.sendLetter();
		//} else {
		//	System.out.println("危险信件，暂停邮递！");
		//}

	}

}
