package com.cjj.kotlindemo.bo

/**
 * Created by chenjiajuan on 2018/4/12.
 */

data class BookDetail(
		val count: Int,
		val start: Int,
		val total: Int,
		val books: List<Book>
)

data class Book(
		val rating: Rating,
		val subtitle: String,
		val author: List<String>,
		val pubdate: String,
		val tags: List<Tag>,
		val origin_title: String,
		val image: String,
		val binding: String,
		val translator: List<String>,
		val catalog: String,
		val pages: String,
		val images: Images,
		val alt: String,
		val id: String,
		val publisher: String,
		val isbn10: String,
		val isbn13: String,
		val title: String,
		val url: String,
		val alt_title: String,
		val author_intro: String,
		val summary: String,
		val series: Series,
		val price: String
)

data class Rating(
		val max: Int,
		val numRaters: Int,
		val average: String,
		val min: Int
)

data class Images(
		val small: String,
		val large: String,
		val medium: String
)

data class Tag(
		val count: Int,
		val name: String,
		val title: String
)

data class Series(
		val id: String,
		val title: String
)