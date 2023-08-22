package com.chimy.mvvmpractice.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chimy.mvvmpractice.data.model.QuoteModel
import com.chimy.mvvmpractice.data.model.QuoteProvider

class quoteViewModel: ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}