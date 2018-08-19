package org.logan.design.mode.behavior.state;

/**
 * desc: 状态模式调用客户端  <br/>
 * 什么是状态模式呢?当一个对象内在状态改变时允许其改变行为，这个对象看起来像是改变了其类。<br/>
 * 优点：<br/>
 * 1, 避免了过多的switch...case 或者 if..else 语句的使用。<br/>
 * 2, 很好的使用体现了开闭原则和单一职责原则，每个状态都是一个子类，增加状态就增加子类。修改状态，只修改一个子类就可以了。<br/>
 * 3, 封装性非常好，状态变换放置到了类的内部来实现，外部的调用不用知道类内部如何实现状态和行为的变换。 <br/>
 * 缺点：<br/>
 * 1, 子类太多，不好管理。一般建议不超过5个。<br/>
 * <p>
 * 状态模式使用于当某个对象在它的状态发生改变时，它的行为也随着发生比较大的变化，也就是说行 为是受状态约束的情况下可以使用状态模式
 * </p>
 * time: 2018/8/19 下午8:16 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		/* 模拟电梯的动作 */
		Context context = new Context();
		context.setCurrentLiftState(Context.closingState);

		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
