package org.logan.design.mode.creator.builder;

/**
 * desc: builder模式调用客户端 <br/>
 * time: 2018/8/5 上午10:08 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Clint {

	public static void main(String[] args) {
		Student logan = new Student.Builder(1, "Logan")
				.sex("男")
				.address("杭州").build();
		System.out.println(logan);

		Student mcRate = new Student.Builder(2, "mcRate")
				.sex("男")
				.build();
		System.out.println(mcRate);
	}

}
