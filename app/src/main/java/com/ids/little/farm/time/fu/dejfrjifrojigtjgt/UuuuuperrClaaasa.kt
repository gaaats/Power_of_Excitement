package com.ids.little.farm.time.fu.dejfrjifrojigtjgt

import android.app.Application
import android.content.Context
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.bgngtjgtjgtjigt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.bngjgtitghgtg
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.instIdgttg
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.vfbrfgfrgrfgrfgyrfgy
import com.ids.little.farm.time.fu.rfirfihfrirfhfrh.hhy5hy595hy95hy
import com.ids.little.farm.time.fu.rfirfihfrirfhfrh.bgbgnhhy5995uj5ju
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class UuuuuperrClaaasa:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val vfvgffvbbgbg = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val gthgtiuhtghuh = MyTracker.getTrackerParams()
        val gntntggtgtijgtgt = MyTracker.getTrackerConfig()
        val instIDgtgtgt = MyTracker.getInstanceId(this)
        gntntggtgtijgtgt.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            gthgtiuhtghuh.setCustomUserId(IDINgtgtgt)
            vfvgffvbbgbg.edit().putString(bgngtjgtjgtjigt, IDINgtgtgt).apply()
            vfvgffvbbgbg.edit().putString(instIdgttg, instIDgtgtgt).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gth5yhyhy5hy = vfvgffvbbgbg.getString(bgngtjgtjgtjigt, IDINgtgtgt)
            gthgtiuhtghuh.setCustomUserId(gth5yhyhy5hy)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@UuuuuperrClaaasa)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }

}