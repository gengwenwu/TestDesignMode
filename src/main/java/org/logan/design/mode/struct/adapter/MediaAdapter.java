package org.logan.design.mode.struct.adapter;

/**
 * desc: Media播放器 适配器，通过继承或依赖（推荐）接入其它方式代码 <br/>
 * time: 2018/8/12 上午11:12 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer mediaPlayer;//使用了依赖方式，接入其它播放方式

	public MediaAdapter(String audioType) {
		if ("vlc".equalsIgnoreCase(audioType)) {
			mediaPlayer = new VlcPlayer();
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			mediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if ("vlc".equalsIgnoreCase(audioType)) {
			mediaPlayer.playVlc(fileName);
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			mediaPlayer.playMp4(fileName);
		}
	}

}
