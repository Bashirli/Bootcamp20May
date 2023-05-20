package com.bashirli.bootcamp20may

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bashirli.bootcamp20may.databinding.FragmentDetailsBinding
import com.bashirli.bootcamp20may.databinding.FragmentHomeBinding

class DetailsFragment : Fragment() {
    private  var _binding: FragmentDetailsBinding?=null
    private val binding get()=_binding!!

    private val args:DetailsFragmentArgs by navArgs()
 //   private lateinit var countryModel: CountryModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup(){
      //  countryModel=args.countryData
/*
        binding.textCapital.text=countryModel.capital
        binding.textCountry.text=countryModel.countryName
        binding.imageView2.setImageResource(countryModel.image)
 */
        binding.countryModel=args.countryData
        binding.imageView2.setImageResource(args.countryData.image)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}