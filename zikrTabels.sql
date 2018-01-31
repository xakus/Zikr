------------- SQLite3 Dump File -------------

-- ------------------------------------------
-- Dump of "DICTIONARY"
-- ------------------------------------------

CREATE TABLE "DICTIONARY"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"DT_ID" Integer,
	"NAME" Text,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


-- ------------------------------------------
-- Dump of "DICTIONARY_TYPE"
-- ------------------------------------------

CREATE TABLE "DICTIONARY_TYPE"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"NAME" Text,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


-- ------------------------------------------
-- Dump of "ORIGINAL_TRANSLATE"
-- ------------------------------------------

CREATE TABLE "ORIGINAL_TRANSLATE"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"OR_ID" Integer,
	"TR_ID" Integer,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


-- ------------------------------------------
-- Dump of "SOUND"
-- ------------------------------------------

CREATE TABLE "SOUND"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"PATH" Text,
	"DIC_ID" Integer,
	"ZIKR_ID" Integer,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


-- ------------------------------------------
-- Dump of "WHEN_THEY_READ_ZIKR"
-- ------------------------------------------

CREATE TABLE "WHEN_THEY_READ_ZIKR"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"D_ID" Integer,
	"ZIKR_ID" Integer,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


-- ------------------------------------------
-- Dump of "ZIKR_ORIGINAL"
-- ------------------------------------------

CREATE TABLE "ZIKR_ORIGINAL"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"ZIKR_OR" Text,
	"COUNT" Integer,
	"CREATE_DATE" Text,
	"ACTIVE" Integer DEFAULT 1 );


-- ------------------------------------------
-- Dump of "ZIKR_TRANSLATE"
-- ------------------------------------------

CREATE TABLE "ZIKR_TRANSLATE"(
	"ID" Integer NOT NULL PRIMARY KEY AUTOINCREMENT,
	"ZIKR_TR" Text,
	"DICTIONARY_ID" Integer,
	"CREATE_DATE" Text,
	"ACTIVE" Integer );


