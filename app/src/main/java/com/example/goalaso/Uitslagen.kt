package com.example.goalaso

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
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
 * Use the [Uitslagen.newInstance] factory method to
 * create an instance of this fragment.
 */
class Uitslagen : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_uitslagen, container, false)
        getStanden(view)


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
    fun getStanden(view: View) {
        val queue = Volley.newRequestQueue(this.context)
        val url = "https://v3.football.api-sports.io/standings?league=88&season=2023"
        val getRequest: StringRequest = object : StringRequest(
            Method.GET, url,
            Response.Listener<String?> { response -> // response
                Log.d("Response", response)

                val gson = Gson()
                this.standen = gson.fromJson(response, Example::class.java )

                view.findViewById<TextView>(R.id.post1).text = this.standen.response[0].league.standings[0][0].team.name + " Punten: " + this.standen.response[0].league.standings[0][0].points.toString()
                view.findViewById<TextView>(R.id.post2).text = this.standen.response[0].league.standings[0][1].team.name + " Punten: " + this.standen.response[0].league.standings[0][1].points.toString()
                view.findViewById<TextView>(R.id.post3).text = this.standen.response[0].league.standings[0][2].team.name + " Punten: " + this.standen.response[0].league.standings[0][2].points.toString()
                view.findViewById<TextView>(R.id.post4).text = this.standen.response[0].league.standings[0][3].team.name + " Punten: " + this.standen.response[0].league.standings[0][3].points.toString()
                view.findViewById<TextView>(R.id.post5).text = this.standen.response[0].league.standings[0][4].team.name + " Punten: " + this.standen.response[0].league.standings[0][4].points.toString()
                view.findViewById<TextView>(R.id.post6).text = this.standen.response[0].league.standings[0][5].team.name + " Punten: " + this.standen.response[0].league.standings[0][5].points.toString()
                view.findViewById<TextView>(R.id.post7).text = this.standen.response[0].league.standings[0][6].team.name + " Punten: " + this.standen.response[0].league.standings[0][6].points.toString()
                view.findViewById<TextView>(R.id.post8).text = this.standen.response[0].league.standings[0][7].team.name + " Punten: " + this.standen.response[0].league.standings[0][7].points.toString()
                view.findViewById<TextView>(R.id.post9).text = this.standen.response[0].league.standings[0][8].team.name + " Punten: " + this.standen.response[0].league.standings[0][8].points.toString()
                view.findViewById<TextView>(R.id.post10).text = this.standen.response[0].league.standings[0][9].team.name + " Punten: " + this.standen.response[0].league.standings[0][9].points.toString()
                view.findViewById<TextView>(R.id.post11).text = this.standen.response[0].league.standings[0][10].team.name + " Punten: " + this.standen.response[0].league.standings[0][10].points.toString()
                view.findViewById<TextView>(R.id.post12).text = this.standen.response[0].league.standings[0][11].team.name + " Punten: " + this.standen.response[0].league.standings[0][11].points.toString()
                view.findViewById<TextView>(R.id.post13).text = this.standen.response[0].league.standings[0][12].team.name + " Punten: " + this.standen.response[0].league.standings[0][12].points.toString()
                view.findViewById<TextView>(R.id.post14).text = this.standen.response[0].league.standings[0][13].team.name + " Punten: " + this.standen.response[0].league.standings[0][13].points.toString()
                view.findViewById<TextView>(R.id.post15).text = this.standen.response[0].league.standings[0][14].team.name + " Punten: " + this.standen.response[0].league.standings[0][14].points.toString()
                view.findViewById<TextView>(R.id.post16).text = this.standen.response[0].league.standings[0][15].team.name + " Punten: " + this.standen.response[0].league.standings[0][15].points.toString()
                view.findViewById<TextView>(R.id.post17).text = this.standen.response[0].league.standings[0][16].team.name + " Punten: " + this.standen.response[0].league.standings[0][16].points.toString()
                view.findViewById<TextView>(R.id.post18).text = this.standen.response[0].league.standings[0][17].team.name + " Punten: " + this.standen.response[0].league.standings[0][17].points.toString()

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