package com.quizz.exemplointenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EnviarMensagemActivity extends AppCompatActivity {
    EditText textMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_mensagem);
        textMsg = (EditText) findViewById(R.id.editTextTextMsg);
    }
    public void btnEnviarMsgClick(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/pain");
        intent.putExtra(Intent.EXTRA_TEXT,textMsg.getText());
        startActivity(intent);
    }
    public void btnVoltarClick(View view){
        finish();
    }
}