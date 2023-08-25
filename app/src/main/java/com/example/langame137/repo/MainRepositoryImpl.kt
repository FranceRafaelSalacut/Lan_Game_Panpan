package com.example.langame137.repo

class MainRepositoryImpl: MainRepository{

    private val words:List<String> = listOf(
        "Dionn I love you",
        "Gwapa si Dionn",
        "Dionn Loves Panpan",
        "Panpan loves Dionn",
        "Sheesh"
    )


    override fun sayHello(): String{
        return words.shuffled().last()
    }
}