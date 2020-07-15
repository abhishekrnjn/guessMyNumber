package com.example.guessmynumber

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var question : TextView? = findViewById(R.id.questions_textview)
        question?.text = resources.getString(R.string.number_five)
        num =5
    }


    fun downArrow(view: View){
        var question : TextView? = findViewById(R.id.questions_textview)
        if(num == 5){
            question?.text = resources.getString(R.string.number_three)
            num =3
        }
        else if(num ==3){
            question?.text = resources.getString(R.string.number_one)
            num =1
        }
        else if(num == 7){
            question?.text = resources.getString(R.string.number_six)
            num = 6
        }
        else if(num ==9){
            question?.text = resources.getString(R.string.number_eight)
            num =8
        }
    }

    fun upArrow(view: View){
        var question : TextView? = findViewById(R.id.questions_textview)
        if(num ==5){
            question?.text = resources.getString(R.string.number_seven)
            num = 7
        }

        else if(num==7){
            question?.text = resources.getString(R.string.number_nine)
            num =9
        }

        else if(num ==9){
            question?.text = resources.getString(R.string.number_ten)
            num =10
        }
        else if(num ==3){
            question?.text = resources.getString(R.string.number_four)
            num =4
        }
        else if(num ==1){
            question?.text = resources.getString(R.string.number_two)
            num =2
        }
    }

    fun successFunction(view: View){
        success_text_view.visibility = View.VISIBLE
        questions_textview.visibility = View.INVISIBLE
        guessed_number_text.text = String.format(resources.getString(R.string.guessed_number),num)
        guessed_number_text.visibility = View.VISIBLE
    }

    fun reset(view: View){
        var question : TextView? = findViewById(R.id.questions_textview)
        questions_textview.visibility = View.VISIBLE
        success_text_view.visibility = View.INVISIBLE
        guessed_number_text.visibility = View.INVISIBLE
        question?.text = resources.getString(R.string.number_five)
        num = 5

    }

}
