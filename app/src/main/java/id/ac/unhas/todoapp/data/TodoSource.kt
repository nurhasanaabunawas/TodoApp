package id.ac.unhas.todoapp.data


import android.content.Context


@Database(entities = [Todo::class], exportSchema = false, version = 1)
abstract class TodoDatabase : RoomDatabase() {

    abstract fun todoDao(): TodoDao

    companion object {

        private const val DB_NAME = "TODO_DB"
        private var instance: TodoDatabase? = null

        fun getInstance(context: Context): TodoDatabase? {
            if (instance == null) {
                synchronized(TodoDatabase::class) {
                    instance = Room
                        .databaseBuilder(
                            context,
                            TodoDatabase::class.java,
                            DB_NAME
                        )
                        .build()
                }
            }
            return instance
        }
    }
}