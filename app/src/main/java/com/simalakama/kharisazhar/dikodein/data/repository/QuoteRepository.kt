package com.simalakama.kharisazhar.dikodein.data.repository

import androidx.lifecycle.LiveData
import com.simalakama.kharisazhar.dikodein.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}