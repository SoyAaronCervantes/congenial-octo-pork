package com.soyaaroncervantes.fragmentdiploma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import com.google.android.material.button.MaterialButton
import com.soyaaroncervantes.fragmentdiploma.fragments.BlueFragment
import com.soyaaroncervantes.fragmentdiploma.fragments.RedFragment

class MainActivity : AppCompatActivity() {

  lateinit var blueFragment: BlueFragment
  lateinit var redFragment: RedFragment

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    blueFragment = BlueFragment()
    redFragment = RedFragment()


    val fragmentManager = supportFragmentManager.beginTransaction()
    fragmentManager.replace( R.id.container, redFragment )
    fragmentManager.commit()

  }

  fun clickHandler(view: View) {
    val fragmentManager = supportFragmentManager.beginTransaction()

    if ( view.id == R.id.goToRedFragment ) {
      fragmentManager.replace( R.id.container, redFragment )
    } else {
      fragmentManager.replace( R.id.container, blueFragment )
    }

    fragmentManager.commit()

  }

}