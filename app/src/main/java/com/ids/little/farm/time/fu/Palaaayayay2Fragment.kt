package com.ids.little.farm.time.fu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.ids.little.farm.time.fu.databinding.FragmentPalaaay1Binding
import com.ids.little.farm.time.fu.databinding.FragmentPalaaayayay2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Palaaayayay2Fragment : Fragment() {
    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentStart4Binding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentStart4Binding: FragmentPalaaayayay2Binding? = null
    private val binding
        get() = fragmentStart4Binding ?: throw RuntimeException("FragmentPalaaayayay2Binding = null")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart4Binding = FragmentPalaaayayay2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launch {
                delay(2000)
                findNavController().navigate(R.id.action_palaaayayay2Fragment_to_palaaay1Fragment)
            }




        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }


}