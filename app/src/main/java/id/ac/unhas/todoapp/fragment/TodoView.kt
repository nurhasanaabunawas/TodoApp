package id.ac.unhas.todoapp.fragment


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import id.ac.unhas.todoapp.data.newTodo.Todo
import id.ac.unhas.todoapp.repository.TodoRepository

class TodoViewModel(application: Application) : AndroidViewModel(application){

    private val todoRepository = TodoRepository(application)
    private val todo :LiveData<List<Todo>>? = todoRepository.getTodo()

    fun insertTodo(todo: Todo) {
        todoRepository.insert(todo)
    }

    fun getTodo(): LiveData<List<Todo>>? {
        return todo
    }

    fun deleteTodo(todo: Todo) {
        todoRepository.delete(todo)
    }

    fun updateTodo(todo: Todo) {
        todoRepository.update(todo)
    }
}