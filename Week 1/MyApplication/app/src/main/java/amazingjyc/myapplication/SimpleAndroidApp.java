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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onButtonClickAdd(View v){

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
