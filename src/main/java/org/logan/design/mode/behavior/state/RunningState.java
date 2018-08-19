package org.logan.design.mode.behavior.state;

/**
 * desc: 电梯在运行状态下能做哪些动作 <br/>
 * time: 2018/8/19 下午7:53 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class RunningState extends LiftState {

	@Override
	public void open() {
		// do nothing
	}

	@Override
	public void close() {
		// do nothing
	}

	@Override
	public void run() {
		System.out.println("电梯上下跑...");
	}

	@Override
	public void stop() {
		super.context.setCurrentLiftState(Context.stoppingState);
		super.context.getCurrentLiftState().run();
	}
}
