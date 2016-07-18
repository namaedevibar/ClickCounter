package com.activity.devibar.clickcounter;

import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello";

    //private EditText mEtName;
   private TextView mTxtView;
    private Button mBtnClick;
    private int a = 0;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  mEtName = (EditText) findViewById(R.id.etName);
        mBtnClick = (Button) findViewById(R.id.btnClick);
        mTxtView = (TextView) findViewById(R.id.txtView);

        //on click listener
        mBtnClick.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        a++;
    }

//        View.OnClickListener myOnClickListener =  new View.OnClickListener(){
//
//
//            @Override
//            public void onClick(View v) {
//                a++;
//                mTxtView.setText(""+a);
//            }
//        };
//
//        mBtnClick.setOnClickListener(myOnClickListener);







//onclick method
//    public void btnClick(View view) {
//        //String name = mEtName.getText().toString();
//
//
//
//
////        Toast.makeText(this, " "+ i, Toast.LENGTH_SHORT).show();
//       //int count = mTxtView.setText(i).toString();
//        //count.show();
////        new AlertDialog.Builder(this)
////                .setTitle("Greetings")
////                .setMessage("Welcome " + name + " " + i)
////                .setPositiveButton("Yes", null)
////                .setNegativeButton("No", null)
////                .setNeutralButton("Cancel", null)
////                .show();
//
//
//    }


}
