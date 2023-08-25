package com.example.langame137.presenter

import com.example.langame137.repo.MainRepository

class MainPresentor(
    view: MainContract.View,
    mainRepository: MainRepository
): MainContract.Presenter {


    private val repo: MainRepository = mainRepository
    private var view: MainContract.View? = view

    override fun onViewCreate() {
        TODO("Not yet implemented")
    }

    override fun onButtonClick(): String {
        return repo.sayHello()
    }

    override fun onDestroy() {
        view = null
    }
}