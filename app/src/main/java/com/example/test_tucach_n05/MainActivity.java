package com.example.test_tucach_n05;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14;
    private TextView X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,X11,X12,X13,X14;
    private TextView V1,V2,V3,V4,V5,V6,V7,V8,V9,V10,V11,V12,V13,V14;
    private TextView T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16;
    private int S[];
    private int C;
    Random random;
    public int flag = 0;

    private void registerEventandControls(){
        D1 = (TextView)findViewById(R.id.D1);
        D2 = (TextView)findViewById(R.id.D2);
        D3 = (TextView)findViewById(R.id.D3);
        D4 = (TextView)findViewById(R.id.D4);
        D5 = (TextView)findViewById(R.id.D5);
        D6 = (TextView)findViewById(R.id.D6);
        D7 = (TextView)findViewById(R.id.D7);
        D8 = (TextView)findViewById(R.id.D8);
        D9 = (TextView)findViewById(R.id.D9);
        D10 = (TextView)findViewById(R.id.D10);
        D11 = (TextView)findViewById(R.id.D11);
        D12 = (TextView)findViewById(R.id.D12);
        D13 = (TextView)findViewById(R.id.D13);
        D14 = (TextView)findViewById(R.id.D14);

        X1 = (TextView)findViewById(R.id.X1);
        X2 = (TextView)findViewById(R.id.X2);
        X3 = (TextView)findViewById(R.id.X3);
        X4 = (TextView)findViewById(R.id.X4);
        X5 = (TextView)findViewById(R.id.X5);
        X6 = (TextView)findViewById(R.id.X6);
        X7 = (TextView)findViewById(R.id.X7);
        X8 = (TextView)findViewById(R.id.X8);
        X9 = (TextView)findViewById(R.id.X9);
        X10 = (TextView)findViewById(R.id.X10);
        X11 = (TextView)findViewById(R.id.X11);
        X12 = (TextView)findViewById(R.id.X12);
        X13 = (TextView)findViewById(R.id.X13);
        X14 = (TextView)findViewById(R.id.X14);

        V1 = (TextView)findViewById(R.id.V1);
        V2 = (TextView)findViewById(R.id.V2);
        V3 = (TextView)findViewById(R.id.V3);
        V4 = (TextView)findViewById(R.id.V4);
        V5 = (TextView)findViewById(R.id.V5);
        V6 = (TextView)findViewById(R.id.V6);
        V7 = (TextView)findViewById(R.id.V7);
        V8 = (TextView)findViewById(R.id.V8);
        V9 = (TextView)findViewById(R.id.V9);
        V10 = (TextView)findViewById(R.id.V10);
        V11 = (TextView)findViewById(R.id.V11);
        V12 = (TextView)findViewById(R.id.V12);
        V13 = (TextView)findViewById(R.id.V13);
        V14 = (TextView)findViewById(R.id.V14);

        T1 = (TextView)findViewById(R.id.T1);
        T2 = (TextView)findViewById(R.id.T2);
        T3 = (TextView)findViewById(R.id.T3);
        T4 = (TextView)findViewById(R.id.T4);
        T5 = (TextView)findViewById(R.id.T5);
        T6 = (TextView)findViewById(R.id.T6);
        T7 = (TextView)findViewById(R.id.T7);
        T8 = (TextView)findViewById(R.id.T8);
        T9 = (TextView)findViewById(R.id.T9);
        T10 = (TextView)findViewById(R.id.T10);
        T11 = (TextView)findViewById(R.id.T11);
        T12 = (TextView)findViewById(R.id.T12);
        T13 = (TextView)findViewById(R.id.T13);
        T14 = (TextView)findViewById(R.id.T14);
        T15 = (TextView)findViewById(R.id.T15);
        T16 = (TextView)findViewById(R.id.T16);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerEventandControls();
        S = new int [101];
        for(int i=0;i<101;i++){
            random = new Random();
            S[i] = random.nextInt();
        }
    }

    @Override
    protected void onStop() {
        if(TienIch.InClass(C,S))
            Toast.makeText(MainActivity.this,C + " - Có",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this,C + " - Không", Toast.LENGTH_SHORT).show();
        C = -1;
        super.onStop();
    }
    public void Click(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                C++;
                if(flag == 1){
                    V1.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V2.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V3.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V4.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V5.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V6.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V7.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V8.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V9.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V10.setBackgroundColor(Color.parseColor("#8BC34A"));;
                    V11.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V12.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V13.setBackgroundColor(Color.parseColor("#8BC34A"));
                    V14.setBackgroundColor(Color.parseColor("#8BC34A"));

                    T1.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T2.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T3.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T4.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T5.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T6.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T7.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T8.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T9.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T10.setBackgroundColor(Color.parseColor("#FFEB3B"));;
                    T11.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T12.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T13.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T14.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T15.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    T16.setBackgroundColor(Color.parseColor("#FFEB3B"));

                    D1.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D2.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D3.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D4.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D5.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D6.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D7.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D8.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D9.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D10.setBackgroundColor(Color.parseColor("#9C27B0"));;
                    D11.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D12.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D13.setBackgroundColor(Color.parseColor("#9C27B0"));
                    D14.setBackgroundColor(Color.parseColor("#9C27B0"));

                    X1.setBackgroundColor(Color.parseColor("#F44336"));
                    X2.setBackgroundColor(Color.parseColor("#F44336"));
                    X3.setBackgroundColor(Color.parseColor("#F44336"));
                    X4.setBackgroundColor(Color.parseColor("#F44336"));
                    X5.setBackgroundColor(Color.parseColor("#F44336"));
                    X6.setBackgroundColor(Color.parseColor("#F44336"));
                    X7.setBackgroundColor(Color.parseColor("#F44336"));
                    X8.setBackgroundColor(Color.parseColor("#F44336"));
                    X9.setBackgroundColor(Color.parseColor("#F44336"));
                    X10.setBackgroundColor(Color.parseColor("#F44336"));;
                    X11.setBackgroundColor(Color.parseColor("#F44336"));
                    X12.setBackgroundColor(Color.parseColor("#F44336"));
                    X13.setBackgroundColor(Color.parseColor("#F44336"));
                    X14.setBackgroundColor(Color.parseColor("#F44336"));

                }
                else if(flag == 2){
                    V1.setBackgroundColor(Color.parseColor("#F44336"));
                    V2.setBackgroundColor(Color.parseColor("#F44336"));
                    V3.setBackgroundColor(Color.parseColor("#F44336"));
                    V4.setBackgroundColor(Color.parseColor("#F44336"));
                    V5.setBackgroundColor(Color.parseColor("#F44336"));
                    V6.setBackgroundColor(Color.parseColor("#F44336"));
                    V7.setBackgroundColor(Color.parseColor("#F44336"));
                    V8.setBackgroundColor(Color.parseColor("#F44336"));
                    V9.setBackgroundColor(Color.parseColor("#F44336"));
                    V10.setBackgroundColor(Color.parseColor("#F44336"));;
                    V11.setBackgroundColor(Color.parseColor("#F44336"));
                    V12.setBackgroundColor(Color.parseColor("#F44336"));
                    V13.setBackgroundColor(Color.parseColor("#F44336"));
                    V14.setBackgroundColor(Color.parseColor("#F44336"));

                    T1.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T2.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T3.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T4.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T5.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T6.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T7.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T8.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T9.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T10.setBackgroundColor(Color.parseColor("#8BC34A"));;
                    T11.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T12.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T13.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T14.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T15.setBackgroundColor(Color.parseColor("#8BC34A"));
                    T16.setBackgroundColor(Color.parseColor("#8BC34A"));

                    D1.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D2.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D3.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D4.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D5.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D6.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D7.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D8.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D9.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D10.setBackgroundColor(Color.parseColor("#FFEB3B"));;
                    D11.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D12.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D13.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    D14.setBackgroundColor(Color.parseColor("#FFEB3B"));

                    X1.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X2.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X3.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X4.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X5.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X6.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X7.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X8.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X9.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X10.setBackgroundColor(Color.parseColor("#9C27B0"));;
                    X11.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X12.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X13.setBackgroundColor(Color.parseColor("#9C27B0"));
                    X14.setBackgroundColor(Color.parseColor("#9C27B0"));

                }
                else if (flag == 3){
                    V1.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V2.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V3.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V4.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V5.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V6.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V7.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V8.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V9.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V10.setBackgroundColor(Color.parseColor("#9C27B0"));;
                    V11.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V12.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V13.setBackgroundColor(Color.parseColor("#9C27B0"));
                    V14.setBackgroundColor(Color.parseColor("#9C27B0"));

                    T1.setBackgroundColor(Color.parseColor("#F44336"));
                    T2.setBackgroundColor(Color.parseColor("#F44336"));
                    T3.setBackgroundColor(Color.parseColor("#F44336"));
                    T4.setBackgroundColor(Color.parseColor("#F44336"));
                    T5.setBackgroundColor(Color.parseColor("#F44336"));
                    T6.setBackgroundColor(Color.parseColor("#F44336"));
                    T7.setBackgroundColor(Color.parseColor("#F44336"));
                    T8.setBackgroundColor(Color.parseColor("#F44336"));
                    T9.setBackgroundColor(Color.parseColor("#F44336"));
                    T10.setBackgroundColor(Color.parseColor("#F44336"));;
                    T11.setBackgroundColor(Color.parseColor("#F44336"));
                    T12.setBackgroundColor(Color.parseColor("#F44336"));
                    T13.setBackgroundColor(Color.parseColor("#F44336"));
                    T14.setBackgroundColor(Color.parseColor("#F44336"));
                    T15.setBackgroundColor(Color.parseColor("#F44336"));
                    T16.setBackgroundColor(Color.parseColor("#F44336"));

                    D1.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D2.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D3.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D4.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D5.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D6.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D7.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D8.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D9.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D10.setBackgroundColor(Color.parseColor("#8BC34A"));;
                    D11.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D12.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D13.setBackgroundColor(Color.parseColor("#8BC34A"));
                    D14.setBackgroundColor(Color.parseColor("#8BC34A"));

                    X1.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X2.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X3.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X4.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X5.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X6.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X7.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X8.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X9.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X10.setBackgroundColor(Color.parseColor("#FFEB3B"));;
                    X11.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X12.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X13.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    X14.setBackgroundColor(Color.parseColor("#FFEB3B"));
                }
                else if(flag == 4){
                    V1.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V2.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V3.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V4.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V5.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V6.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V7.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V8.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V9.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V10.setBackgroundColor(Color.parseColor("#FFEB3B"));;
                    V11.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V12.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V13.setBackgroundColor(Color.parseColor("#FFEB3B"));
                    V14.setBackgroundColor(Color.parseColor("#FFEB3B"));

                    T1.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T2.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T3.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T4.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T5.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T6.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T7.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T8.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T9.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T10.setBackgroundColor(Color.parseColor("#9C27B0"));;
                    T11.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T12.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T13.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T14.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T15.setBackgroundColor(Color.parseColor("#9C27B0"));
                    T16.setBackgroundColor(Color.parseColor("#9C27B0"));

                    D1.setBackgroundColor(Color.parseColor("#F44336"));
                    D2.setBackgroundColor(Color.parseColor("#F44336"));
                    D3.setBackgroundColor(Color.parseColor("#F44336"));
                    D4.setBackgroundColor(Color.parseColor("#F44336"));
                    D5.setBackgroundColor(Color.parseColor("#F44336"));
                    D6.setBackgroundColor(Color.parseColor("#F44336"));
                    D7.setBackgroundColor(Color.parseColor("#F44336"));
                    D8.setBackgroundColor(Color.parseColor("#F44336"));
                    D9.setBackgroundColor(Color.parseColor("#F44336"));
                    D10.setBackgroundColor(Color.parseColor("#F44336"));;
                    D11.setBackgroundColor(Color.parseColor("#F44336"));
                    D12.setBackgroundColor(Color.parseColor("#F44336"));
                    D13.setBackgroundColor(Color.parseColor("#F44336"));
                    D14.setBackgroundColor(Color.parseColor("#F44336"));

                    X1.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X2.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X3.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X4.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X5.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X6.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X7.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X8.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X9.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X10.setBackgroundColor(Color.parseColor("#8BC34A"));;
                    X11.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X12.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X13.setBackgroundColor(Color.parseColor("#8BC34A"));
                    X14.setBackgroundColor(Color.parseColor("#8BC34A"));

                    flag = 0;
                }
            }
        });
    }
}