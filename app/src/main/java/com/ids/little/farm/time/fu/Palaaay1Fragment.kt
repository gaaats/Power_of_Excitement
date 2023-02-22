package com.ids.little.farm.time.fu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.ids.little.farm.time.fu.databinding.FragmentPalaaay1Binding


class Palaaay1Fragment : Fragment() {
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

    private var fragmentStart4Binding: FragmentPalaaay1Binding? = null
    private val binding
        get() = fragmentStart4Binding ?: throw RuntimeException("FragmentPalaaay1Binding = null")


    private val jgtijogtoihyioi by lazy {
        listOf(
            binding.imgGameElem1,
            binding.imgGameElem2,
            binding.imgGameElem3,
            binding.imgGameElem4,
            binding.imgGameElem5,
            binding.imgGameElem6,
            binding.imgGameElem7,
            binding.imgGameElem8,
            binding.imgGameElem10,
            binding.imgGameElem11,
            binding.imgGameElem12,
        )
    }

    private fun hyjhyjojhyjihy() {
        jgtijogtoihyioi.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        togthgthhgt()
    }

    private fun togthgthhgt() {
        findNavController().navigate(R.id.action_palaaay1Fragment_to_palaaayayay2Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentStart4Binding = FragmentPalaaay1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            gtigtoihigtji()

            gttggtjgtjjgtjigt()

            ggtjjgtjoigtigtjiogtjigtjiogt()

            binding.imgGameElem4.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                hyjhyjojhyjihy()
            }

            tgiojgtgtjgtigtj()

            ugtgthgtigthigthgt()

            ijojgtijgtjgtjigt()



        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun gttggtjgtjjgtjigt() {
        binding.imgGameElem2.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem3.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ggtjjgtjoigtigtjiogtjigtjiogt() {
        binding.imgGameElem10.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem11.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem12.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ugtgthgtigthigthgt() {
        binding.imgGameElem6.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }

        binding.imgGameElem7.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun ijojgtijgtjgtjigt() {
        binding.imgGameElem8.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun tgiojgtgtjgtigtj() {
        binding.imgGameElem5.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }

    private fun gtigtoihigtji() {
        binding.imgGameElem1.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hyjhyjojhyjihy()
        }
    }
}