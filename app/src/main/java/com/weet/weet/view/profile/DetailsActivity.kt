package com.weet.weet.view.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.text.Editable
import android.text.method.LinkMovementMethod
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import com.weet.weet.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var firstName: String
    private lateinit var lastName: String
    private lateinit var email: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_details)

        textView_link.setMovementMethod(LinkMovementMethod.getInstance())

        firstName = intent.getStringExtra("linkedin_first_name")
        lastName = intent.getStringExtra("linkedin_last_name")
        email = intent.getStringExtra("linkedin_email")
        val fName = findViewById<EditText>(R.id.first_name)
        val lName = findViewById<EditText>(R.id.last_name)
        val mail = findViewById<EditText>(R.id.email)
        fName.text = firstName.toEditable()
        lName.text = lastName.toEditable()
        mail.text = email.toEditable()
    }

    fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)

    fun sendMessage(view: View) {
        val intent = Intent(this, PersonalizeProfile::class.java).apply {
            putExtra(EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }



}