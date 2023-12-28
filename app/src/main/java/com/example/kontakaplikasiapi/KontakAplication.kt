package com.example.kontakaplikasiapi

import android.app.Application
import com.example.kontakaplikasiapi.repository.AppContainer
import com.example.kontakaplikasiapi.repository.KontakContainer

class KontakAplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain depedencies */
    lateinit var container: AppContainer

    override fun onCreate(){
        super.onCreate()
        container = KontakContainer()
    }
}