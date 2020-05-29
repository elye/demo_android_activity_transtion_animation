package com.elyeproj.androidanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        overridePendingTransition(R.anim.enter_activity, R.anim.exit_activity)
    }

    override fun finish() {
        super.finish()
//        overridePendingTransition(R.anim.enter_activity, R.anim.exit_activity)
    }
}
