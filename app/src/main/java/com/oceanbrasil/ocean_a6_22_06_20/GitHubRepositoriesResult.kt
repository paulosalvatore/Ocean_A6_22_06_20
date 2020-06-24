package com.oceanbrasil.ocean_a6_22_06_20

data class GitHubRepositoriesResult(
    val items: List<Repository>
)

data class Repository(
    val id: Int,
    val name: String,
    val full_name: String,
    val description: String,
    val owner: Owner,
    val html_url: String
)

data class Owner(
    val id: Int,
    val login: String,
    val avatar_url: String,
    val html_url: String
)
