package com.oceanbrasil.ocean_a6_22_06_20

data class GitHubRepositoriesResult(
    val items: List<Repository>
)

data class Repository(
    val id: Int,
    val name: String,
    val full_name: String
)

/*
Desafio:

Adicionar propriedade da classe owner na classe Repository
Criação da classe owner, com os dados que achar relevante

URL da API: https://api.github.com/repositories
Verbo: GET
*/