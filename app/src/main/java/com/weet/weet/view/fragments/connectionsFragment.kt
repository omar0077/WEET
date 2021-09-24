package com.weet.weet.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.weet.weet.R
import com.weet.weet.view.adapters.ConnectionsAdapter
import com.weet.weet.view.adapters.PassedMatchesAdapter
import com.weet.weet.view.adapters.SavedMatchesAdapter
import kotlinx.android.synthetic.main.fragment_connections.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [connectionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class connectionsFragment : Fragment() {
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
        return inflater.inflate(R.layout.fragment_connections, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        connections_view.apply {
            val recycler = findViewById<RecyclerView>(R.id.connections_view)

            recycler.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            recycler.adapter = ConnectionsAdapter()

        }
        saved_matches_view.apply {
            val savedMatchesView = findViewById<RecyclerView>(R.id.saved_matches_view)

            savedMatchesView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            savedMatchesView.adapter = SavedMatchesAdapter()
        }
        passed_matches_view.apply {
            val passedMatchesView = findViewById<RecyclerView>(R.id.passed_matches_view)

            passedMatchesView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            passedMatchesView.adapter = PassedMatchesAdapter()
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment connectionsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            connectionsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}