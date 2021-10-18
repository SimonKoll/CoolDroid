package at.htl.leonding.cooldroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import at.htl.CoolDroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // old way:
    //var tvMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCoolDroid.text="New way"

        //old way:
        //tvMessage = findViewById(R.id.tvCoolDroid)
        //tvMessage?.text = "Old Way"
    }
}