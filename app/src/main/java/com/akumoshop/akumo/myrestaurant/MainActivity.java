package com.akumoshop.akumo.myrestaurant;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request SQLite
        myManage = new MyManage(this);

        //Test Add Value
        //testAddValue();

        //Delete All SQLite
        deleteAllSQLite();
    }//Main Method

    private void deleteAllSQLite() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        sqLiteDatabase.delete(MyManage.user_table, null, null);
        sqLiteDatabase.delete(MyManage.food_table, null, null);
    }

    private void testAddValue() {
        myManage.addValue(1, "user", "pass", "name");
        myManage.addValue(2, "food", "price", "source");
    }//testAddValue method

}//Main Class
