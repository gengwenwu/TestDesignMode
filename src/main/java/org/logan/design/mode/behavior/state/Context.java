package org.logan.design.mode.behavior.state;

/**
 * desc: 环境上下文，这个例子是电梯几种状态 <br/>
 * time: 2018/8/19 下午7:46 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Context {

	// 定义出所有的电梯状态
	public final static OpenningState openningState = new OpenningState();
	public final static ClosingState closingState = new ClosingState();
	public final static RunningState runningState = new RunningState();
	public final static StoppingState stoppingState = new StoppingState();

	//  当前电梯状态
	private LiftState currentLiftState;


	public LiftState getCurrentLiftState() {
		return currentLiftState;
	}

	public void setCurrentLiftState(LiftState currentLiftState) {
		this.currentLiftState = currentLiftState;
		this.currentLiftState.setContext(this);
	}

	//==============
	public void open() {
		this.currentLiftState.open();
	}

	public void close() {
		this.currentLiftState.close();
	}

	public void run() {
		this.currentLiftState.run();
	}

	public void stop() {
		this.currentLiftState.stop();
	}

}
