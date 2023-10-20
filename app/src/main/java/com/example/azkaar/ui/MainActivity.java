package com.example.azkaar.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.azkaar.R;
import com.example.azkaar.adapters.HomeAdapter;
import com.example.azkaar.callbacks.HomeI;
import com.example.azkaar.data.HomeItemModel;
import com.example.azkaar.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<HomeItemModel> itemModels = new ArrayList<>();

        itemModels.add(new HomeItemModel("النهار والليلة", R.drawable.moon));
        itemModels.add(new HomeItemModel("الوضوء والصلاة", R.drawable.people));
        itemModels.add(new HomeItemModel("الأكل والشراب", R.drawable.eating));
        itemModels.add(new HomeItemModel("الحج والعمرة", R.drawable.islamic));
        itemModels.add(new HomeItemModel("الخوف والسعادة", R.drawable.smileys));
        itemModels.add(new HomeItemModel("المرض والمصائب", R.drawable.virus));
        itemModels.add(new HomeItemModel("الأدب والتعامل", R.drawable.deal));
        itemModels.add(new HomeItemModel("السفر والتوكل", R.drawable.flights));
        itemModels.add(new HomeItemModel("السحر والحسد", R.drawable.hasad));
        itemModels.add(new HomeItemModel("طلب العلم ", R.drawable.good));

        binding.recyclerView.setAdapter(new HomeAdapter(itemModels, new HomeI() {
            @Override
            public void getItemText(String itemText) {
                switch (itemText){
                    case "النهار والليلة":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "الوضوء والصلاة":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "الأكل والشراب":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "الحج والعمرة":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "الخوف والسعادة":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "المرض والمصائب":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "الأدب والتعامل":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "السفر والتوكل":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    case "السحر والحسد":
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                    default:
                        startActivity(new Intent(MainActivity.this, DayNightActivity.class));
                        break;
                }
            }
        }));
    }
}