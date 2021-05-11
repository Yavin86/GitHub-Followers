package com.test.gitsubs.data.api.entities

import com.squareup.moshi.Json

/**
 * This is API model. It should be used only in request context
 */
// TODO mark it internal or smth. Then rename it
data class FollowerApiModel(
    @Json(name = "id")
    var id: String,
    @Json(name = "login")
    var login: String,
    @Json(name = "avatar_url")
    var avatar_url: String
)