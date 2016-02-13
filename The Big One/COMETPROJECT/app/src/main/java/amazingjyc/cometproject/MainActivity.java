package amazingjyc.cometproject;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button logoutButton;
    EditText userName, firstName, lastName, idNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.editText3);
        idNumber = (EditText) findViewById(R.id.editText5);
        firstName = (EditText) findViewById(R.id.editText6);
        lastName = (EditText) findViewById(R.id.editText7);
        logoutButton = (Button) findViewById(R.id.button3);

        logoutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}