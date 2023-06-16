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




data class History(
	val createdAt: String? = null,
	val publishedAt: String? = null,
	val id: Int? = null,
	val updatedAt: String? = null
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

