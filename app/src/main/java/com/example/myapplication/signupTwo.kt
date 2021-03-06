package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.view.Gravity
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//作成者：綾部，小島，井口

class signupTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup2)


        //キャンセルボタン
        val cancelButton : Button = findViewById(R.id.cancelButton)

        //ログイン画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }


        //追加・追加済ボタンの作成
        val addButton1 : ImageButton = findViewById(R.id.addButton1)
        val addedButton1 : ImageButton = findViewById(R.id.addedButton1)

        val addButton2 : ImageButton = findViewById(R.id.addButton2)
        val addedButton2 : ImageButton = findViewById(R.id.addedButton2)

        val addButton3 : ImageButton = findViewById(R.id.addButton3)
        val addedButton3 : ImageButton = findViewById(R.id.addedButton3)

        val addButton4 : ImageButton = findViewById(R.id.addButton4)
        val addedButton4 : ImageButton = findViewById(R.id.addedButton4)

        val addButton5 : ImageButton = findViewById(R.id.addButton5)
        val addedButton5 : ImageButton = findViewById(R.id.addedButton5)

        val addButton6 : ImageButton = findViewById(R.id.addButton6)
        val addedButton6 : ImageButton = findViewById(R.id.addedButton6)

        val addButton7 : ImageButton = findViewById(R.id.addButton7)
        val addedButton7 : ImageButton = findViewById(R.id.addedButton7)

//        val addButton8 : ImageButton = findViewById(R.id.addButton8)
//        val addedButton8 : ImageButton = findViewById(R.id.addedButton8)
//
//        val addButton9 : ImageButton = findViewById(R.id.addButton9)
//        val addedButton9 : ImageButton = findViewById(R.id.addedButton9)
//
//        val addButton10 : ImageButton = findViewById(R.id.addButton10)
//        val addedButton10 : ImageButton = findViewById(R.id.addedButton10)

        //登録済キーワードを格納する配列
        val favKeyword: ArrayList<String> = ArrayList()

        //ボタンの動き
        //INVISIBLE:隠す　VISIBLE:出す

        var count : Int
        count = 0

        //追加ボタン1の動き
        addButton1.setOnClickListener{
            addButton1.visibility = View.INVISIBLE
            addedButton1.visibility = View.VISIBLE
            count++
            favKeyword.add("テイクアウト")

        }
        //追加済ボタン1の動き
        addedButton1.setOnClickListener{
            addedButton1.visibility = View.INVISIBLE
            addButton1.visibility = View.VISIBLE
            count--
            favKeyword.remove("テイクアウト")
        }

        //追加ボタン2の動き
        addButton2.setOnClickListener{
            addButton2.visibility = View.INVISIBLE
            addedButton2.visibility = View.VISIBLE
            count++
            favKeyword.add("スイーツ")
        }
        //追加済ボタン2の動き
        addedButton2.setOnClickListener{
            addedButton2.visibility = View.INVISIBLE
            addButton2.visibility = View.VISIBLE
            count--
            favKeyword.remove("スイーツ")
        }

        //追加ボタン3の動き
        addButton3.setOnClickListener{
            addButton3.visibility = View.INVISIBLE
            addedButton3.visibility = View.VISIBLE
            count++
            favKeyword.add("ドリンク")
        }
        //追加済ボタン3の動き
        addedButton3.setOnClickListener{
            addedButton3.visibility = View.INVISIBLE
            addButton3.visibility = View.VISIBLE
            count--
            favKeyword.remove("ドリンク")
        }

        //追加ボタン4の動き
        addButton4.setOnClickListener{
            addButton4.visibility = View.INVISIBLE
            addedButton4.visibility = View.VISIBLE
            count++
            favKeyword.add("カフェ")
        }
        //追加済ボタン4の動き
        addedButton4.setOnClickListener{
            addedButton4.visibility = View.INVISIBLE
            addButton4.visibility = View.VISIBLE
            count--
            favKeyword.remove("カフェ")
        }

        //追加ボタン5の動き
        addButton5.setOnClickListener{
            addButton5.visibility = View.INVISIBLE
            addedButton5.visibility = View.VISIBLE
            count++
            favKeyword.add("手土産")
        }
        //追加済ボタン5の動き
        addedButton5.setOnClickListener{
            addedButton5.visibility = View.INVISIBLE
            addButton5.visibility = View.VISIBLE
            count--
            favKeyword.remove("手土産")
        }

        //追加ボタン6の動き
        addButton6.setOnClickListener{
            addButton6.visibility = View.INVISIBLE
            addedButton6.visibility = View.VISIBLE
            count++
            favKeyword.add("創作料理")
        }
        //追加済ボタン6の動き
        addedButton6.setOnClickListener{
            addedButton6.visibility = View.INVISIBLE
            addButton6.visibility = View.VISIBLE
            count--
            favKeyword.remove("創作料理")
        }

        //追加ボタン7の動き
        addButton7.setOnClickListener{
            addButton7.visibility = View.INVISIBLE
            addedButton7.visibility = View.VISIBLE
            count++
            favKeyword.add("居酒屋")
        }
        //追加済ボタン7の動き
        addedButton7.setOnClickListener{
            addedButton7.visibility = View.INVISIBLE
            addButton7.visibility = View.VISIBLE
            count--
            favKeyword.remove("居酒屋")
        }

