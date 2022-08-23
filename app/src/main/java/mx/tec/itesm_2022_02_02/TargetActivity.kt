package mx.tec.itesm_2022_02_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myString : String

        val receivedInt : Int
        val receivedString : String
        val receivedFloat : Float
        val receivedBoolean : Boolean

        val extras = intent.extras

        receivedString = extras?.getString("keyString")?:"NOTHING"
        receivedInt = extras?.getInt("keyInt")?:-1
        receivedBoolean = extras?.getBoolean("keyBoolean")?:false
        receivedFloat = extras?.getFloat("keyFloat")?:-1.1f

        myString = "These are the values received: Int = $receivedInt ; String = $receivedString; Float = $receivedFloat; Boolean = $receivedBoolean"

        val txtView : TextView = findViewById<TextView>(R.id.textView2)
        txtView.text = myString

    }
}