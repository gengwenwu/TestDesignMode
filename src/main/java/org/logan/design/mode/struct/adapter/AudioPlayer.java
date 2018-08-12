package org.logan.design.mode.struct.adapter;

/**
 * desc: 万能播放器 <br/>
 * time: 2018/8/12 上午11:03 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
		if ("mp3".equalsIgnoreCase(audioType)) {// 播放 mp3 格式
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if ("vlc".equalsIgnoreCase(audioType)
				|| "mp4".equalsIgnoreCase(audioType)) { // 支持多媒体格式
			MediaAdapter adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		} else {
			System.out.println("不支持此类型格式！");
		}

	}

}
