package id.ac.unhas.todoapp.data.newTodo

import androidx.data.ColumnInfo
import androidx.data.Entity
import androidx.data.PrimaryKey

@Entity(tableName = "todo")


data class Todo(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int? = null,
    @ColumnInfo(name = "todo")
    var todo: String
)