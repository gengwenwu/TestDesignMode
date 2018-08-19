package org.logan.design.mode.behavior.state;

/**
 * desc: 电梯在关闭状态下能做哪些动作 <br/>
 * time: 2018/8/19 下午7:52 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class ClosingState extends LiftState {

	@Override
	public void open() {
		super.context.setCurrentLiftState(Context.openningState);
		super.context.getCurrentLiftState().open();
	}

	@Override
	public void close() {
		System.out.println("电梯门关闭...");
	}

	@Override
	public void run() {
		super.context.setCurrentLiftState(Context.runningState);
		super.context.getCurrentLiftState().run();
	}

	@Override
	public void stop() {
		super.context.setCurrentLiftState(Context.stoppingState);
		super.context.getCurrentLiftState().stop();
	}

}
