package amazingjyc.cometproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginButton, registerButton;
    TextView userNameTV, passwordTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.button);
        registerButton = (Button) findViewById(R.id.button4);
        userNameTV = (TextView) findViewById(R.id.textView);
        passwordTV = (TextView) findViewById(R.id.textView2);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        userNameTV.setOnClickListener(this);
        passwordTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.button4:
                startActivity(new Intent(this, Register.class));
                break;
        }
    }
}
