package net.smallacademy.gridcycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");
        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);
        images.add(R.drawable.ic_airline_seat_flat_angled_black_24dp);
        images.add(R.drawable.ic_airplanemode_active_black_24dp);
        images.add(R.drawable.ic_brightness_1_black_24dp);
        images.add(R.drawable.ic_build_black_24dp);

        adapter = new Adapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);













    }
}
