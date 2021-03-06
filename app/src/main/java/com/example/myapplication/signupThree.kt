package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Button
import android.widget.TextView
import android.widget.ListView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import java.util.ArrayList

//作成者：綾部，井口，久保田

class signupThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup3)

        //値の受け取り
        val textPasswordEdit = intent.getStringExtra("passwordKey")
        val textYearEdit = intent.getStringExtra("yearKey")
        val textMonthEdit = intent.getStringExtra("monthKey")
        val textDayEdit = intent.getStringExtra("dayKey")
        val textId = intent.getStringExtra("idKey")
        //登録されたキーワードが入ったリスト
        val favKeywordList: kotlin.collections.List<String> =
            ArrayList(intent.getStringArrayListExtra("favKeyList"))

        //TexiViewの上書き表示
        //ID
        val idText = findViewById<TextView>(R.id.ID_edit_signupText) as TextView
        idText.text = "  " + textId

        //パスワード
        val passText = findViewById<View>(R.id.password_edit_signupText) as TextView
        //入力された文字数分だけ●表示
        //6~8文字しか想定してないです
        if (textPasswordEdit != null) {
            when (textPasswordEdit.length) {
                6 -> {
                    passText.text = "  ●●●●●●"
                }
                7 -> {
                    passText.text = "  ●●●●●●●"
                }
                8 -> {
                    passText.text = "  ●●●●●●●●"
                }else -> {
                passText.text = "範囲外です！"
                }
            }
        }
        //生年月日
        val birthText =  findViewById<View>(R.id.birthday_edit_signupText) as TextView
        birthText.text = "  " + textYearEdit + "年" + textMonthEdit + "月" + textDayEdit + "日"


        //キーワード
            // xmlにて実装したListViewの取得
            val favKeywordView = findViewById<ListView>(R.id.favKeywordText)
            // ArrayAdapterの生成
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, favKeywordList)
            // ListViewに、生成したAdapterを設定
            favKeywordView.adapter = adapter


        //完了ボタン
        val completeButton: Button = findViewById(R.id.okButton)

//       //完了ボタンが押されたら
//    completeButton.setOnClickListener {
//             val intent = Intent(this, mypageScreen::class.java)
//               if (checkBoxState[0].equals(1)) {
//                  startActivity(intent)
//                }
//           }

        //ユーザ登録完了ポップアップ
        completeButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("利用規約に同意しますか")

                .setPositiveButton("同意する"){ dialog, which ->
                    AlertDialog.Builder(this)
                        .setTitle("登録完了!")
                        .setMessage("ログインしてみましょう")

                        .setPositiveButton("OK"){ dialog, which ->
                            val intent = Intent(this,loginScreen::class.java)
                            startActivity(intent)
                        }
                        .show()

                }
                .setNegativeButton("同意しない") { dialog, which ->
                }

                .show()

        }


        //キャンセルボタン
        val cancelButton : Button = findViewById(R.id.cancelButton)

        //ログイン画面に遷移
        cancelButton.setOnClickListener {
            val intent = Intent(this,loginScreen::class.java)
            startActivity(intent)
        }

    }


    var checkBoxState = arrayOf(0)
    //チェックボックスが押されたら
    fun onCheckboxClicked(view: View) {
            if (view is CheckBox) {
                var checked: Boolean = view.isChecked
                when (view.id) {
                    R.id.checkbox -> {
                        if (checked) {
                            checkBoxState[0] = 1
                        } else {
                            checkBoxState[0] = 0
                        }
                    }
                }
            }
        }


}