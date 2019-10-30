package dev.olog.shrine

sealed class Product {

    data class Header(
        val name: String
    ) : Product()

    data class Actual(
        val name: String
    ) : Product()

}