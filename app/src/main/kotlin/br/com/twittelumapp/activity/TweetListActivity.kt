package br.com.twittelumapp.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.twittelumapp.R
import kotlinx.android.synthetic.main.activity_tweet_list.*

class TweetListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet_list)
        val items = listOf("Primeiro tweet", "Segundo tweet")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        tweetListView.adapter = adapter

        createTweetButton.setOnClickListener {
            Snackbar.make(tweetListView, "This is a test", Snackbar.LENGTH_SHORT).show()
            val intent = Intent(this, TweetPublishActivity::class.java)
            startActivity(intent)
        }
    }

}