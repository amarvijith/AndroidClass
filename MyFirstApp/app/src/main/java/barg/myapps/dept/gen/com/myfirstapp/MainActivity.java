package barg.myapps.dept.gen.com.myfirstapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import Bean.UserCredentials;

public class MainActivity extends AppCompatActivity {
    EditText edittext;
    public UserCredentials usercredentials;
    //ArrayList<UserCredentials> arraylist = new ArrayList<UserCredentials>();


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.buttonid);
        edittext = (EditText) findViewById(R.id.editTextid);

        usercredentials = new UserCredentials();
        usercredentials.setUserName("bhargavi");
        usercredentials.setPassword("123");




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "in button's onclick listener", Toast.LENGTH_SHORT).show();
                Log.d("bhargavi","in button onclick listener.");
               // Intent intent = new Intent(MainActivity.this,Login.class);
                //Intent intent = new Intent(getBaseContext(),(UserCredentials) Login.setObjectValues(usercredentials));
                //Intent intent = new Intent("android.intent.action.Login");
               // Login login = new Login(this);
              // Intent intent = new Intent("android.intent.action.Bhargavi");
                Intent intent = new Intent("aaa.bbb.ccc.ddd.Bhargavi");
              //  Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.putExtra("name",edittext.getText().toString());
                //intent.putExtra("userObject", usercredentials);
                startActivity(intent);
            }
        });

        Log.i("bhargavi","onCreate ...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("bhargavi","onStart ...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("bhargavi","onPause ...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("bhargavi","onStop ...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("bhargavi","onDestroy ...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("bhargavi","onRestart ...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("bhargavi","onResume ...");
    }

    public void buttonIntent(View view) {
        //Intent intent =  new Intent(Intent.ACTION_VIEW
               // Uri.parse("http://www.google.com")
               // );
//        Intent intent =  new Intent(Intent.ACTION_VIEW
//         //Uri.parse("tel:9535533115")
//         );
        // this.next.class ///

        PackageManager pm = getPackageManager();

        Intent intent = new Intent("xxx.yyy.zzz.Login");
        List<ResolveInfo> activities = pm.queryIntentActivities(intent,PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentsafe = activities.size() > 0 ;

        if( isIntentsafe) {

            Toast.makeText(MainActivity.this, "Login package found....", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }
        else
        {
            Toast.makeText(MainActivity.this, "LOGIN : package not found ", Toast.LENGTH_SHORT).show();
        }


    }
}
