package org.logan.design.mode.behavior.state;

/**
 * desc: 定义一个电梯的接口 <br/>
 * time: 2018/8/19 下午7:46 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
abstract class LiftState {

	// 定义一个环境角色，也就是封装状态的变换引起的功能变化
	protected Context context;


	public void setContext(Context context) {
		this.context = context;
	}

	/**
	 * 打开电梯门
	 */
	public abstract void open();

	/**
	 * 关闭电梯门
	 */
	public abstract void close();

	/**
	 * 电梯运行
	 */
	public abstract void run();

	/**
	 * 关闭电梯门
	 */
	public abstract void stop();

}
