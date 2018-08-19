package org.logan.design.mode.behavior.state;

/**
 * desc: 在电梯门开启的状态下能做什么事情 <br/>
 * time: 2018/8/19 下午7:51 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class OpenningState extends LiftState {

	@Override
	public void open() {
		System.out.println("电梯门开启...");
	}

	@Override
	public void close() {
		super.context.setCurrentLiftState(Context.closingState);
		context.getCurrentLiftState().close();
	}

	@Override
	public void run() {
		// do nothing
	}

	@Override
	public void stop() {
		// do nothing
	}

}
