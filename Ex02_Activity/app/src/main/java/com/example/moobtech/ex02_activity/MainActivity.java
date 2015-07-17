package com.example.moobtech.ex02_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Criando a comunicação entre a classe e os botões da action
        nome = (EditText) findViewById(R.id.edtNome);

        //ouvinte do botão Salvar
        Button btn = (Button) findViewById(R.id.btnSalvar);

        //ouvinte do botão Outro Salvar
        Button btnOutro = (Button) findViewById(R.id.btnOutroSalvar);

        //Quando o botão é acionado é chamado o metodo this da propria classe la em baixo onClick
        btn.setOnClickListener(this);

        //Cada botão tem que ter um setOnClickListener
        btnOutro.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //O METODO onClick pode ser feito de duas forma, se tiver mais
    //de um botão qual saber o que foi acionado
    //isso é feito pelo parametro view informado que botão disparou a açõo


    //Quando o botao e acionado é chamado essa class aqui.
    //Primeira forma
    /*@Override
    public void onClick(View v) {
        String texto = nome.getText().toString();
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }*/

    //Segunda forma com mais de um botão, ou seja, mais de um evento
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSalvar:
                String texto = nome.getText().toString();
                Toast.makeText(this, "Botão Salvar foi clicado "+texto, Toast.LENGTH_SHORT).show();
            break;

            case R.id.btnOutroSalvar:
                String texto1 = nome.getText().toString();
                Toast.makeText(this, "Botão Outro Salvar foi clicado "+texto1, Toast.LENGTH_SHORT).show();
            break;

        }
    }
}
