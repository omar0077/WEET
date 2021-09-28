package com.weet.weet.view.profile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.provider.MediaStore
import android.text.Editable
import android.text.method.LinkMovementMethod
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.squareup.picasso.Picasso
import com.weet.weet.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    private lateinit var firstName: String
    private lateinit var lastName: String
    private lateinit var email: String
    private lateinit var profileUrl: String

    lateinit var imageView: CircleImageView
    lateinit var button: FloatingActionButton
    private val pickImage = 100
    private var imageUri: Uri? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_details)


        imageView = findViewById(R.id.profile_image)
        button = findViewById(R.id.floatingActionButton)
        button.setOnClickListener {
            val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
            startActivityForResult(gallery, pickImage)
        }

        textView_link.setMovementMethod(LinkMovementMethod.getInstance())

        profileUrl = intent.getStringExtra("linkedin_profile_pic_url")
        firstName = intent.getStringExtra("linkedin_first_name")
        lastName = intent.getStringExtra("linkedin_last_name")
        email = intent.getStringExtra("linkedin_email")
        val fName = findViewById<EditText>(R.id.first_name)
        val lName = findViewById<EditText>(R.id.last_name)
        val mail = findViewById<EditText>(R.id.email)
        var profileImage = findViewById<ImageView>(R.id.profile_image)
        fName.text = firstName.toEditable()
        lName.text = lastName.toEditable()
        mail.text = email.toEditable()
        Picasso.get().load(profileUrl).into(profileImage);
    }

    fun String.toEditable(): Editable =  Editable.Factory.getInstance().newEditable(this)

    fun sendMessage(view: View) {
        val intent = Intent(this, PersonalizeProfile::class.java).apply {
            putExtra(EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        }
    }

}