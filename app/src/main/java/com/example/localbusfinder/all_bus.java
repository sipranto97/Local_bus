package com.example.localbusfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class all_bus extends AppCompatActivity {
    private Button bu2,bu3;
    private TextView t1,t2,t3,v1,v2,v3,f1,d1;
    private View p1,p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_bus);
        t1=findViewById(R.id.b1);
        t2=findViewById(R.id.b2);
        t3=findViewById(R.id.b3);

        f1=findViewById(R.id.from);
        d1= findViewById(R.id.to);
        bu2=findViewById(R.id.button2);
        bu3=findViewById(R.id.button3);
        p1= findViewById(R.id.view2);
        p2= findViewById(R.id.view3);
        v1=findViewById(R.id.vara);
        v2=findViewById(R.id.vara2);
        v3=findViewById(R.id.vara3);
       // v=findViewById(R.id.vara);
        showdata();



    }
    public void Route(View view) {
       findRoute();


    }

    private void findRoute() {
        Intent intent = getIntent();
        String a= intent.getStringExtra("r1");
        String b= intent.getStringExtra("r2");
        String c= intent.getStringExtra("so");
        String d= intent.getStringExtra("dis");

        Intent routeintent= new Intent(getApplicationContext(), bus_route.class);
        routeintent.putExtra("d1", a );
        routeintent.putExtra("d2", b);
        routeintent.putExtra("so",c );
        routeintent.putExtra("des", d);
        startActivity(routeintent);

    }




    private void showdata() {
        Intent intent = getIntent();
        String a= intent.getStringExtra("b1");
        String b= intent.getStringExtra("b2");
        String z= intent.getStringExtra("b3");
        String c= intent.getStringExtra("so");
        String d= intent.getStringExtra("dis");
        String e= intent.getStringExtra("r1");
        String f= intent.getStringExtra("r2");


        String g= intent.getStringExtra("va");

        t1.setText(a);
      v1.setText(g);
        f1.setText(c);
        d1.setText(d);
        if(b==null)
        {
            t2.setVisibility(View.GONE);
            bu2.setVisibility(View.GONE);
            p1.setVisibility(View.GONE);
            p2.setVisibility(View.GONE);
          v2.setVisibility(View.GONE);
        }
        else
        {
            t2.setText(b);
            v2.setText(g);
        }

        if(z==null)
        {
            t3.setVisibility(View.GONE);
            bu3.setVisibility(View.GONE);
            p1.setVisibility(View.GONE);
            v3.setVisibility(View.GONE);
        }
        else
        {
            t3.setText(z);
            v3.setText(g);
        }


    }

    //initialize button


}