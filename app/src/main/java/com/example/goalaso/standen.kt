package com.example.goalaso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [standen.newInstance] factory method to
 * create an instance of this fragment.
 */
class standen : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_standen, container, false)
        view.findViewById<Button>(R.id.btneredivisie).setOnClickListener {
            view.findViewById<TextView>(R.id.textView2).text = "PSV "
            view.findViewById<TextView>(R.id.textView4).text = "Feyenoord "
            view.findViewById<TextView>(R.id.textView5).text = "Twente "
            view.findViewById<TextView>(R.id.textView6).text = "AZ"
            view.findViewById<TextView>(R.id.textView7).text = "Ajax"
            view.findViewById<TextView>(R.id.textView8).text = "GA Eagles"
            view.findViewById<TextView>(R.id.textView9).text = "NEC"
            view.findViewById<TextView>(R.id.textView10).text = "Sparta Rotterdam"
            view.findViewById<TextView>(R.id.textView11).text = "PEC"
            view.findViewById<TextView>(R.id.textView12).text = "Fortuna"
            view.findViewById<TextView>(R.id.textView13).text = "Excelsior"
            view.findViewById<TextView>(R.id.textView14).text = "Heerenveen"
            view.findViewById<TextView>(R.id.textView15).text = "Utrecht"
            view.findViewById<TextView>(R.id.textView16).text = "Almere"
            view.findViewById<TextView>(R.id.textView17).text = "Heracles"
            view.findViewById<TextView>(R.id.textView18).text = "Rkc"
            view.findViewById<TextView>(R.id.textView19).text = "Volendam"
            view.findViewById<TextView>(R.id.textView20).text = "Vitesse"
        }
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment standen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            standen().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}