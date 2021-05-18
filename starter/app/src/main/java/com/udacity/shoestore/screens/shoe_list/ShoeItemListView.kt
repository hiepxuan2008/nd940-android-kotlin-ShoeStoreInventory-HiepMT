package com.udacity.shoestore.screens.shoe_list

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeItemListBinding
import com.udacity.shoestore.models.Shoe


class ShoeItemListView(context: Context, shoe: Shoe): LinearLayout(context) {

    var binding: ShoeItemListBinding =
        DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.shoe_item_list, this, true)

    init {
        binding.shoeItem = shoe
    }
}