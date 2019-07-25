package br.com.twitterlumapp.model

import org.joda.time.LocalDate

data class Tweet(
    val text: String,
    val user: String,
    val date: LocalDate
)