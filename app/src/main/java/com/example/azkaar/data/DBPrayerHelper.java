package com.example.azkaar.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;

import androidx.annotation.Nullable;

import com.example.azkaar.constants.AzkaarConst;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class DBPrayerHelper extends SQLiteOpenHelper {

    public DBPrayerHelper(@Nullable Context context) {
        super(context, AzkaarConst.PRAYER_TABLE_NAME, null, AzkaarConst.PRAYER_TABLE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + AzkaarConst.PRAYER_TABLE_NAME + "(" +
                " ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " AZKAAR_ITEM TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + "PRODUCTS");
        onCreate(db);
    }

    public void addNewItem(String zekr) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();


        values.put("AZKAAR_ITEM", zekr);

        db.insert(AzkaarConst.PRAYER_TABLE_NAME, null, values);
//        db.close();
    }

    public Cursor readAllData() {
        String query = "SELECT * FROM " + AzkaarConst.PRAYER_TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;
        if (db != null) {
            cursor = db.rawQuery(query, null);
        }
        return cursor;
    }
}
