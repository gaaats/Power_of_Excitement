package com.ids.little.farm.time.fu

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ids.little.farm.time.fu.gtntggtngt.HIUfhrfhhfrhrfhrhfurf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FirrriritititistFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_firrriritititist, container, false)
    }

    private lateinit var hyhyhyhy: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rhhfrhfrhrfgyfrygfrg()

    }

    private fun rhhfrhfrhrfgyfrygfrg() {
        ghgthigtitihgt()
    }

    private fun ghgthigtitihgt() {
        hgtihgthigthgt()
    }

    private fun hgtihgthigthgt() {
        findNavController().navigate(R.id.action_firrriritititistFragment_to_seeecococndddFragment)
    }
}