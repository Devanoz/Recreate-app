package org.tensorflow.codelabs.objectdetection.data.network.pojo.article

data class ArticleResponse(
	val data: List<ArticleItem>,
	val meta: Meta
)

data class ArticleItem(
	val attributes: Attributes,
	val id: Int
)

data class Pagination(
	val pageCount: Int,
	val total: Int,
	val pageSize: Int,
	val page: Int
)

data class Small(
	val ext: String,
	val path: Any,
	val size: Any,
	val mime: String,
	val name: String,
	val width: Int,
	val url: String,
	val hash: String,
	val height: Int
)

data class Formats(
	val small: Small,
	val thumbnail: Thumbnail,
	val medium: Medium
)

data class Meta(
	val pagination: Pagination
)

data class Medium(
	val ext: String,
	val path: Any,
	val size: Any,
	val mime: String,
	val name: String,
	val width: Int,
	val url: String,
	val hash: String,
	val height: Int
)

data class Attributes(
	val createdAt: String,
	val image: Image,
	val publishedAt: String,
	val link: String,
	val description: String,
	val title: String,
	val labels: List<String>,
	val updatedAt: String,
	val ext: String,
	val formats: Formats,
	val previewUrl: Any,
	val mime: String,
	val caption: Any,
	val url: String,
	val size: Any,
	val provider: String,
	val name: String,
	val width: Int,
	val providerMetadata: Any,
	val alternativeText: Any,
	val hash: String,
	val height: Int
)

data class Data(
	val attributes: Attributes,
	val id: Int
)

data class Image(
	val data: Data
)

data class Thumbnail(
	val ext: String,
	val path: Any,
	val size: Any,
	val mime: String,
	val name: String,
	val width: Int,
	val url: String,
	val hash: String,
	val height: Int
)

