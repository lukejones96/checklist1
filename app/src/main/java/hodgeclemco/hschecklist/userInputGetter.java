package hodgeclemco.hschecklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import java.util.ArrayList;
import static hodgeclemco.hschecklist.R.id.editText;



public class userInputGetter extends AppCompatActivity {
    EditText txtname;
    String userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname = (EditText)findViewById(editText);
        userInput =  txtname.getText().toString();

    }

   // txtname = (EditText)findViewById(R.id.editText);
  //  String userInput =  txtname.getText().toString();
   // ArrayList<String> userInputList = new ArrayList<>();


    public String getText(){
       // txtname = (EditText)findViewById(editText);
       // userInput =  txtname.getText().toString();
        return userInput;}


    public void setText(String userInputFromTextbox){

        userInput = userInputFromTextbox;
        }
    }

