package com.example.doglist
object Data {
    data class Dog(
        val breed: String,
        val photoUrl: String,
        val description: String
    )

    val dogs = listOf(
        Dog(
            breed = "retriever",
            photoUrl = "https://images.dog.ceo/breeds/buhund-norwegian/hakon3.jpg",
            description = "A friendly and intelligent breed known for its love of retrieving and excellent family companionship."
        ),
        Dog(
            breed = "beagle",
            photoUrl = "https://images.dog.ceo/breeds/beagle/n02096585_100.jpg",
            description = "A small to medium-sized breed known for its keen sense of smell and friendly demeanor."
        ),
        Dog(
            breed = "bulldog",
            photoUrl = "https://images.dog.ceo/breeds/bulldog/n02096585_101.jpg",
            description = "A breed with a distinctive wrinkled face and muscular build. Known for its calm demeanor and loyalty."
        ),
        Dog(
            breed = "labrador",
            photoUrl = "https://images.dog.ceo/breeds/labrador/n02096585_102.jpg",
            description = "A popular family dog known for its friendly nature and versatility. Great with children and other pets."
        ),
        Dog(
            breed = "poodle",
            photoUrl = "https://images.dog.ceo/breeds/poodle/n02096585_103.jpg",
            description = "A versatile breed with a distinctive curly coat. Known for its intelligence and elegance."
        ),
        Dog(
            breed = "boxer",
            photoUrl = "https://images.dog.ceo/breeds/boxer/n02096585_104.jpg",
            description = "A medium-sized breed known for its strength and agility. Loyal and protective, making it a good family dog."
        ),
        Dog(
            breed = "pug",
            photoUrl = "https://images.dog.ceo/breeds/pug/n02096585_105.jpg",
            description = "A small breed with a distinctive wrinkled face and playful personality. Known for its affectionate nature."
        ),
        Dog(
            breed = "terrier",
            photoUrl = "https://images.dog.ceo/breeds/terrier/n02096585_106.jpg",
            description = "A group of breeds known for their energetic and feisty personalities. Good watchdogs with a strong prey drive."
        ),
        Dog(
            breed = "dachshund",
            photoUrl = "https://images.dog.ceo/breeds/dachshund/n02096585_107.jpg",
            description = "A long-bodied breed known for its playful and courageous nature despite its size."
        ),
        Dog(
            breed = "schnauzer",
            photoUrl = "https://images.dog.ceo/breeds/schnauzer/n02096585_108.jpg",
            description = "A distinctive breed known for its wiry coat and strong, independent personality."
        )
    )
}