package com.simalakama.kharisazhar.dikodein.data.db

import androidx.lifecycle.LiveData
import com.simalakama.kharisazhar.dikodein.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuote():LiveData<List<Quote>>
}