package hodgeclemco.hschecklist;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Luke.Jones on 15/08/2017.
 */

public class DataManager {
    private SQLiteDatabase db;
    public static final String TABLE_ROW_ID = "_id";
    public static final String TABLE_ROW_BODY = "body";
    public static final String TABLE_ROW_SUBJECT = "subject";
    private static final String DB_NAME = "email_db";
    private static final int DB_VERSION = 1;
    private static final String TABLE_EMAIL = "email_body";

    public DataManager(Context context){
        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
        db = helper.getWritableDatabase();
    }

    public void insert(String body, String subject){
        String query = "INSERT INTO "+ TABLE_EMAIL + " (" + TABLE_ROW_BODY +", "
                +TABLE_ROW_SUBJECT +") " + "VALUES (" + "'" + body + "'" +", "+
                "'" + subject + "'" + ");";

        Log.i("insert() = ", query);
        db.execSQL(query);
    }
    public void delete(String body){
        String query = "DELETE FROM " + TABLE_EMAIL + " WHERE " + TABLE_ROW_BODY + " = '" + body + "';";

        Log.i("delete() = ", query);
        db.execSQL(query);
    }
    public Cursor selectAll(){
        Cursor c = db.rawQuery("SELECT *" + " FROM " +TABLE_EMAIL, null);
        c.moveToFirst();
        return c;
    }
    public Cursor searchForEmail(String emailBody){
        String query = "SELECT " + TABLE_ROW_ID + ", " + TABLE_ROW_BODY + ", "+ TABLE_ROW_SUBJECT
                +" from " + TABLE_EMAIL+" WHERE " + TABLE_ROW_BODY + " = '" +emailBody+"';";

        Log.i("searchForEmail() = ", query);
        Cursor c = db.rawQuery(query,null);
        return c;
    }

    private class CustomSQLiteOpenHelper extends SQLiteOpenHelper{
        public CustomSQLiteOpenHelper(Context context){
            super(context, DB_NAME, null, DB_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            String newTableQueryString = "create table " + TABLE_EMAIL + " ("
                    +TABLE_ROW_ID
                    +" integer primary key autoincrement not null, "
                    +TABLE_ROW_BODY
                    +" text not null,"
                    +TABLE_ROW_SUBJECT
                    +" text not null);";
            Log.i("Creating db", newTableQueryString);
            db.execSQL(newTableQueryString);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }



}
