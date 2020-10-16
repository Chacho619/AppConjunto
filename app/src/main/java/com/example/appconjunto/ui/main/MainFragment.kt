package com.example.appconjunto.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appconjunto.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    private var adapter : TestAdapter? = null

    companion object{
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        adapter = TestAdapter(view.context)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(view.context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of (this).get(MainViewModel::class.java)
    }

    override fun onResume() {
        super.onResume()
        val alumnosCursoAndroid = mutableListOf<Alumno>()
        alumnosCursoAndroid.add(Alumno("David"))
        alumnosCursoAndroid.add(Alumno("Ricardo"))
        alumnosCursoAndroid.add(Alumno("Eduardo"))
        adapter?.setData(alumnosCursoAndroid)
    }

}