package com.simalakama.kharisazhar.dikodein.data.repository

import androidx.lifecycle.LiveData
import com.simalakama.kharisazhar.dikodein.data.db.QuoteDao
import com.simalakama.kharisazhar.dikodein.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuote() = quoteDao.getQuote()
}