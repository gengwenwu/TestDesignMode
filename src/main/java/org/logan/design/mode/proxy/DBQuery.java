package org.logan.design.mode.proxy;

import java.util.concurrent.TimeUnit;

/**
 * desc: 数据库查询重量级对象 <br/>
 * time: 2018/7/23 下午10:30 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class DBQuery implements IDBQuery {

	public DBQuery() {
		try {
			// 模拟数据库连接耗时操作
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String request() {
		return "DB request string";
	}

}
