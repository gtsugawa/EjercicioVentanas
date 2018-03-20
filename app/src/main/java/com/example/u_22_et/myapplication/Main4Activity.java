package com.example.u_22_et.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class Main4Activity extends AppCompatActivity {

    EditText e_user, e_pass;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        e_user = findViewById(R.id.editText);
        e_pass = findViewById(R.id.editText2);
        enviar = findViewById(R.id.button);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AsyncHttpClient cliente = new AsyncHttpClient();
                RequestParams parametros = new RequestParams();
                parametros.put("usuario",e_user.getText().toString());
                parametros.put("clave",e_pass.getText().toString());
                Context c = getApplicationContext();
                String url = "http://www.programadoresperuanos.com/test_app/login.php";
                cliente.post(c, url, parametros, new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                    }
                })

            }
        });
    }
}
