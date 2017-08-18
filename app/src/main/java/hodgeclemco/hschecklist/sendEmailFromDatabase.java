package hodgeclemco.hschecklist;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Luke.Jones on 15/08/2017.
 */

public class sendEmailFromDatabase extends AsyncTask<Object, Void, Void>{
    private Context context;

    protected void onPreExecute(){
        Log.i("Task Launched","sendEmailFromDatabase has been launched");

    }

    @Override
    protected Void doInBackground(Object... data) {
        Log.i("doInBackground","Do in background method launched");
        context = (Context) data[0];
        EasyMail mail = new EasyMail("hodgeclecmo1234569789@gmail.com", "hodgeclemcolukeapp");
        String[] directionsToSend = {"luke.jones@hodgeclemco.co.uk"};
        mail.setTo(directionsToSend);
        mail.setFrom("HealthAndSafetyApp");
        DataManager dm = new DataManager(context);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        dm.selectAll().moveToFirst();
        mail.setSubject("H&S Checklist " + dm.selectAll().getString(2)  +" "+currentDateTimeString);
        Log.i("Getting DB subject", dm.selectAll().getString(2));
        Log.i("Getting DB body", dm.selectAll().getString(1));
        String mailBody = dm.selectAll().getString(1);
        mail.setBody(mailBody);
        final String TAG = "myActivity";

        try {
            mail.send();}
        catch(Exception e) {
            Log.e(TAG, "Could not send email: ", e);
        }
        return null;
    }
}
