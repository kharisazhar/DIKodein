package com.simalakama.kharisazhar.dikodein.ui.quotes

import androidx.lifecycle.ViewModel
import com.simalakama.kharisazhar.dikodein.data.model.Quote
import com.simalakama.kharisazhar.dikodein.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel(){

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuote()
}