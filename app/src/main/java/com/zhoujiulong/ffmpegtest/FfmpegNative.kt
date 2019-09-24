package com.zhoujiulong.ffmpegtest

import android.view.Surface


object FfmpegNative {

    external fun urlprotocolinfo(): String
    external fun avformatinfo(): String
    external fun avcodecinfo(): String
    external fun avfilterinfo(): String

    external fun play(input: String, surface: Surface)
    external fun stopPlay()

    external fun playMusis(soundPath: String)
    external fun stopMusic()

    init {
        System.loadLibrary("native-lib")
    }


}