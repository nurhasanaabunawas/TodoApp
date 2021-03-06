package layout

<?xml version="1.0" encoding="utf-8"?>
<androidx.coordinatorlayout.widget.CoordinatorLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent">


<androidx.recyclerview.widget.RecyclerView
android:id="@+id/notesRecyclerView"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginStart="8dp"
android:layout_marginLeft="8dp"
android:layout_marginTop="8dp"
android:layout_marginEnd="8dp"
android:layout_marginRight="8dp"
tools:listitem="@layout/todo_item"/>

<TextView
android:id="@+id/notesNotFound"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_gravity="center"
android:text="@string/please_add_todo_list"
tools:text="Notes not found." />

<com.google.android.material.bottomappbar.BottomAppBar
android:id="@+id/bottomAppBar"
style="@style/Widget.MaterialComponents.BottomAppBar.Colored"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_gravity="bottom"
app:fabAlignmentMode="center"
app:fabCradleMargin="@dimen/bottom_app_bar_fab_cradle_margin"
app:fabCradleRoundedCornerRadius="@dimen/bottom_app_bar_fab_cradle_corner_radius"/>

<com.google.android.material.floatingactionbutton.FloatingActionButton
android:id="@+id/fab"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginEnd="16dp"
app:fabSize="normal"
app:hideOnScroll="true"
app:layout_anchor="@id/bottomAppBar"
android:src="@drawable/ic_add_24dp"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>