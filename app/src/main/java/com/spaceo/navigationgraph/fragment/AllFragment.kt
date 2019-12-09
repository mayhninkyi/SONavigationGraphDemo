package com.spaceo.navigationgraph.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.spaceo.navigationgraph.R
/**
 * A simple [Fragment] subclass.
 */
class AllFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_all, container, false)

        view?.findViewById<TextView>(R.id.tvArgs)!!.text = arguments?.get("userText") as String

        return view
    }


}
