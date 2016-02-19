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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button logoutButton;
    TextView userName, firstName, lastName, idNumber;
    //EditText userNameET, firstNameET, lastNameET, idNumberET;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (TextView) findViewById(R.id.textView9);
        idNumber = (TextView) findViewById(R.id.textView10);
        firstName = (TextView) findViewById(R.id.textView11);
        lastName = (TextView) findViewById(R.id.textView12);
        logoutButton = (Button) findViewById(R.id.logoutbutton);

        /*userNameET = (EditText) findViewById(R.id.editText3);
        idNumberET = (EditText) findViewById(R.id.editText4);
        firstNameET = (EditText) findViewById(R.id.editText6);
        lastNameET = (EditText) findViewById(R.id.editText7);

        userName.setText(userNameET.getText().toString());
        firstName.setText(firstNameET.getText().toString());
        lastName.setText(lastNameET.getText().toString());
        idNumber.setText(idNumberET.getText().toString());*/

        logoutButton.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (authenticate() == true)
            displayUserdetails();
    }

    private void displayUserdetails() {
        User user = userLocalStore.getLoggedInUser();

        userName.setText(user.userName);
        firstName.setText(user.firstName);
        lastName.setText(user.lastName);
        userName.setText(user.userName);
        idNumber.setText(user.idNumber + "");

    }

    private boolean authenticate(){
        return userLocalStore.getUserLoggedin();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.logoutbutton:
                User user;
                userLocalStore.ClearUserData();
                userLocalStore.setUserLoggedin(false);
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}