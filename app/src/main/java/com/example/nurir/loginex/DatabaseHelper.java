package com.example.nurir.loginex;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper  extends SQLiteOpenHelper {

    public static final String DBName = "Register.db";
    public static final String TableName = "Users";
    public static final String ColID = "ID";
    public static final String ColUserName = "Username";
    public static final String ColPassword = "Password";



    public DatabaseHelper(Context context) {
        super(context, DBName , null , 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " +TableName+ "(ID INTEGER PRIMARY KEY AUTOINCREMENT , Username TEXT, Password TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TableName);
        onCreate(db);
    }
}
