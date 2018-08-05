package org.logan.design.mode.struct.facade;

/**
 * desc: 警察 <br/>
 * time: 2018/8/5 上午11:41 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Police {

	/**
	 * 是否安全邮件
	 *
	 * @param context 邮件内容
	 * @return true：安全
	 */
	public boolean isSafeLetter(String context) {
		if (context.contains("枪支")) {
			return false;
		} else if (context.contains("炸弹")) {
			return false;
		}

		return true;
	}

}
