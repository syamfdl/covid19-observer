package me.syamfdl.covidobserver.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager

import me.syamfdl.covidobserver.R
import me.syamfdl.covidobserver.adapter.RecapAdapter
import me.syamfdl.covidobserver.data.Recap
import me.syamfdl.covidobserver.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        val listRecap = listOf(
            Recap("Total Positif", 1.681964),
            Recap("Total Sembuh", 374.509),
            Recap("Total Meninggal", 102.026)
        )

        val recapAdapter = RecapAdapter(listRecap)
        val recyclerView = binding.rvRecap

        recyclerView.apply {
            this.adapter = recapAdapter
            this.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        }


        return binding.root
    }

}
