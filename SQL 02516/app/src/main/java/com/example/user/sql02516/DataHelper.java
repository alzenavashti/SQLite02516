package com.example.user.sql02516;

/**
 * Created by user on 3/27/2018.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper  extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "penjualan.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table transaksi(no integer primary key, nama text null, jb integer null, harga integer null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO transaksi (no, nama, jb, harga) VALUES ('1', 'Fathur', '1', '10000');";
        db.execSQL(sql);

    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub

    }
}
