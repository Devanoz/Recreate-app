package org.tensorflow.codelabs.objectdetection.data.network.pojo.login

import com.google.gson.annotations.SerializedName

data class LoginResponse(

	@field:SerializedName("jwt")
	val jwt: String,

	@field:SerializedName("user")
	val user: LoginUser
)

data class LoginUser(

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("blocked")
	val blocked: Boolean,

	@field:SerializedName("provider")
	val provider: String,

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
