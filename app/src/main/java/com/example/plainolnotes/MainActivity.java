package com.example.plainolnotes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.plainolnotes.databinding.ActivityMainBinding;
import com.example.plainolnotes.databinding.ContentMainBinding;
import com.example.plainolnotes.model.NoteEntity;
import com.example.plainolnotes.ui.NotesAdapter;
import com.example.plainolnotes.utilities.SampleData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<NoteEntity> notesData = new ArrayList<>();
    private ActivityMainBinding mainActivityBinding;
    private NotesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Using viewBinding instead of findViewById
        mainActivityBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainActivityBinding.getRoot();
        setContentView(view);

        setSupportActionBar(mainActivityBinding.toolbar);

        initRecyclerView();

        mainActivityBinding.fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "FAB is Clicked!!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        notesData.addAll(SampleData.getNotes());
        for(NoteEntity note : notesData){
            Log.i("Plain Ol Notes ", note.toString());
        }
    }

    private void initRecyclerView() {
        mainActivityBinding.mainLayout.recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mainActivityBinding.mainLayout.recyclerView.setLayoutManager(layoutManager);
        mAdapter = new NotesAdapter(notesData, this);
        mainActivityBinding.mainLayout.recyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}