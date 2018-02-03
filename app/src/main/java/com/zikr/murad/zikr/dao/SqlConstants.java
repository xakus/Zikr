package com.zikr.murad.zikr.dao;

/**
 * Created by MuradSalmanov on 01.02.2018.
 */

public class SqlConstants {
//            ------------- SQLite3 Dump File -------------
//

    public static final int DATA_BASE_VERSION = 1;
    public static final String DATA_BASE_NAME = "zikr";
    //            --  Tabel Names
    public static final String TN_DICTIONARY = "DICTIONARY";
    public static final String TN_DICTIONARY_TYPE = "DICTIONARY_TYPE";
    public static final String TN_ORIGINAL_TRANSLATE = "ORIGINAL_TRANSLATE";
    public static final String TN_SOUND = "SOUND";
    public static final String TN_WHEN_THEY_READ_ZIKR = "WHEN_THEY_READ_ZIKR";
    public static final String TN_ZIKR_ORIGINAL = "ZIKR_ORIGINAL";
    public static final String TN_ZIKR_TRANSLATE = "ZIKR_TRANSLATE";
    //            -- ------------------------------------------
//            -- Dump of "DICTIONARY"
//            -- ------------------------------------------
    public static final String CREATE_DICTIONARY = "CREATE TABLE \"DICTIONARY\"(\n" +
            "            " + DICTIONARY.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + DICTIONARY.CN_DT_ID + " Integer,\n" +
            "            " + DICTIONARY.CN_NAME + " Text,\n" +
            "            " + DICTIONARY.CN_CREATE_DATE + " Text,\n" +
            "            " + DICTIONARY.CN_ACTIVE + " Integer )";

    public class DICTIONARY {
        public static final String CN_ID = "ID";
        public static final String CN_DT_ID = "DT_ID";
        public static final String CN_NAME = "NAME";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

    //
//            -- ------------------------------------------
//            -- Dump of "DICTIONARY_TYPE"
//            -- ------------------------------------------
    public static final String CREATE_DICTIONARY_TYPE = "CREATE TABLE " + TN_DICTIONARY_TYPE + "(\n" +
            "            " + DICTIONARY_TYPE.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + DICTIONARY_TYPE.CN_NAME + " Text,\n" +
            "            " + DICTIONARY_TYPE.CN_CREATE_DATE + " Text,\n" +
            "            " + DICTIONARY_TYPE.CN_ACTIVE + " Integer )";

    public class DICTIONARY_TYPE {
        public static final String CN_ID = "ID";
        public static final String CN_NAME = "NAME";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }


    //
//            -- ------------------------------------------
//            -- Dump of "ORIGINAL_TRANSLATE"
//            -- ------------------------------------------
    public static final String CREATE_ORIGINAL_TRANSLATE = "  CREATE TABLE " + TN_ORIGINAL_TRANSLATE + "(\n" +
            "            " + ORIGINAL_TRANSLATE.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + ORIGINAL_TRANSLATE.CN_OR_ID + " Integer,\n" +
            "            " + ORIGINAL_TRANSLATE.CN_TR_ID + " Integer,\n" +
            "            " + ORIGINAL_TRANSLATE.CN_CREATE_DATE + " Text,\n" +
            "            " + ORIGINAL_TRANSLATE.CN_ACTIVE + " Integer )";

    public class ORIGINAL_TRANSLATE {
        public static final String CN_ID = "ID";
        public static final String CN_OR_ID = "OR_ID";
        public static final String CN_TR_ID = "TR_ID";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

    //
//            -- ------------------------------------------
//            -- Dump of "SOUND"
//            -- ------------------------------------------
    public static final String CREATE_SOUND = " CREATE TABLE " + TN_SOUND + "(\n" +
            "            " + SOUND.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + SOUND.CN_PATH + " Text,\n" +
            "            " + SOUND.CN_DIC_ID + " Integer,\n" +
            "            " + SOUND.CN_ZIKR_ID + " Integer,\n" +
            "            " + SOUND.CN_CREATE_DATE + " Text,\n" +
            "            " + SOUND.CN_ACTIVE + " Integer )";

    public class SOUND {
        public static final String CN_ID = "ID";
        public static final String CN_PATH = "PATH";
        public static final String CN_DIC_ID = "DIC_ID";
        public static final String CN_ZIKR_ID = "ZIKR_ID";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

    //
//            -- ------------------------------------------
//            -- Dump of "WHEN_THEY_READ_ZIKR"
//            -- ------------------------------------------
    public static final String CREATE_WHEN_THEY_READ_ZIKR = " CREATE TABLE " + TN_WHEN_THEY_READ_ZIKR + "(\n" +
            "            " + WHEN_THEY_READ_ZIKR.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + WHEN_THEY_READ_ZIKR.CN_D_ID + " Integer,\n" +
            "            " + WHEN_THEY_READ_ZIKR.CN_ZIKR_ID + " Integer,\n" +
            "            " + WHEN_THEY_READ_ZIKR.CN_CREATE_DATE + " Text,\n" +
            "            " + WHEN_THEY_READ_ZIKR.CN_ACTIVE + " Integer )";

    public class WHEN_THEY_READ_ZIKR {
        public static final String CN_ID = "ID";
        public static final String CN_D_ID = "D_ID";
        public static final String CN_ZIKR_ID = "ZIKR_ID";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

    //
//            -- ------------------------------------------
//            -- Dump of "ZIKR_ORIGINAL"
//            -- ------------------------------------------
    public static final String CREATE_ZIKR_ORIGINAL = "    CREATE TABLE " + TN_ZIKR_ORIGINAL + "(\n" +
            "            " + ZIKR_ORIGINAL.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + ZIKR_ORIGINAL.CN_ZIKR_OR + " Text,\n" +
            "            " + ZIKR_ORIGINAL.CN_COUNT + " Integer,\n" +
            "            " + ZIKR_ORIGINAL.CN_CREATE_DATE + " Text,\n" +
            "            " + ZIKR_ORIGINAL.CN_ACTIVE + " Integer DEFAULT 1 )";

    public class ZIKR_ORIGINAL {
        public static final String CN_ID = "ID";
        public static final String CN_ZIKR_OR = "ZIKR_OR";
        public static final String CN_COUNT = "COUNT";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

    //
//
//            -- ------------------------------------------
//            -- Dump of "ZIKR_TRANSLATE"
//            -- ------------------------------------------
    public static final String CREATE_ZIKR_TRANSLATE = " CREATE TABLE " + TN_ZIKR_TRANSLATE + "(\n" +
            "            " + ZIKR_TRANSLATE.CN_ID + " Integer NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
            "            " + ZIKR_TRANSLATE.CN_ZIKR_TR + " Text,\n" +
            "            " + ZIKR_TRANSLATE.CN_DICTIONARY_ID + " Integer,\n" +
            "            " + ZIKR_TRANSLATE.CN_CREATE_DATE + " Text,\n" +
            "            " + ZIKR_TRANSLATE.CN_ACTIVE + " Integer )";

    public class ZIKR_TRANSLATE {
        public static final String CN_ID = "ID";
        public static final String CN_ZIKR_TR = "ZIKR_TR";
        public static final String CN_DICTIONARY_ID = "DICTIONARY_ID";
        public static final String CN_CREATE_DATE = "CREATE_DATE";
        public static final String CN_ACTIVE = "ACTIVE";
    }

}
