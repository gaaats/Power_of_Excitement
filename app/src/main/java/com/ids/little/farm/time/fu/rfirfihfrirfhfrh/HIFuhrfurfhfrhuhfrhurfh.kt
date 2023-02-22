package com.ids.little.farm.time.fu.rfirfihfrirfhfrh

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ids.little.farm.time.fu.frjfrjirf.ApiInterfaceggtgtgt
import com.ids.little.farm.time.fu.gbrffrgyfrgyrfy.NKJnfjruhrfuhrfhurfhrf
import com.ids.little.farm.time.fu.ghgthgthg.IUHFhrhhrfuhhrf
import com.ids.little.farm.time.fu.gjogtjigtgtjigt.JOIFJirjrfjjrfjirf
import com.ids.little.farm.time.fu.gtntggtngt.HIUfhrfhhfrhrfhrhfurf
import com.ids.little.farm.time.fu.sfrsrdeeded.Gygfrgygrfrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideGsongtgtgtgt(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        HIUfhrfhhfrhrfhrhfurf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <NKJnfjruhrfuhrfhurfhrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(NKJnfjruhrfuhrfhurfhrf::class.java)
    }

    single <ApiInterfaceggtgtgt> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceggtgtgt::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://powerofexcitement.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        JOIFJirjrfjjrfjirf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        IUHFhrhhrfuhhrf(get(named("HostInter")))
    }
    single{
        provideGsongtgtgtgt()
    }
    single (named("SharedPreferences")) {
        provideSharedPrefgtgtgtgt(androidApplication())
    }
}

fun provideSharedPrefgtgtgtgt(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


