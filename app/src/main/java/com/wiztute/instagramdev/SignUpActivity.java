package com.wiztute.instagramdev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    //Defining the variable
    EditText emailEntryField;
    EditText passwordEntryField;
    Button signUpButton;
    String email;
    String password;
    Toast allowToast, denyToast;
    Intent dashboardIntent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Linking the resource file
        setContentView(R.layout.activity_signup);

        //Initializing the variable
        emailEntryField = (EditText)findViewById(R.id.email_field);
        passwordEntryField = (EditText)findViewById(R.id.password_field);
        signUpButton = (Button)findViewById(R.id.signin_button);
        allowToast = Toast.makeText(getApplicationContext(),"You have been successfully logged in!!!",Toast.LENGTH_LONG);
        denyToast = Toast.makeText(getApplicationContext(),"You are not allowed to login.",Toast.LENGTH_LONG);
        dashboardIntent = new Intent(SignUpActivity.this, DashboardActivity.class);

        //Way of defining a click: Same for all widget
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // To validate if the details entered are correct or not
                // Get the text values from widget and compare
                email = emailEntryField.getText().toString();
                password = passwordEntryField.getText().toString();

                //Compare the values

                //Equality only used for numbers
                //When working with a string, using the equals
                if( email.equals("akash@wiztute.com" ) ){
                    allowToast.show();

                    //Where I navigate to the dashboard activity
                    startActivity(dashboardIntent);
                }else{
                    denyToast.show();
                }
            }
        });


    }
}
