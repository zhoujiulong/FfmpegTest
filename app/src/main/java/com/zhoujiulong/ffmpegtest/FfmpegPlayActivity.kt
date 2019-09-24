package com.zhoujiulong.ffmpegtest

import android.os.Bundle
import android.os.Environment
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_ffmpeg_play.*
import java.io.File

class FfmpegPlayActivity : AppCompatActivity() {

    private val file = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "input.mp4")
    private val mp3 = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "output.pcm")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ffmpeg_play)

        if (!file.exists()) {
            Toast.makeText(this, "视频文件不存在", Toast.LENGTH_LONG).show()
        }
        if (!mp3.exists()) {
            Toast.makeText(this, "音频文件不存在", Toast.LENGTH_LONG).show()
        }

        play.setOnClickListener {
            videoView.play.playJava(file.absolutePath)
        }
        stop_play.setOnClickListener {
            videoView.play.stop()
        }

        play_audio.setOnClickListener {
            FfmpegNative.playMusis(mp3.absolutePath)
        }
        stop_audio.setOnClickListener {
            FfmpegNative.stopMusic()
        }
    }

}