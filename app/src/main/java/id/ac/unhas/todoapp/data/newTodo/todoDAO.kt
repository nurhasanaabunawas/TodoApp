package id.ac.unhas.todoapp.data.newTodo


import android.arch.lifecycle.LiveData
import androidx.lifecycle.LiveData
import androidx.data.*

@Dao
interface TodoDao {
    @Query("Select * from todo")
    fun getTodo(): LiveData<List<Todo>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Update
    suspend fun updateTodo(todo: Todo)
} 