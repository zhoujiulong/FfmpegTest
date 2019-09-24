package com.zhoujiulong.ffmpegtest

import android.Manifest.permission.*
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(
                arrayOf(
                    WRITE_EXTERNAL_STORAGE,
                    RECORD_AUDIO,
                    READ_EXTERNAL_STORAGE
                ), 5
            )
        }

        bt_to_play_activity.setOnClickListener {
            startActivity(Intent(this, FfmpegPlayActivity::class.java))
        }

        bt_urlprotocolinfo.setOnClickListener {
            tv_msg.text = FfmpegNative.urlprotocolinfo()
        }
        bt_avformatinfo.setOnClickListener {
            tv_msg.text = FfmpegNative.avformatinfo()
        }
        bt_avcodecinfo.setOnClickListener {
            tv_msg.text = FfmpegNative.avcodecinfo()
        }
        bt_avfilterinfo.setOnClickListener {
            tv_msg.text = FfmpegNative.avfilterinfo()
        }
    }


}
