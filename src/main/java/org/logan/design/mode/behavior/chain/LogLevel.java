package org.logan.design.mode.behavior.chain;

/**
 * desc: Log 级别 <br/>
 * time: 2018/11/17 下午4:44 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
enum LogLevel {

	INFO(1), DEBUG(2), ERROR(3);

	int value;

	LogLevel(int value) {
		this.value = value;
	}

}
