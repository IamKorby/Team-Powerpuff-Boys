package amazingjyc.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleAndroidApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_android_app);
    }

    public void onButtonClickSum(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int sum =  Integer.parseInt(editText1.getText().toString()) + Integer.parseInt(editText2.getText().toString());
        textView.setText(Integer.toString(sum));

    }

    public void onButtonClickDifference(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int difference =  Integer.parseInt(editText1.getText().toString()) - Integer.parseInt(editText2.getText().toString());
        textView.setText(Integer.toString(difference));

    }

    public void onButtonClickProduct(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int product =  Integer.parseInt(editText1.getText().toString()) * Integer.parseInt(editText2.getText().toString());
        textView.setText(Integer.toString(product));

    }

    public void onButtonClickQuotient(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int quotient =  Integer.parseInt(editText1.getText().toString()) / Integer.parseInt(editText2.getText().toString());
        textView.setText(Integer.toString(quotient));

    }

    public void onButtonClickSquared(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int answer1 =  Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText1.getText().toString());
        int answer2 = Integer.parseInt(editText2.getText().toString())*Integer.parseInt(editText2.getText().toString());
        textView.setText("Input 1: "+Integer.toString(answer1)+" Input 2: "+Integer.toString(answer2));

    }

    public void onButtonClickCubed(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int answer1 =  Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText1.getText().toString());
        int answer2 = Integer.parseInt(editText2.getText().toString())*Integer.parseInt(editText2.getText().toString())*Integer.parseInt(editText2.getText().toString());
        textView.setText("Input 1: "+Integer.toString(answer1)+" Input 2: "+Integer.toString(answer2));

    }

    public void onButtonClickSquareRoot(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        double input1 = Integer.parseInt(editText1.getText().toString());
        double input2 = Integer.parseInt(editText2.getText().toString());
        double squareRoot1 = input1/2;
        double squareRoot2 = input2/2;
        double t = 0;

        /*Loop for getting the value of input1*/
        do {
            t = squareRoot1;
            squareRoot1 = (t + (input1 / t)) / 2;
        } while ((t - squareRoot1) != 0);


        t = 0;

        /*Loop for getting the value of input2*/
        do {
            t = squareRoot2;
            squareRoot2 = (t + (input2 / t)) / 2;
        } while ((t - squareRoot2) != 0);

        textView.setText("Input 1: "+Double.toString(squareRoot1)+" Input 2: "+Double.toString(squareRoot2));

    }

    public void onButtonClickModulo(View v){

        EditText editText1 = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        TextView textView = (TextView)findViewById(R.id.textView4);

        int modulo =  Integer.parseInt(editText1.getText().toString()) % Integer.parseInt(editText2.getText().toString());
        textView.setText(Integer.toString(modulo));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_android_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
