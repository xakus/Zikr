package com.zikr.murad.zikr.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by MuradSalmanov on 01.02.2018.
 */

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, SqlConstants.DATA_BASE_NAME, null, SqlConstants.DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL(SqlConstants.CREATE_DICTIONARY_TYPE);
      db.execSQL(SqlConstants.CREATE_DICTIONARY);
      db.execSQL(SqlConstants.CREATE_ZIKR_ORIGINAL);
      db.execSQL(SqlConstants.CREATE_ZIKR_TRANSLATE);
      db.execSQL(SqlConstants.CREATE_ORIGINAL_TRANSLATE);
      db.execSQL(SqlConstants.CREATE_WHEN_THEY_READ_ZIKR);
      db.execSQL(SqlConstants.CREATE_SOUND);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+SqlConstants.TN_DICTIONARY_TYPE);
        db.execSQL("drop table if exists "+SqlConstants.TN_DICTIONARY);
        db.execSQL("drop table if exists "+SqlConstants.TN_ORIGINAL_TRANSLATE);
        db.execSQL("drop table if exists "+SqlConstants.TN_ZIKR_ORIGINAL);
        db.execSQL("drop table if exists "+SqlConstants.TN_ZIKR_TRANSLATE);
        db.execSQL("drop table if exists "+SqlConstants.TN_WHEN_THEY_READ_ZIKR);
        db.execSQL("drop table if exists "+SqlConstants.TN_SOUND);
        onCreate(db);
    }
}
