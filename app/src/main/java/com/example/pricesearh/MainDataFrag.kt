package com.example.pricesearh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pricesearh.databinding.FragmentMainDataBinding

class MainDataFrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMainDataBinding.inflate(inflater)
        return binding.root
    }
    //Остановился тут,нужно создать приват функцию init https://www.youtube.com/watch?v=4pevVON0v-U&list=PLmjT2NFTgg1fdHN-9Wn4XYr-IOuadxMm5&index=26&t=1s

    companion object{
        @JvmStatic
        fun newInstance() = MainDataFrag
    }

}
