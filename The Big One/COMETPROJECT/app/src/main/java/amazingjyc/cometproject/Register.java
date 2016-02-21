package amazingjyc.cometproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static amazingjyc.cometproject.R.id.registerbutton;

public class Register extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    Spinner spinner;
    Button registerButton;
    EditText userNameET, passwordET, firstNameET, lastNameET, idNumberET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.DegreeProgram, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        userNameET = (EditText) findViewById(R.id.editText3);
        passwordET = (EditText) findViewById(R.id.editText4);
        idNumberET = (EditText) findViewById(R.id.editText5);
        firstNameET = (EditText) findViewById(R.id.editText6);
        lastNameET = (EditText) findViewById(R.id.editText7);
        registerButton = (Button) findViewById(R.id.registerbutton);

        registerButton.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this,"You Selected "+myText.getText(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.registerbutton:
                String username = userNameET.getText().toString();
                String password = passwordET.getText().toString();
                String firstname = firstNameET.getText().toString();
                String lastname = lastNameET.getText().toString();
                int idnumber = Integer.parseInt(idNumberET.getText().toString());

                User savedUser = new User(username, firstname, lastname, password, idnumber);
                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
