package barg.myapps.dept.gen.com.intentcaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent("android.intent.action.Login");
        // Login login = new Login(this);
        //intent.putExtra("name",edittext.getText().toString());
        //intent.putExtra("userObject", usercredentials);
        startActivity(intent);
    }
}
