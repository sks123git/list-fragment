package com.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class SecondFragment : Fragment() {
  lateinit var image: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_second, container, false)

        image = view.findViewById(R.id.imageView)

        when (arguments?.getInt("position",0)) {
            0 -> image.setImageResource(R.drawable.delhi)
            1 -> image.setImageResource(R.drawable.mumbai)
            2 -> image.setImageResource(R.drawable.chennai)
            3 -> image.setImageResource(R.drawable.kolkata)
        }
        // Inflate the layout for this fragment
        return view
    }

}