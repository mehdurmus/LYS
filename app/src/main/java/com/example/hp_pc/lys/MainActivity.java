package com.example.hp_pc.lys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_0, et_1, et_2, et_3, et_4, et_5, et_6, et_7, et_8, et_9, et_10, et_11, et_12, et_13, et_14, et_15;
    int mf1;
    int tabanPuan = 200;
    TextView tv;
    Button btn;
    int x0,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                intyap();
                tv.setText(String.valueOf(x0 *3));

            }
        });











    }

    private void intyap() {


        if (!et_0.getText().toString().trim().equals("")) {x0 = Integer.parseInt(et_0.getText().toString());}
        if (!et_1.getText().toString().trim().equals("")) {x1 = Integer.parseInt(et_1.getText().toString());}
        if (!et_2.getText().toString().trim().equals("")) {x2 = Integer.parseInt(et_2.getText().toString());}
        if (!et_3.getText().toString().trim().equals("")) {x3 = Integer.parseInt(et_3.getText().toString());}
        if (!et_4.getText().toString().trim().equals("")) {x4 = Integer.parseInt(et_4.getText().toString());}
        if (!et_5.getText().toString().trim().equals("")) {x5 = Integer.parseInt(et_5.getText().toString());}
        if (!et_6.getText().toString().trim().equals("")) {x6 = Integer.parseInt(et_6.getText().toString());}
        if (!et_7.getText().toString().trim().equals("")) {x7 = Integer.parseInt(et_7.getText().toString());}
        if (!et_8.getText().toString().trim().equals("")) {x8 = Integer.parseInt(et_8.getText().toString());}
        if (!et_9.getText().toString().trim().equals("")) {x9 = Integer.parseInt(et_9.getText().toString());}
        if (!et_10.getText().toString().trim().equals("")) {x10 = Integer.parseInt(et_10.getText().toString());}
        if (!et_11.getText().toString().trim().equals("")) {x11 = Integer.parseInt(et_11.getText().toString());}
        if (!et_12.getText().toString().trim().equals("")) {x12 = Integer.parseInt(et_12.getText().toString());}
        if (!et_13.getText().toString().trim().equals("")) {x13 = Integer.parseInt(et_13.getText().toString());}
        if (!et_14.getText().toString().trim().equals("")) {x14 = Integer.parseInt(et_14.getText().toString());}
        if (!et_15.getText().toString().trim().equals("")) {x15 = Integer.parseInt(et_15.getText().toString());}





    }

    private void init() {

        et_0 = (EditText) findViewById(R.id.et_turkce);
        et_2 = (EditText) findViewById(R.id.et_mat);
        et_1 = (EditText) findViewById(R.id.et_sosyal);
        et_3 = (EditText) findViewById(R.id.et_fen);
        et_4 = (EditText) findViewById(R.id.et_edebiyat);
        et_5 = (EditText) findViewById(R.id.et_matL);
        et_6 = (EditText) findViewById(R.id.et_fizik);
        et_7 = (EditText) findViewById(R.id.et_kimya);
        et_8 = (EditText) findViewById(R.id.et_biyoloji);
        et_9 = (EditText) findViewById(R.id.et_cog1);
        et_11 = (EditText) findViewById(R.id.et_cog2);
        et_10 = (EditText) findViewById(R.id.et_tarih);
        et_12 = (EditText) findViewById(R.id.et_felsefe);
        et_13 = (EditText) findViewById(R.id.et_dil);
        et_14 = (EditText) findViewById(R.id.et_oobp);
        et_15 = (EditText) findViewById(R.id.et_ekpuan);
        tv = (TextView) findViewById(R.id.tv);
        btn = (Button) findViewById(R.id.button);

    }


}
