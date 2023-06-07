package org.tensorflow.codelabs.objectdetection.api.pojo.login

import com.google.gson.annotations.SerializedName

data class LoginErrorResponse(

	@field:SerializedName("data")
	val data: Any? = null,

	@field:SerializedName("error")
	val error: Error? = null
)

data class Error(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("details")
	val details: Details? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)

data class Details(
	val any: Any? = null
)
