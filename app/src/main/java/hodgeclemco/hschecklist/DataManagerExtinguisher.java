package hodgeclemco.hschecklist;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Luke.Jones on 18/08/2017.
 */

public class DataManagerExtinguisher {
        private SQLiteDatabase db;
        public static final String TABLE_ROW_ID = "_id";
        public static final String TABLE_ROW_LOCATION = "location";
        public static final String TABLE_ROW_NEXT_TEST_DUE = "next_due";
        private static final String DB_NAME = "extinguisher_db";
        private static final int DB_VERSION = 1;
        private static final String TABLE_INFORMATION = "information";

        public DataManagerExtinguisher(Context context){
            CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
            db = helper.getWritableDatabase();
        }

        public void insert(String body, String subject){
            String query = "INSERT INTO "+ TABLE_INFORMATION + " (" + TABLE_ROW_LOCATION +", "
                    +TABLE_ROW_NEXT_TEST_DUE +") " + "VALUES (" + "'" + body + "'" +", "+
                    "'" + subject + "'" + ");";

            Log.i("insert() = ", query);
            db.execSQL(query);
        }
        public void delete(String body){
            String query = "DELETE FROM " + TABLE_INFORMATION + " WHERE " + TABLE_ROW_LOCATION + " = '" + body + "';";

            Log.i("delete() = ", query);
            db.execSQL(query);
        }
        public Cursor selectAll(){
            Cursor c = db.rawQuery("SELECT *" + " FROM " +TABLE_INFORMATION, null);
            c.moveToFirst();
            return c;
        }
        public Cursor searchForEmail(String emailBody){
            String query = "SELECT " + TABLE_ROW_ID + ", " + TABLE_ROW_LOCATION + ", "+ TABLE_ROW_NEXT_TEST_DUE
                    +" from " + TABLE_INFORMATION+" WHERE " + TABLE_ROW_LOCATION + " = '" +emailBody+"';";

            Log.i("searchForEmail() = ", query);
            Cursor c = db.rawQuery(query,null);
            return c;
        }

        private class CustomSQLiteOpenHelper extends SQLiteOpenHelper {
            public CustomSQLiteOpenHelper(Context context){
                super(context, DB_NAME, null, DB_VERSION);
            }
            @Override
            public void onCreate(SQLiteDatabase db) {
                String newTableQueryString = "create table " + TABLE_INFORMATION + " ("
                        +TABLE_ROW_ID
                        +" integer primary key autoincrement not null, "
                        +TABLE_ROW_LOCATION
                        +" text not null,"
                        +TABLE_ROW_NEXT_TEST_DUE
                        +" text not null);";
                Log.i("Creating db", newTableQueryString);
                db.execSQL(newTableQueryString);
            }

            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }
        }



    }

