package org.logan.design.mode.proxy;

/**
 * desc: 测试代理模式<br/>
 * 代理模式常用使用场景如下：
 * 1，安全原因。需要屏蔽客户端直接访问真实对象，或者屏蔽远程方法调用的技术细节（如RMI）。<br/>
 * 2，提升性能。对真实对象进行封装，从而达到延迟加载的目的。 <br/>
 * time: 2018/7/23 下午10:37 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class TestMain {

	public static void main(String[] args) {
		// 使用代理
		IDBQuery dbQuery = new DBQueryProxy();
		// 在真正使用的时候才创建真实对象
		String content = dbQuery.request();
		System.out.println(content);
	}

}
