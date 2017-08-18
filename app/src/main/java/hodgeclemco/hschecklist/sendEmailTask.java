package hodgeclemco.hschecklist;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class sendEmailTask extends AppCompatActivity {

 public void send(String string){
     MyTask myTask;
     myTask = new MyTask();
     myTask.execute(string);

 }

    // Here is the AsyncTask class:
    //
    // AsyncTask<Params, Progress, Result>.
    //    Params – the type (Object/primitive) you pass to the AsyncTask from .execute()
    //    Progress – the type that gets passed to onProgressUpdate()
    //    Result – the type returns from doInBackground()
    // Any of them can be String, Integer, Void, etc.

     private class MyTask extends AsyncTask<String, Integer, String> {

        // Runs in UI before background thread is called
        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            // Do something like display a progress bar
        }

        // This is run in a background thread
        @Override
        protected  String doInBackground(String... params) {
            // get the string from params, which is an array
            EasyMail mail = new EasyMail("hodgeclecmo1234569789@gmail.com", "hodgeclemcolukeapp");
            String[] directionsToSend = {"luke.jones@hodgeclemco.co.uk"};
            mail.setTo(directionsToSend);
            mail.setFrom("HealthAndSafteyApp");
            mail.setSubject("Test email");
            mail.setBody("test");
            try {

               if(mail.send()){

                return "done";}
                else{

                   return "failed";
                }


            } catch(Exception e) {

              //  toaster toaster = new toaster();
              //  toaster.toaster(3);
                return "exception";
            }




        }


        }}






