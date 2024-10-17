package com.example.todoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TaskAdapter(private val tasks : MutableList<Task>): RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTaskTitle: TextView = itemView.findViewById(R.id.txtView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.textViewTaskTitle.text = tasks[position].title
    }

    override fun getItemCount(): Int {
        return tasks.count()
    }

    fun addTask(task: Task) {
        tasks.add(task)  // Adds the new task to the list
        notifyItemInserted(tasks.size - 1)  // Notifies RecyclerView that a new item has been inserted
    }
}