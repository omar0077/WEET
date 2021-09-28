package com.weet.weet.view.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.core.view.children
import com.google.android.material.chip.Chip
import com.weet.weet.R
import com.weet.weet.view.home.HomeActivity
import kotlinx.android.synthetic.main.activity_option_tags.*
import kotlinx.serialization.PrimitiveKind

class OptionTagsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_option_tags)

//        tags.children.forEach {
//            (it as Chip).setOnCheckedChangeListener { buttonView, isChecked ->
//                handleSelection()
//            }
//        }
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, HomeActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }
//    private fun handleSelection(){
//        var mutableList1 = mutableListOf<String>()
//
//        textView.text = "Checked Chips : "
//        tags.checkedChipIds.forEach{
//            val chip = findViewById<Chip>(it)
//            mutableList1.add(chip.text.toString())
////            textView.append("\n${chip.text}")
//            textView.append(mutableList1[0])
//        }
//    }


}