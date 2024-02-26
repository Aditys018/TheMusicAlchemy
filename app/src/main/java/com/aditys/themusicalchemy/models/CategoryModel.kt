package com.aditys.themusicalchemy.models

data class CategoryModel(
    val name: String,
    val coverUrl: String,
) {
    constructor() : this("", "")
}
