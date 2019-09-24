package com.zhoujiulong.ffmpegtest

import android.content.Context
import android.graphics.PixelFormat
import android.util.AttributeSet
import android.view.SurfaceView

/**
 * Created by LC on 2017/11/8.
 */

class VideoView : SurfaceView {

    public val play = Play()

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    private fun init() {
        val holder = holder
        holder.setFormat(PixelFormat.RGBA_8888)
        play.setSurfaceView(this)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

}