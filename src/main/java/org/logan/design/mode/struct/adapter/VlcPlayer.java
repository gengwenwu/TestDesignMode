package org.logan.design.mode.struct.adapter;

/**
 * desc: Vlc 格式播放器 <br/>
 * time: 2018/8/12 上午11:00 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}

}
