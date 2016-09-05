package barg.myapps.dept.gen.com.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Bean.UserCredentials;

public class Login extends AppCompatActivity {

//    public static UserCredentials usercredentials =  new UserCredentials();

   /* public static  UserCredentials setObjectValues(UserCredentials user){
        usercredentials.setPassword(user.getPassword());
        usercredentials.setUserName(user.getUserName());

        return usercredentials;
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Toast.makeText(Login.this, "I am on login page", Toast.LENGTH_LONG).show();

        Intent intent = getIntent();

        UserCredentials user = (UserCredentials) intent.getSerializableExtra("userObject");


        TextView loginUserName = (TextView) findViewById(R.id.loginUserName);
        //loginUserName.setText(user.getPassword().toString());


        TextView loginPasswrod = (TextView)findViewById(R.id.loginPassword);
       // loginPasswrod.setText(user.getPassword().toString());

    }
}
