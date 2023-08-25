package com.example.langame137.view

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.langame137.databinding.ActivityMainBinding
import com.example.langame137.presenter.MainContract
import com.example.langame137.presenter.MainPresentor
import com.example.langame137.repo.MainRepositoryImpl

class MainActivity : AppCompatActivity(), MainContract.View{

    private lateinit var activityBind: ActivityMainBinding
    private lateinit var presentor: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityBind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBind.root)

        setPresenter(
            MainPresentor(this, MainRepositoryImpl())
        )

        activityBind.button.setOnClickListener{
            Log.d("this", "Press me! ")
            initializeViews(presentor.onButtonClick())
        }

    }

    override fun setPresenter(Presenter: MainContract.Presenter) {
        this.presentor = Presenter
    }

    override fun initializeViews(w: String) {
        activityBind.textView.text = w
    }
}