package com.example.todolist


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.todolist.models.Todo
import kotlinx.android.synthetic.main.fragment_add_todo.*
import kotlinx.coroutines.launch


class AddTodoFragment : Fragment() {
    val viewModel by viewModels<MainViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_todo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        add_button.setOnClickListener {
            val todo = Todo(todo_edit.text.toString(), System.currentTimeMillis())

            lifecycleScope.launch {
                viewModel.db.todoDao().insert(todo)
                findNavController().popBackStack()
            }
        }
    }


}
