package hodgeclemco.hschecklist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {


    EditText txtname,txtname2,txtname3,txtname4,txtname5,txtname6,txtname7,
            txtname8,txtname9,txtname10,txtname11,txtname12,txtname13,txtname14,txtname15,txtname16,txtname17,txtname18,
    txtID,txtName;
    String userInput;
    RadioGroup mRadioGroup, mRadioGroup2,mRadioGroup3,mRadioGroup4,mRadioGroup5,mRadioGroup6,mRadioGroup7,mRadioGroup8,
            mRadioGroup9,mRadioGroup10,mRadioGroup11,mRadioGroup12,mRadioGroup13,mRadioGroup14,mRadioGroup15,
            mRadioGroup16,mRadioGroup17,mRadioGroup18;
    TextView textView, textView2, textView3, textView4,textView5,textView6,textView7,textView8,textView9,textView10,
            textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textViewID,textViewName;
    RadioButton radioButton,radioButton2,radioButton3,radioButton4,radioButton5,radioButton6,radioButton7,radioButton8,
            radioButton9,radioButton10,radioButton11,radioButton12,radioButton13,radioButton14,radioButton15,radioButton16,radioButton17,radioButton18;
    static userInputGetter setter = new userInputGetter();
    static radioButtonChecker rbc = new radioButtonChecker();
    public String problemStateSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#3c7438"));
        getSupportActionBar().setBackgroundDrawable(colorDrawable);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);}
    public void onClick(View view){

        mRadioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        mRadioGroup2=(RadioGroup)findViewById(R.id.radioGroup2);
        mRadioGroup3=(RadioGroup)findViewById(R.id.radioGroup3);
        mRadioGroup4=(RadioGroup)findViewById(R.id.radioGroup4);
        mRadioGroup5=(RadioGroup)findViewById(R.id.radioGroup5);
        mRadioGroup6=(RadioGroup)findViewById(R.id.radioGroup6);
        mRadioGroup7=(RadioGroup)findViewById(R.id.radioGroup7);
        mRadioGroup8=(RadioGroup)findViewById(R.id.radioGroup8);
        mRadioGroup9=(RadioGroup)findViewById(R.id.radioGroup9);
        mRadioGroup10=(RadioGroup)findViewById(R.id.radioGroup10);
        mRadioGroup11=(RadioGroup)findViewById(R.id.radioGroup11);
        mRadioGroup12=(RadioGroup)findViewById(R.id.radioGroup12);
        mRadioGroup13=(RadioGroup)findViewById(R.id.radioGroup13);
        mRadioGroup14=(RadioGroup)findViewById(R.id.radioGroup14);
        mRadioGroup15=(RadioGroup)findViewById(R.id.radioGroup15);
        mRadioGroup16=(RadioGroup)findViewById(R.id.radioGroup16);
        mRadioGroup17=(RadioGroup)findViewById(R.id.radioGroup17);
        mRadioGroup18=(RadioGroup)findViewById(R.id.radioGroup18);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView12 = (TextView) findViewById(R.id.textView12);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);
        textView16 = (TextView) findViewById(R.id.textView16);
        textView17 = (TextView) findViewById(R.id.textView17);
        textView18 = (TextView) findViewById(R.id.textView18);
        textViewID= (TextView) findViewById(R.id.textViewID);
        textViewName = (TextView) findViewById(R.id.textViewName);
        radioButton=(RadioButton)findViewById(R.id.radioButtonIncorrect1);
        radioButton2=(RadioButton)findViewById(R.id.radioButtonIncorrect2);
        radioButton3=(RadioButton)findViewById(R.id.radioButtonIncorrect3);
        radioButton4=(RadioButton)findViewById(R.id.radioButtonIncorrect4);
        radioButton5=(RadioButton)findViewById(R.id.radioButtonIncorrect5);
        radioButton6=(RadioButton)findViewById(R.id.radioButtonIncorrect6);
        radioButton7=(RadioButton)findViewById(R.id.radioButtonIncorrect7);
        radioButton8=(RadioButton)findViewById(R.id.radioButtonIncorrect8);
        radioButton9=(RadioButton)findViewById(R.id.radioButtonIncorrect9);
        radioButton10=(RadioButton)findViewById(R.id.radioButtonIncorrect10);
        radioButton11=(RadioButton)findViewById(R.id.radioButtonIncorrect11);
        radioButton12=(RadioButton)findViewById(R.id.radioButtonIncorrect12);
        radioButton13=(RadioButton)findViewById(R.id.radioButtonIncorrect13);
        radioButton14=(RadioButton)findViewById(R.id.radioButtonIncorrect14);
        radioButton15=(RadioButton)findViewById(R.id.radioButtonIncorrect15);
        radioButton16=(RadioButton)findViewById(R.id.radioButtonIncorrect16);
        radioButton17=(RadioButton)findViewById(R.id.radioButtonIncorrect17);
        radioButton18=(RadioButton)findViewById(R.id.radioButtonIncorrect18);
        txtID = (EditText)findViewById(R.id.editTextID);
        txtName = (EditText)findViewById(R.id.editTextName);
        if(mRadioGroup.getCheckedRadioButtonId()==-1 || mRadioGroup2.getCheckedRadioButtonId()==-1 ||
                mRadioGroup3.getCheckedRadioButtonId()==-1 || mRadioGroup4.getCheckedRadioButtonId()==-1
                || mRadioGroup5.getCheckedRadioButtonId()==-1 || mRadioGroup6.getCheckedRadioButtonId()==-1
                || mRadioGroup7.getCheckedRadioButtonId()==-1 || mRadioGroup8.getCheckedRadioButtonId()==-1
                || mRadioGroup9.getCheckedRadioButtonId()==-1 || mRadioGroup10.getCheckedRadioButtonId()==-1
                || mRadioGroup11.getCheckedRadioButtonId()==-1 || mRadioGroup12.getCheckedRadioButtonId()==-1
                || mRadioGroup13.getCheckedRadioButtonId()==-1 || mRadioGroup14.getCheckedRadioButtonId()==-1
                || mRadioGroup15.getCheckedRadioButtonId()==-1 || mRadioGroup16.getCheckedRadioButtonId()==-1
                || mRadioGroup17.getCheckedRadioButtonId()==-1 || mRadioGroup18.getCheckedRadioButtonId()==-1
                || txtID.getText().toString().matches("") || txtName.getText().toString().matches("") ){
            Toast.makeText(getApplicationContext(),"Please ensure all checkboxes, ID, and Name fields are complete", Toast.LENGTH_LONG).show();
        }
        else{

        txtname = (EditText)findViewById(R.id.editText);
        txtname2 = (EditText)findViewById(R.id.editText2);
        txtname3 = (EditText)findViewById(R.id.editText3);
        txtname4 = (EditText)findViewById(R.id.editText4);
        txtname5 = (EditText)findViewById(R.id.editText5);
        txtname6 = (EditText)findViewById(R.id.editText6);
        txtname7 = (EditText)findViewById(R.id.editText7);
        txtname8 = (EditText)findViewById(R.id.editText8);
        txtname9 = (EditText)findViewById(R.id.editText9);
        txtname10 = (EditText)findViewById(R.id.editText11);
        txtname11 = (EditText)findViewById(R.id.editText10);
        txtname12 = (EditText)findViewById(R.id.editText12);
        txtname13 = (EditText)findViewById(R.id.editText13);
        txtname14 = (EditText)findViewById(R.id.editText14);
        txtname15 = (EditText)findViewById(R.id.editText15);
        txtname16 = (EditText)findViewById(R.id.editText16);
        txtname17 = (EditText)findViewById(R.id.editText17);
        txtname18 = (EditText)findViewById(R.id.editText18);

        userInput =  textViewID.getText().toString() +" "+ txtID.getText().toString() +"\n" +
                textViewName.getText().toString() +" "+ txtName.getText().toString()+ "\n"
                +"\n"+ textView.getText().toString()  +  " " +check1(1) + " with notes: "+ txtname.getText().toString() +"\n"
                +"\n" +textView2.getText().toString()  +  " " +check1(2) + " with notes: "+ txtname2.getText().toString()+"\n"
                +"\n" +textView3.getText().toString()  +   " " +check1(3) + " with notes: "+ txtname3.getText().toString()+"\n"
                +"\n" +textView4.getText().toString()  +  " " +check1(4) + " with notes: "+ txtname4.getText().toString()+"\n"
                +"\n" +textView5.getText().toString()  +   " " +check1(5) + " with notes: "+ txtname5.getText().toString()+"\n"
                +"\n" +textView6.getText().toString()  +   " " +check1(6) + " with notes: "+ txtname6.getText().toString()+"\n"
                +"\n" +textView7.getText().toString()  +   " " +check1(7) + " with notes: "+ txtname7.getText().toString()+"\n"
                +"\n" +textView8.getText().toString()  +   " " +check1(8) + " with notes: "+ txtname8.getText().toString()+"\n"
                +"\n" +textView9.getText().toString()  +   " " +check1(9) + " with notes: "+ txtname9.getText().toString()+"\n"
                +"\n" +textView10.getText().toString() +   " " +check1(10) + " with notes: "+ txtname10.getText().toString()+"\n"
                +"\n" +textView11.getText().toString() +   " " +check1(11) + " with notes: "+ txtname11.getText().toString()+"\n"
                +"\n" +textView12.getText().toString() +   " " +check1(12) + " with notes: "+ txtname12.getText().toString()+"\n"
                +"\n" +textView13.getText().toString() +  " " +check1(13) + " with notes: "+ txtname13.getText().toString()+"\n"
                +"\n" +textView14.getText().toString() +   " " +check1(14) + " with notes: "+ txtname14.getText().toString()+"\n"
                +"\n" +textView15.getText().toString() +   " " +check1(15) + " with notes: "+ txtname15.getText().toString()+"\n"
                +"\n" +textView16.getText().toString() +   " " +check1(16) + " with notes: "+txtname16.getText().toString()+"\n"
                +"\n" +textView17.getText().toString() +  " " +check1(17) + " with notes: "+txtname17.getText().toString()+"\n"
                +"\n" +textView18.getText().toString() +  " " +check1(18) + " with notes: "+ txtname18.getText().toString()+"\n";
        Toast.makeText(getApplicationContext(), "Attempting to send email with string " + userInput, Toast.LENGTH_LONG ).show();
            backgroundEmailSender email;
        email = new backgroundEmailSender();
        setter.setText(userInput);
        problemStateSet = rbc.states(radioButton,radioButton2,radioButton3,
                radioButton4,radioButton5,
                radioButton6,radioButton7,
                radioButton8,radioButton9);
            DataManager dm = new DataManager(this);
            dm.insert(userInput, problemStateSet);

        email.execute();
        if (email.flag){
           Toast.makeText(getApplicationContext(), "Email did not send, please try again", Toast.LENGTH_LONG).show();
                }
            }}


    String check1(int checkversion){
        switch (checkversion){
            case 1 :  if(radioButton.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }
            case 2:  if(radioButton2.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 3:  if(radioButton3.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 4:  if(radioButton4.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 5:  if(radioButton5.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 6:  if(radioButton6.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 7:  if(radioButton7.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 8:  if(radioButton8.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 9:  if(radioButton9.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 10:  if(radioButton10.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 11:  if(radioButton11.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 12:  if(radioButton12.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 13:  if(radioButton13.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 14:  if(radioButton14.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 15:  if(radioButton15.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 16:  if(radioButton16.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 17:  if(radioButton17.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }

            case 18:  if(radioButton18.isChecked()){
                return "INCORRECT";}
            else{ return "Correct";
            }


            default: return "?";
        }



}


    }