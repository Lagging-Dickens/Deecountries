package com.safari.deecountries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if(Ke_box.isChecked)textresult.text="Kenya: Correct Answer"
        if (Tz_box.isChecked)textresult.text="Tanzania: Wrong Answer"
        if (Ug_box.isChecked)textresult.text="Uganda: Wrong Answer"
    }
    fun onCheck(view:View){
        if (yesradio.isChecked)result2.text="Yes, I'm a certified developer"
        if (noradio.isChecked)result2.text="No, I'm not a certified developer"
        if (nsradio.isChecked)result2.text="I'm not quite sure"
    }
}