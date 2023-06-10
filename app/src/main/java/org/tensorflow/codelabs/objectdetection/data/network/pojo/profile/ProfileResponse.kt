package org.tensorflow.codelabs.objectdetection.data.network.pojo.profile

data class ProfileResponse(
	val createdAt: String,
	val blocked: Boolean,
	val provider: String,
	val name: Name,
	val id: Int,
	val avatar: Any,
	val confirmed: Boolean,
	val recommendations: List<Any>,
	val email: String,
	val username: String,
	val updatedAt: String
)

data class Name(
	val last: String,
	val first: String
)

