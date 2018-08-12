package org.logan.design.mode.struct.adapter;

/**
 * desc: Mp4 格式播放器 <br/>
 * time: 2018/8/12 上午11:00 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
