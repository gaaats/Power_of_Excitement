package com.ids.little.farm.time.fu

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ids.little.farm.time.fu.gtjigtjiotgjitg.HIUHFhrrfhfrhufr.nhyjiohyiohy5
import com.ids.little.farm.time.fu.gtntggtngt.HIUfhrfhhfrhrfhrhfurf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FoouururruurFragment : Fragment() {

    val gthgtgthuggt by activityViewModel<HIUfhrfhhfrhrfhrhfurf>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgthigthgthugt: String
    private lateinit var mContextgtgtgt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_foouururruur, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val g5t955gt595gt = sharePgtgtgt.getString(nhyjiohyiohy5, null)
        val hyhyhyhyhy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hyhyhyhyhy == null) {
            gthgtgthuggt.gtthyhyhy(mContextgtgtgt)
            gthgtgthuggt.appsData.observe(viewLifecycleOwner) {
                if (it != null) {
                    gtgthigthgthugt = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gtgthigthgthugt).apply()
                    findNavController().navigate(R.id.action_foouururruurFragment_to_fiiivieieviveieiveFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_foouururruurFragment_to_fiiivieieviveieiveFragment)
        }
    }


}