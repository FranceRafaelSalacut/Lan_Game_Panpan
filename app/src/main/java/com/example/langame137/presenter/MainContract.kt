package com.example.langame137.presenter

import com.example.langame137.view.BaseView

interface MainContract {

    interface Presenter: BasePresenter{
        fun onViewCreate()
        fun onButtonClick(): String
    }

    interface View: BaseView<Presenter>{
        fun initializeViews(w: String)
    }
}