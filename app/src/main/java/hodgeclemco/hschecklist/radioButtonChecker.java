package hodgeclemco.hschecklist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;


public class radioButtonChecker extends AppCompatActivity {
    public static String problemState;
    boolean state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String states(RadioButton rb,RadioButton rb2,RadioButton rb3,RadioButton rb4,
                         RadioButton rb5,RadioButton rb6,RadioButton rb7,RadioButton rb8,
                         RadioButton rb9){

        if (rb.isChecked() || rb.isChecked() || rb2.isChecked() || rb3.isChecked()
                || rb4.isChecked() || rb5.isChecked() || rb6.isChecked() || rb7.isChecked()
                || rb8.isChecked() || rb9.isChecked()){
            problemState = "[Requires Attention]";
            return problemState;
        }
        else {
            problemState = "[OK]";
            return problemState;
        }

    }
    public String getStateString(){
        return problemState;
    }
}
