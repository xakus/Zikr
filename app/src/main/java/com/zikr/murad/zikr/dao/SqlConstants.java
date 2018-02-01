package com.zikr.murad.zikr.dao;

/**
 * Created by MuradSalmanov on 01.02.2018.
 */

public class SqlConstants {
//            ------------- SQLite3 Dump File -------------
//

    public static final int    DATA_BASE_VERSION = 1;
    public static final String DATA_BASE_NAME = "zikr";
//            --  Tabel Names
    public static final String TN_DICTIONARY="DICTIONARY";
    public static final String TN_DICTIONARY_TYPE="DICTIONARY_TYPE";
    public static final String TN_ORIGINAL_TRANSLATE="ORIGINAL_TRANSLATE";
    public static final String TN_SOUND="SOUND";
    public static final String TN_WHEN_THEY_READ_ZIKR="WHEN_THEY_READ_ZIKR";
    public static final String TN_ZIKR_ORIGINAL="ZIKR_ORIGINAL";
    public static final String TN_ZIKR_TRANSLATE="ZIKR_TRANSLATE";
//            -- ------------------------------------------
//            -- Dump of "DICTIONARY"
//            -- ------------------------------------------
    public static final String CREATE_DICTIONARY = "CREATE TABLE \"DICTIONARY\"(\n" +
            "            "+DICTIONARY.CN_ID+" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            " "+DICTIONARY.CN_DT_ID+" Integer,\n" +
            "            "+DICTIONARY.CN_NAME+" Text,\n" +
            "            "+DICTIONARY.CN_CREATE_DATE+" Text,\n" +
            "            "+DICTIONARY.CN_ACTIVE+" Integer )";

//
//            -- ------------------------------------------
//            -- Dump of "DICTIONARY_TYPE"
//            -- ------------------------------------------
    public static final String CREATE_DICTIONARY_TYPE = "CREATE TABLE "+TN_DICTIONARY_TYPE+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"NAME\" Text,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer )";


//
//            -- ------------------------------------------
//            -- Dump of "ORIGINAL_TRANSLATE"
//            -- ------------------------------------------
    public static final String CREATE_ORIGINAL_TRANSLATE = "  CREATE TABLE "+TN_ORIGINAL_TRANSLATE+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"OR_ID\" Integer,\n" +
            "            \"TR_ID\" Integer,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer )";

//
//            -- ------------------------------------------
//            -- Dump of "SOUND"
//            -- ------------------------------------------
    public static final String CREATE_SOUND = " CREATE TABLE "+TN_SOUND+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"PATH\" Text,\n" +
            "            \"DIC_ID\" Integer,\n" +
            "            \"ZIKR_ID\" Integer,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer )";

//
//            -- ------------------------------------------
//            -- Dump of "WHEN_THEY_READ_ZIKR"
//            -- ------------------------------------------
    public static final String CREATE_WHEN_THEY_READ_ZIKR = " CREATE TABLE "+TN_WHEN_THEY_READ_ZIKR+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"D_ID\" Integer,\n" +
            "            \"ZIKR_ID\" Integer,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer )";

//
//            -- ------------------------------------------
//            -- Dump of "ZIKR_ORIGINAL"
//            -- ------------------------------------------
    public static final String CREATE_ZIKR_ORIGINAL = "    CREATE TABLE "+TN_ZIKR_ORIGINAL+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"ZIKR_OR\" Text,\n" +
            "            \"COUNT\" Integer,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer DEFAULT 1 )";
    //
//
//            -- ------------------------------------------
//            -- Dump of "ZIKR_TRANSLATE"
//            -- ------------------------------------------
    public static final String CREATE_ZIKR_TRANSLATE = " CREATE TABLE "+TN_ZIKR_TRANSLATE+"(\n" +
            "            \"ID\" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "\t\"ZIKR_TR\" Text,\n" +
            "            \"DICTIONARY_ID\" Integer,\n" +
            "            \"CREATE_DATE\" Text,\n" +
            "            \"ACTIVE\" Integer )";


public class DICTIONARY{
    public static final String CN_ID="ID";
    public static final String CN_DT_ID="DT_ID";
    public static final String CN_NAME="NAME";
    public static final String CN_CREATE_DATE="CREATE_DATE";
    public static final String CN_ACTIVE="ACTIVE";
}

}
