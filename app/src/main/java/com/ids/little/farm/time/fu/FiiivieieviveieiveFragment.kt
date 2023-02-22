package com.ids.little.farm.time.fu

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.bgngtjgtjgtjigt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.bngjgthgthtghgt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.bnyojijhyjjhyhy
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.codeCodegtgt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.gtgthtghgthugt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.gthgthugtuugthugt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.gtitghugt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.gtntgngtnjgtnj
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.instIdgttg
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.gthyhjyhyjuuj
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.nhyjiohyiohy5
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.onegtgt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.ghyhy9555
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.trolologttggt
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.vbfbbrfgfrggrffr
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.vbfbfrrfhrfhfrhfrfr
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.vfbhbfryurfgrfrf
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiivieieviveieiveFragment : Fragment() {


    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    override fun onStart() {
        super.onStart()


        val gtgtgt: String? = shareP.getString(instIdgttg, null)
        val bgnbnbgnbguhbghg = shareP.getString("deepSt", null)
        val hjoihhfrfrgfrrg = shareP.getString(codeCodegtgt, null)
        val hihfhgtgthgt = shareP.getString(nhyjiohyiohy5, null)
        val vbffrygfrrfgrfg = shareP.getString(bngjgthgthtghgt, null)
        val gjgtojgt = shareP.getString(gtgthtghgthugt, null)
        val gthgtigthgthgt = bnyojijhyjjhyhy
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val cdvdetfedfedffedfed = shareP.getString(bgngtjgtjgtjigt, null)
        val gthutguhugthgtgtgt = shareP.getString("appCamp", null)
        val bngngughgthugt = shareP.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, VeeevvvbroovovvActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GaaaammtmtmmymymyActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        rfhihfrhrfhfrhrfhihrf()

        shareP.edit().putString(gtntgngtnjgtnj, afIdhyhyhy).apply()

        val gngnufhhth = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val cdvedtdeffdeed = "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val vbyrfgrfrfg = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"
        val bmgjhyjhyjojihy = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"

        when(hihfhgtgthgt) {
            "1" ->
                if(gthutguhugthgtgtgt!="null") {
                    shareP.edit().putString(gtitghugt, gngnufhhth).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (bgnbnbgnbguhbghg!=null||hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
            "0" ->
                if(bgnbnbgnbguhbghg!=null) {
                    shareP.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
        }
    }

    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiivieieviveieive, container, false)
    }

}