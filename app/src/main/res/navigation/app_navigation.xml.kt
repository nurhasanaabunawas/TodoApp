package navigation

<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/app_navigation"
app:startDestination="@id/notesFragment">

<fragment
android:id="@+id/notesFragment"
android:name="id.ac.unhas.todolistapp.ui.TodoListFragment"
android:label="@string/label_todo_list"
tools:layout="@layout/todo_list_fragment" />

</navigation>