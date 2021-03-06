package id.ac.unhas.todoapp.repository


import android.app.Application
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class TodoRepository(application: Application) {

    private val todoDao: TodoDao?
    private var todo: LiveData<List<Todo>>? = null

    init {
        val db = TodoDatabase.getInstance(application.applicationContext)
        todoDao = db?.todoDao()
        todo = todoDao?.getTodo()
    }

    fun getTodo(): LiveData<List<Todo>>? {
        return todo
    }

    fun insert(todo: Todo) = runBlocking {
        this.launch(Dispatchers.IO) {
            todoDao?.insertTodo(todo)
        }
    }

    fun delete(todo: Todo) {
        runBlocking {
            this.launch(Dispatchers.IO) {
                todoDao?.deleteTodo(todo)
            }
        }
    }

    fun update(todo: Todo) = runBlocking {
        this.launch(Dispatchers.IO) {
            todoDao?.updateTodo(todo)
        }
    }
}