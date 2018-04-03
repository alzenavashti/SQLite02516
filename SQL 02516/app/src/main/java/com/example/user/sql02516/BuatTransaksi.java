package com.example.user.sql02516;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BuatTransaksi extends AppCompatActivity {
    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_transaksi);

            dbHelper = new DataHelper(this);
            text1 = (EditText) findViewById(R.id.editText1);
            text2 = (EditText) findViewById(R.id.editText2);
            text3 = (EditText) findViewById(R.id.editText3);
            text4 = (EditText) findViewById(R.id.editText4);
            ton1 = (Button) findViewById(R.id.button1);
            ton2 = (Button) findViewById(R.id.button2);

            ton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    SQLiteDatabase db = dbHelper.getWritableDatabase();
                    db.execSQL("insert into transaksi(no, nama, jb, harga) values('" +
                            text1.getText().toString()+"','"+
                            text2.getText().toString() +"','" +
                            text3.getText().toString()+"','"+
                            text4.getText().toString() +"')");
                    Toast.makeText(getApplicationContext(), "Berhasil", Toast.LENGTH_LONG).show();
                    MainActivity.ma.RefreshList();
                    finish();
                }
            });
            ton2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    // TODO Auto-generated method stub
                    finish();
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
}
