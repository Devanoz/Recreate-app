package org.tensorflow.codelabs.objectdetection.data.network.pojo.profile

data class ProfileResponse(
	val createdAt: String? = null,
	val blocked: Boolean? = null,
	val provider: String? = null,
	val name: Any? = null,
	val id: Int? = null,
	val avatar: Avatar? = null,
	val history: History? = null,
	val confirmed: Boolean? = null,
	val email: String? = null,
	val username: String? = null,
	val updatedAt: String? = null
)

data class Formats(
	val small: Small? = null,
	val thumbnail: Thumbnail? = null,
	val large: Large? = null,
	val medium: Medium? = null
)

data class Small(
	val ext: String? = null,
	val path: Any? = null,
	val size: Any? = null,
	val mime: String? = null,
	val name: String? = null,
	val width: Int? = null,
	val url: String? = null,
	val hash: String? = null,
	val height: Int? = null
)

data class History(
	val createdAt: String? = null,
	val publishedAt: String? = null,
	val id: Int? = null,
	val updatedAt: String? = null
)

data class Medium(
	val ext: String? = null,
	val path: Any? = null,
	val size: Any? = null,
	val mime: String? = null,
	val name: String? = null,
	val width: Int? = null,
	val url: String? = null,
	val hash: String? = null,
	val height: Int? = null
)

data class Large(
	val ext: String? = null,
	val path: Any? = null,
	val size: Any? = null,
	val mime: String? = null,
	val name: String? = null,
	val width: Int? = null,
	val url: String? = null,
	val hash: String? = null,
	val height: Int? = null
)

data class Thumbnail(
	val ext: String? = null,
	val path: Any? = null,
	val size: Any? = null,
	val mime: String? = null,
	val name: String? = null,
	val width: Int? = null,
	val url: String? = null,
	val hash: String? = null,
	val height: Int? = null
)

data class Avatar(
	val ext: String? = null,
	val formats: Formats? = null,
	val previewUrl: Any? = null,
	val mime: String? = null,
	val caption: Any? = null,
	val url: String? = null,
	val createdAt: String? = null,
	val size: Any? = null,
	val provider: String? = null,
	val name: String? = null,
	val width: Int? = null,
	val providerMetadata: Any? = null,
	val id: Int? = null,
	val alternativeText: Any? = null,
	val hash: String? = null,
	val height: Int? = null,
	val updatedAt: String? = null
)

