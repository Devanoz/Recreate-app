package org.tensorflow.codelabs.objectdetection.data.network.pojo.register

import com.google.gson.annotations.SerializedName

data class RegisterResponse(

	@field:SerializedName("jwt")
	val jwt: String,

	@field:SerializedName("user")
	val user: User
)

data class User(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("blocked")
	val blocked: Boolean,

	@field:SerializedName("provider")
	val provider: String,

	@field:SerializedName("name")
	val name: Any,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("confirmed")
	val confirmed: Boolean,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("username")
	val username: String,

	@field:SerializedName("updatedAt")
	val updatedAt: String
)