//        //追加ボタン8の動き
//        addButton8.setOnClickListener{
//            addButton8.visibility = View.INVISIBLE
//            addedButton8.visibility = View.VISIBLE
//            count++
//            favKeyword.add("芸術")
//        }
//        //追加済ボタン8の動き
//        addedButton8.setOnClickListener{
//            addedButton8.visibility = View.INVISIBLE
//            addButton8.visibility = View.VISIBLE
//            count--
//            favKeyword.remove("芸術")
//        }
//
//        //追加ボタン9の動き
//        addButton9.setOnClickListener{
//            addButton9.visibility = View.INVISIBLE
//            addedButton9.visibility = View.VISIBLE
//            count++
//            favKeyword.add("パン")
//        }
//        //追加済ボタン9の動き
//        addedButton9.setOnClickListener{
//            addedButton9.visibility = View.INVISIBLE
//            addButton9.visibility = View.VISIBLE
//            count--
//            favKeyword.remove("パン")
//        }
//
//        //追加ボタン10の動き
//        addButton10.setOnClickListener{
//            addButton10.visibility = View.INVISIBLE
//            addedButton10.visibility = View.VISIBLE
//            count++
//            favKeyword.add("果物")
//        }
//        //追加済ボタン10の動き
//        addedButton10.setOnClickListener{
//            addedButton10.visibility = View.INVISIBLE
//            addButton10.visibility = View.VISIBLE
//            count--
//            favKeyword.remove("果物")
//        }

        //次へボタン
        val nextButton : Button = findViewById(R.id.nextButton)
        //値の受け取り
        val textId = intent.getStringExtra("idKey")
        val textPasswordEdit = intent.getStringExtra("passwordKey")
        val textYearEdit = intent.getStringExtra("yearKey")
        val textMonthEdit = intent.getStringExtra("monthKey")
        val textDayEdit = intent.getStringExtra("dayKey")

        //新規登録画面3に遷移
        nextButton.setOnClickListener {
            if (count >= 1) {
                val intent = Intent(this, signupThree::class.java)
                //値の引き渡し
                intent.putExtra("idKey", textId.toString())
                intent.putExtra("passwordKey", textPasswordEdit.toString())
                intent.putExtra("yearKey", textYearEdit.toString())
                intent.putExtra("monthKey", textMonthEdit.toString())
                intent.putExtra("dayKey", textDayEdit.toString())
                intent.putStringArrayListExtra("favKeyList", favKeyword)
                startActivity(intent)
            }
        }
    }
}