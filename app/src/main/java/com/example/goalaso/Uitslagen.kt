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
 * Use the [Uitslagen.newInstance] factory method to
 * create an instance of this fragment.
 */
class Uitslagen : Fragment() {
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
        //getStanden()


//        view.findViewById<Button>(R.id.btneredivisie).setOnClickListener {
//            view.findViewById<TextView>(R.id.textView23).text = " Clubs                                              G    W    G    V    DV    DT    DS    Pts"
//            view.findViewById<TextView>(R.id.textView24).text = "1 PSV                                               19  18    1    0    62    8     54    55"
//            view.findViewById<TextView>(R.id.textView25).text = "2 Feyenoor                                          19  13    4    2    52   17     35    43"
//           view.findViewById<TextView>(R.id.textView26).text = "3 Twente                                            19  11    5    3    36   21     15    38"
//            view.findViewById<TextView>(R.id.textView27).text = "4 AZ                                                19  10    5    4    40   20     20    35               "
//            view.findViewById<TextView>(R.id.textView28).text = "5 Ajax                                             19"
//            view.findViewById<TextView>(R.id.textView29).text = "6 GA Eagles"
//            view.findViewById<TextView>(R.id.textView30).text = "7 NEC"
//            view.findViewById<TextView>(R.id.textView31).text = "8 Sparta Rotterdam"
//            view.findViewById<TextView>(R.id.textView32).text = "9 PEC"
//            view.findViewById<TextView>(R.id.textView33).text = "10 Fortuna"
//            view.findViewById<TextView>(R.id.textView34).text = "11 Excelior"
//            view.findViewById<TextView>(R.id.textView35).text = "12 Heerenveen"
//            view.findViewById<TextView>(R.id.textView36).text = "13 Utrecht"
//            view.findViewById<TextView>(R.id.textView37).text = "14 Almere"
//            view.findViewById<TextView>(R.id.textView38).text = "15 Heracles"


            return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Uitslagen.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Uitslagen().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}