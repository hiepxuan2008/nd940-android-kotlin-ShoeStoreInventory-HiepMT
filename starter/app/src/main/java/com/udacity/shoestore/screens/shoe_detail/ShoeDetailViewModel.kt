package com.udacity.shoestore.screens.shoe_detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeDetailViewModel : ViewModel() {

    private var _shoe = MutableLiveData(Shoe())
    val shoe: LiveData<Shoe>
        get() = _shoe

    fun getName(): String {
        return _shoe.value?.name.toString()
    }

    fun setName(value: String) {
        if (_shoe.value?.name != value) {
            _shoe.value?.name = value
        }
    }

    fun getCompany(): String {
        return _shoe.value?.company.toString()
    }

    fun setCompany(value: String) {
        if (_shoe.value?.company != value) {
            _shoe.value?.company = value
        }
    }

    fun getSize(): String {
        return _shoe.value?.size.toString()
    }

    fun setSize(value: String) {
        if (_shoe.value?.size.toString() != value) {
            if (value.isEmpty())
                _shoe.value?.size = 0.0
            else
                _shoe.value?.size = value.toDouble()
        }
    }

    fun getDescription(): String {
        return _shoe.value?.description.toString()
    }

    fun setDescription(value: String) {
        if (_shoe.value?.description != value) {
            _shoe.value?.description = value
        }
    }
}