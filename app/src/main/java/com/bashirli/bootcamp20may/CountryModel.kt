package com.bashirli.bootcamp20may

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CountryModel(
    val countryName:String,
    val capital:String,
    val image:Int
) : Parcelable
