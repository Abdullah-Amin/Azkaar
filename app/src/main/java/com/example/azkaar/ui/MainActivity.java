package com.example.azkaar.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.azkaar.R;
import com.example.azkaar.adapters.HomeAdapter;
import com.example.azkaar.callbacks.HomeI;
import com.example.azkaar.constants.AzkaarConst;
import com.example.azkaar.data.DBPrayerHelper;
import com.example.azkaar.data.HomeItemModel;
import com.example.azkaar.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private DBPrayerHelper prayerHelper;

    private ArrayList<HomeItemModel> itemModels;

    private String zekr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        itemModels = new ArrayList<>();

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

        if (getDataFromDatabase() == null){
            prayerHelper = new DBPrayerHelper(this);

            String x = getResources().getString(R.string.important_Text);
            prayerHelper.addNewItem(x);
        }

        binding.recyclerView.setAdapter(new HomeAdapter(itemModels, new HomeI() {
            @Override
            public void getItemText(String itemText) {

                Intent intent = new Intent(MainActivity.this, AzkaarGroupActivity.class);
                intent.putExtra(AzkaarConst.HOME_ITEM_TEXT, itemText);
                startActivity(intent);
            }
        }));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.Menu_notify){
            Intent AboutUs = new Intent(MainActivity.this, PrayerTimeActivity.class);
            startActivity(AboutUs);
        }
        if (id == R.id.Menu_home) {
            Intent important = new Intent(MainActivity.this, AzkaarDetailsActivity.class);
            important.putExtra(AzkaarConst.AZKAAR_ITEM_TEXT, "فضل الذكر");
            startActivity(important);
        }
        if (id == R.id.Menu_AboutUs) {
            Intent AboutUs = new Intent(MainActivity.this, AboutUsActivity.class);
            startActivity(AboutUs);
        }
        if (id == R.id.Menu_ContactUs) {
            Intent ContactUs = new Intent(MainActivity.this, ContactUsActivity.class);
            startActivity(ContactUs);
        }

        return super.onOptionsItemSelected(item);
    }

    private String getDataFromDatabase() {
        prayerHelper = new DBPrayerHelper(MainActivity.this);
        Cursor cursor = prayerHelper.readAllData();

        if (cursor.getCount() == 0){
            return zekr;
        }else{
            while (cursor.moveToNext()){
                Log.i("abdo", "getDataFromDatabase: "+ cursor.getString(1));
                zekr = cursor.getString(1);
            }
        }
        return zekr;
    }
}