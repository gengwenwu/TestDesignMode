package org.logan.design.mode.struct.adapter;

/**
 * desc: adapter模式 调用客户端 <br/>
 * time: 2018/8/12 上午11:22 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Client {

	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();

		player.play("mp3", "beyond the horizon.mp3");
		player.play("mp4", "alone.mp4");
		player.play("vlc", "far far away.vlc");
		player.play("avi", "mind me.avi");
	}

}
