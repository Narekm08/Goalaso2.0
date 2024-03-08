package com.example.goalaso

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.Example
import com.google.gson.Gson


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

    private  lateinit var standen: Example;
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
    getStanden(view)


//        view.findViewById<Button>(R.id.btneredivisie).setOnClickListener {
//            view.findViewById<TextView>(R.id.textView5).text = " Clubs                                              G    W    G    V    DV    DT    DS    Pts"
//            view.findViewById<TextView>(R.id.textView6).text = "1 PSV                                               19  18    1    0    62    8     54    55"
//            view.findViewById<TextView>(R.id.textView7).text = "2 Feyenoor                                          19  13    4    2    52   17     35    43"
//            view.findViewById<TextView>(R.id.textView8).text = "3 Twente                                            19  11    5    3    36   21     15    38"
//            view.findViewById<TextView>(R.id.textView9).text = "4 AZ                                                19  10    5    4    40   20     20    35               "
//            view.findViewById<TextView>(R.id.textView10).text = "5 Ajax                                             19"
//            view.findViewById<TextView>(R.id.textView11).text = "6 GA Eagles"
//            view.findViewById<TextView>(R.id.textView12).text = "7 NEC"
//            view.findViewById<TextView>(R.id.textView13).text = "8 Sparta Rotterdam"
//            view.findViewById<TextView>(R.id.textView14).text = "9 PEC"
//            view.findViewById<TextView>(R.id.textView15).text = "10 Fortuna"
//            view.findViewById<TextView>(R.id.textView16).text = "11 Excelior"
//            view.findViewById<TextView>(R.id.textView17).text = "12 Heerenveen"
//            view.findViewById<TextView>(R.id.textView18).text = "13 Utrecht"
//            view.findViewById<TextView>(R.id.textView19).text = "14 Almere"
//            view.findViewById<TextView>(R.id.textView20).text = "15 Heracles"
//            view.findViewById<TextView>(R.id.textView3).text = "16 RKC"
//            view.findViewById<TextView>(R.id.textView21).text = "17 volendam"
//            view.findViewById<TextView>(R.id.textView22).text = "18 Vitesse"
      //  }

        return view
    }

    fun getStanden(view: View) {
        val queue = Volley.newRequestQueue(this.context)
        val url = "https://v3.football.api-sports.io/standings?league=88&season=2023"
        val getRequest: StringRequest = object : StringRequest(
            Method.GET, url,
            Response.Listener<String?> { response -> // response
                Log.d("Response", response)

                val gson = Gson()
                this.standen = gson.fromJson(response, Example::class.java )

                view.findViewById<TextView>(R.id.pos2).text = this.standen.response[0].league.standings[0][0].team.name
                view.findViewById<TextView>(R.id.pos3).text = this.standen.response[0].league.standings[0][1].team.name
                view.findViewById<TextView>(R.id.pos4).text = this.standen.response[0].league.standings[0][2].team.name
                view.findViewById<TextView>(R.id.pos5).text = this.standen.response[0].league.standings[0][3].team.name
                view.findViewById<TextView>(R.id.pos6).text = this.standen.response[0].league.standings[0][4].team.name
                view.findViewById<TextView>(R.id.pos7).text = this.standen.response[0].league.standings[0][5].team.name
                view.findViewById<TextView>(R.id.pos8).text = this.standen.response[0].league.standings[0][6].team.name
                view.findViewById<TextView>(R.id.pos9).text = this.standen.response[0].league.standings[0][7].team.name
                view.findViewById<TextView>(R.id.pos10).text = this.standen.response[0].league.standings[0][8].team.name
                view.findViewById<TextView>(R.id.pos11).text = this.standen.response[0].league.standings[0][9].team.name
                view.findViewById<TextView>(R.id.pos12).text = this.standen.response[0].league.standings[0][10].team.name
                view.findViewById<TextView>(R.id.pos13).text = this.standen.response[0].league.standings[0][11].team.name
                view.findViewById<TextView>(R.id.pos14).text = this.standen.response[0].league.standings[0][12].team.name
                view.findViewById<TextView>(R.id.pos15).text = this.standen.response[0].league.standings[0][13].team.name
                view.findViewById<TextView>(R.id.pos16).text = this.standen.response[0].league.standings[0][14].team.name
                view.findViewById<TextView>(R.id.pos17).text = this.standen.response[0].league.standings[0][15].team.name
                view.findViewById<TextView>(R.id.pos18).text = this.standen.response[0].league.standings[0][16].team.name
                view.findViewById<TextView>(R.id.pos19).text = this.standen.response[0].league.standings[0][17].team.name

            },
            Response.ErrorListener { error -> // TODO Auto-generated method stub
                Log.d("ERROR", "error => $error")
            }
        ) {
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val params: MutableMap<String, String> = HashMap()
                params["x-apisports-key"] = "b3747f30c6d3e689f01c8f16888219b1"
                return params
            }
        }
        queue.add(getRequest)
    }


}
