package com.example.todoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainFragment : Fragment() {

    private lateinit var taskAdapter: TaskAdapter
    private lateinit var edtTxt : EditText
    private lateinit var btn : Button
    private lateinit var recView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_, container, false)

        edtTxt.findViewById<EditText>(R.id.edtTxt)

        btn.findViewById<Button>(R.id.btn)

        recView.findViewById<RecyclerView>(R.id.recView)


        taskAdapter = TaskAdapter(mutableListOf())
        recView.adapter = taskAdapter
        recView.layoutManager = LinearLayoutManager(context)

        btn.setOnClickListener{

            val taskTitle = edtTxt.text.toString()
            if(taskTitle.isNotEmpty()){
                val task = Task(taskTitle)
                taskAdapter.addTask(task)
                edtTxt.text.clear()
            }

        }

        return view


    }
    }