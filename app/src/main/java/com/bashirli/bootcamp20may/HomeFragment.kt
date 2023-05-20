package com.bashirli.bootcamp20may

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.bashirli.bootcamp20may.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
        private  var _binding:FragmentHomeBinding?=null
    private val binding get()=_binding!!

    private val adapter=HomeAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup(){
        setRV()

        val list= arrayListOf<CountryModel>()
        val c1=CountryModel("Azerbaijan",
            "Baku",R.drawable.aze)
        val c2=CountryModel("Turkey",
            "Ankara",R.drawable.tr)
        val c3=CountryModel("Russia",
            "Moscow",R.drawable.rus)

        list.add(c1)
        list.add(c2)
        list.add(c3)
        list.add(c1)
        list.add(c2)
        list.add(c3)
        list.add(c1)
        list.add(c2)
        list.add(c3)
        list.add(c1)
        list.add(c2)
        list.add(c3)

        adapter.updateList(list)

    }

    private fun setRV(){
        binding.rvCountries.layoutManager=GridLayoutManager(requireContext(),2)
        binding.rvCountries.adapter=adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}