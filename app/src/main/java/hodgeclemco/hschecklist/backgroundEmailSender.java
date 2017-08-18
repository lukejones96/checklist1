package hodgeclemco.hschecklist;


import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

import static hodgeclemco.hschecklist.MainActivity.setter;
import static hodgeclemco.hschecklist.radioButtonChecker.problemState;
import static hodgeclemco.hschecklist.MainActivity.rbc;
class backgroundEmailSender extends AsyncTask<Void, Void, Void> {
    String userInput;
    String rbcStates;
    public static boolean flag=false;

    @Override
    protected void onPreExecute(){
        // userInputGetter getter = new userInputGetter();
         userInput = setter.getText();
        rbcStates = problemState;


            }

    @Override
    protected Void doInBackground(Void... voids) {
        EasyMail mail = new EasyMail("hodgeclecmo1234569789@gmail.com", "hodgeclemcolukeapp");
        String[] directionsToSend = {"luke.jones@hodgeclemco.co.uk"};
        mail.setTo(directionsToSend);
        mail.setFrom("HealthAndSafetyApp");
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        mail.setSubject("H&S Checklist " + rbcStates  +" "+currentDateTimeString);
        String mailBody = userInput;
        mail.setBody(mailBody);
        final String TAG = "myActivity";

        try {
            mail.send();}
        catch(Exception e) {
            Log.e(TAG, "Could not send email: ", e);
            flag = true;
        }

        return null;
    }




    }
