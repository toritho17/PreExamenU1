package mx.edu.itesca.preexamenu1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

//Variables
var gc:Double = 0.0
var gf:Double = 0.0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)
        val btnC: Button = findViewById(R.id.btnC)
        val btnF: Button = findViewById(R.id.btnF)

        btnC.setOnClickListener(){
            gf = etF.text.toString().toDouble()
            gf = (gf-32)/1.8
            etC.setText(gf.toString())
        }

        btnF.setOnClickListener(){
            gc = etC.text.toString().toDouble()
            gc = (gc * 1.8+32)
            etF.setText(gc.toString())
        }
    }

}