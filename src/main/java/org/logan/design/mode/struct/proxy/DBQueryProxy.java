package org.logan.design.mode.struct.proxy;

/**
 * desc: 轻量级对象，替代DBQuery位置 <br/>
 * time: 2018/7/23 下午10:34 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class DBQueryProxy implements IDBQuery {

	private DBQuery realDBQuery;

	@Override
	public String request() {
		if (realDBQuery == null) {
			realDBQuery = new DBQuery();
		}

		return realDBQuery.request();
	}

}
