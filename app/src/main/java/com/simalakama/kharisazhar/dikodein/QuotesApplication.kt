package com.simalakama.kharisazhar.dikodein

import android.app.Application
import com.simalakama.kharisazhar.dikodein.data.db.Database
import com.simalakama.kharisazhar.dikodein.data.db.DatabaseFakeImpl
import com.simalakama.kharisazhar.dikodein.data.db.QuoteDao
import com.simalakama.kharisazhar.dikodein.data.db.QuoteDaoFakeImpl
import com.simalakama.kharisazhar.dikodein.data.repository.QuoteRepository
import com.simalakama.kharisazhar.dikodein.data.repository.QuoteRepositoryImpl
import com.simalakama.kharisazhar.dikodein.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication : Application(), KodeinAware{
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}