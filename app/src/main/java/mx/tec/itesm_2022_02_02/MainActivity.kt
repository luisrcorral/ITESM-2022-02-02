package mx.tec.itesm_2022_02_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTmpTxt: String

        val myButton : Button = findViewById(R.id.button)
        val myEditText : EditText = findViewById(R.id.editText1)
        val myTextView : TextView = findViewById(R.id.txtView)

        myButton.setOnClickListener {

            myTmpTxt = myEditText.text.toString()
            myTextView.text = myTmpTxt

            val myIntent = Intent(this, TargetActivity::class.java)

            myIntent.putExtra("keyString", "Example")
            myIntent.putExtra("keyBoolean", true)
            myIntent.putExtra("keyInt", 12345)
            myIntent.putExtra("keyFloat", 1234.5678)

            startActivity(myIntent)
        }

    }
}