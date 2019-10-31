package dev.olog.shrine.utils

import androidx.constraintlayout.motion.widget.MotionLayout

interface MotionLayoutTransitionListener : MotionLayout.TransitionListener {
    override fun onTransitionTrigger(view: MotionLayout, triggerId: Int, positive: Boolean, progress: Float) {

    }

    override fun onTransitionStarted(view: MotionLayout, startId: Int, endId: Int) {

    }

    override fun onTransitionChange(view: MotionLayout, startId: Int, endId: Int, progress: Float) {

    }

    override fun onTransitionCompleted(view: MotionLayout, currentId: Int) {

    }
}