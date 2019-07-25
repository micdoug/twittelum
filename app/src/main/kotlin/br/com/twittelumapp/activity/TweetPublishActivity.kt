package br.com.twittelumapp.activity;

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.com.twittelumapp.R
import br.com.twitterlumapp.model.Tweet
import kotlinx.android.synthetic.main.activity_tweet_publish.*
import org.joda.time.LocalDate

class TweetPublishActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweet_publish)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_tweet, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.saveMenuItem -> { clickPublish() }
            android.R.id.home -> { finish() }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun clickPublish() {
        hideKeyboard()
        if (editTweet.text.isBlank()) {
            Snackbar.make(rootLayout, R.string.tweetRequireText, Snackbar.LENGTH_LONG).show()
        } else {
            val tweet = Tweet(editTweet.text.toString(), "Michael", LocalDate.now())
            Toast.makeText(baseContext, "$tweet", Toast.LENGTH_LONG).show()
            Log.i("tweet", tweet.toString())
            finish()
        }
    }

}