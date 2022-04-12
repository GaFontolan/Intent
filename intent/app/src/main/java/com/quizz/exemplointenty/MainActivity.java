package com.quizz.exemplointenty;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnAbrirTelaMsgClick(View view){
        //(this, EnviarMensagemActivity.class) ele fala qual tela voce vai chamar
        Intent intent = new Intent(this, EnviarMensagemActivity.class);
        startActivity(intent);
    }
    public void btnTelefonarClick(View view){
        Uri uri = Uri.parse("tel:015000000000");
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }

//TELEFONAR DIRETO
    //public void btnTelefonarClick(View view){
      //  Uri uri = Uri.parse("tel:015000000000");
        //Intent intent = new Intent(Intent.ACTION_CALL, uri);

    //int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
    //if (permissionCheck != PackageManager.PERMISSION_GRANTED){
        //ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    //}else{
        //startActivity(intent);
    //}
    //}

    public void btnAbrirNavegadorClick(View view){
        Uri uri = Uri.parse("https://www.google.com.br/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btnAbrirMapaClick(View view){
        Uri uri = Uri.parse("geo:0,0?q=Rua+Vaifro+De+Biaggi+95");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void btnNavegarClick(View view){
        Uri uri = Uri.parse("google.navegation:q=Rua+Vaifro+De+Biaggi+95");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
//Método TirarFoto e Filmar esta no powerPoint da aula de hoje 11/04