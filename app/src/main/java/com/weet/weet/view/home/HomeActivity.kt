package com.weet.weet.view.home

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.weet.weet.R
import com.weet.weet.view.fragments.DashboardFragment
import com.weet.weet.view.fragments.connectionsFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {


    private val dashboardFragment = DashboardFragment()
    private val connectionsFragment = connectionsFragment()
//    private val infoFragment = InfoFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(dashboardFragment)

        bottom_navigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.ic_dashboard -> replaceFragment(dashboardFragment)
                R.id.ic_connection -> replaceFragment(connectionsFragment)
//                R.id.ic_global_network -> replaceFragment(infoFragment)
            }
            true
        }


    }

    fun sendMessage(view: View) {
        val intent = Intent(this, ConnectionDetailActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }
        startActivity(intent)
    }



    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}