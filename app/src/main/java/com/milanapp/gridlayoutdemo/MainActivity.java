package com.milanapp.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.milanapp.gridlayoutdemo.Adapter.RecyclerViewAdapter;
import com.milanapp.gridlayoutdemo.Model.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener {

    RecyclerView recyclerView;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList();
        arrayList.add(new DataModel("Item 1", R.drawable.family_time, "#09A9FF"));
        arrayList.add(new DataModel("Item 2", R.drawable.me_time, "#3E51B1"));
        arrayList.add(new DataModel("Item 3", R.drawable.lovely_time, "#673BB7"));
        arrayList.add(new DataModel("Item 4", R.drawable.calendar, "#4BAA50"));
        arrayList.add(new DataModel("Item 5", R.drawable.team_time, "#F94336"));
        arrayList.add(new DataModel("Item 6", R.drawable.me_time, "#0A9B88"));
        arrayList.add(new DataModel("Item 1", R.drawable.family_time, "#09A9FF"));
        arrayList.add(new DataModel("Item 2", R.drawable.me_time, "#3E51B1"));
        arrayList.add(new DataModel("Item 3", R.drawable.lovely_time, "#673BB7"));
        arrayList.add(new DataModel("Item 4", R.drawable.calendar, "#4BAA50"));
        arrayList.add(new DataModel("Item 5", R.drawable.team_time, "#F94336"));
        arrayList.add(new DataModel("Item 6", R.drawable.me_time, "#0A9B88"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/
//
        AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
//        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
//        recyclerView.setLayoutManager(manager);
    }

    @Override
    public void onItemClick(DataModel item) {

        Toast.makeText(getApplicationContext(), item.text + " is clicked", Toast.LENGTH_SHORT).show();

    }
}
