package org.logan.design.mode.behavior.state;

/**
 * desc: 在停止状态下能做什么事情 <br/>
 * time: 2018/8/19 下午7:53 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class StoppingState extends LiftState {

	@Override
	public void open() {
		super.context.setCurrentLiftState(Context.openningState);
		super.context.getCurrentLiftState().open();
	}

	@Override
	public void close() {
		//do nothing; 电梯门已经关闭了
	}

	@Override
	public void run() {
		super.context.setCurrentLiftState(Context.runningState);
		super.context.getCurrentLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("电梯停止了...");
	}

}
