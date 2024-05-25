package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.core.view.ViewCompat
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Set the content view to your XML layout
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main)){
//            val systemBars =
//        }

        val num1 = binding.num1EditText.text
        val num2 = binding.num2EditText.text


        binding.addBtn.setOnClickListener {
        val sum = num1.toString().toDouble() + num2.toString().toDouble()
            binding.resultTextView.text = "The addition of $num1 & $num2 is $sum"
        }

        binding.minusBtn.setOnClickListener {
        val minus = num1.toString().toDouble() - num2.toString().toDouble()
            binding.resultTextView.text = "The substract of $num1 & $num2 is $minus"
        }

        binding.prodBtn.setOnClickListener {
            val prod = num1.toString().toDouble() * num2.toString().toDouble()
            binding.resultTextView.text = "The multiplication of $num1 & $num2 is $prod"
        }

        binding.divBtn.setOnClickListener {
            val div = num1.toString().toDouble() / num2.toString().toDouble()
            binding.resultTextView.text = "The division of $num1 & $num2 is $div"
        }
    }
}
