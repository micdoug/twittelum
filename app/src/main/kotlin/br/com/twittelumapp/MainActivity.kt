package br.com.twittelumapp;

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import br.com.twittelumapp.activity.TweetListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        publishButton.setOnClickListener(this::clickPublish)
    }

    private fun clickPublish(view: View) {
        hideKeyboard()
        Toast.makeText(baseContext, editTweet.text, Toast.LENGTH_LONG).show()
        val intent = Intent(this, TweetListActivity::class.java)
        startActivity(intent)
    }

}