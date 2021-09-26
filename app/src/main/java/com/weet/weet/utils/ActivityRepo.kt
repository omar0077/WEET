package com.weet.weet.utils

import android.content.Context
import android.content.Intent
import com.weet.weet.view.login.LoginActivity
import com.weet.weet.view.getStarted.GetStartedActivity

object ActivityRepo {

    /**
     * @param context
     *
     * The following method starts the
     * GetStarted Activity.
     */
    fun startGetStartedActivity(context: Context) {
        context.startActivity(Intent(context, GetStartedActivity::class.java))
    }

    fun startLogin(context: Context) {
        context.startActivity(Intent(context, LoginActivity::class.java))
    }



}