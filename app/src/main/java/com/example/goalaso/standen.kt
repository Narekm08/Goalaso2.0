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
            view.findViewById<TextView>(R.id.textView5).text = " Clubs                                              G    W    G    V    DV    DT    DS    Pts"
            view.findViewById<TextView>(R.id.textView6).text = "1 PSV                                               19  18    1    0    62    8     54    55"
            view.findViewById<TextView>(R.id.textView7).text = "2 Feyenoor                                          19  13    4    2    52   17     35    43"
            view.findViewById<TextView>(R.id.textView8).text = "3 Twente                                            19  11    5    3    36   21     15    38"
            view.findViewById<TextView>(R.id.textView9).text = "4 AZ                                                19  10    5    4    40   20     20    35               "
            view.findViewById<TextView>(R.id.textView10).text = "5 Ajax                                             19"
            view.findViewById<TextView>(R.id.textView11).text = "6 GA Eagles"
            view.findViewById<TextView>(R.id.textView12).text = "7 NEC"
            view.findViewById<TextView>(R.id.textView13).text = "8 Sparta Rotterdam"
            view.findViewById<TextView>(R.id.textView14).text = "9 PEC"
            view.findViewById<TextView>(R.id.textView15).text = "10 Fortuna"
            view.findViewById<TextView>(R.id.textView16).text = "11 Excelior"
            view.findViewById<TextView>(R.id.textView17).text = "12 Heerenveen"
            view.findViewById<TextView>(R.id.textView18).text = "13 Utrecht"
            view.findViewById<TextView>(R.id.textView19).text = "14 Almere"
            view.findViewById<TextView>(R.id.textView20).text = "15 Heracles"
            view.findViewById<TextView>(R.id.textView3).text = "16 RKC"
            view.findViewById<TextView>(R.id.textView21).text = "17 volendam"
            view.findViewById<TextView>(R.id.textView22).text = "18 Vitesse"
        }

        return view
    }


}
