package com.bashirli.bootcamp20may

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bashirli.bootcamp20may.databinding.ItemCountryBinding

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val countryList=ArrayList<CountryModel>()

    inner class HomeViewHolder(val itemCountryBinding:ItemCountryBinding) : RecyclerView.ViewHolder(itemCountryBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val layout=ItemCountryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HomeViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item=countryList[position]
        holder.itemCountryBinding.imageView.setImageResource(item.image)

        holder.itemCountryBinding.cardCountry.setOnClickListener {

           Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(item))
        }


    }

    fun updateList(list:List<CountryModel>){
        countryList.clear()
        countryList.addAll(list)
        notifyDataSetChanged()
    }

}