package com.chimy.mvvmpractice.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chimy.mvvmpractice.model.QuoteModel
import com.chimy.mvvmpractice.model.QuoteProvider

class quoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}