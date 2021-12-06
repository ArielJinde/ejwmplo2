package jinde.app_00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2;
    Button btn_calcular;
    TextView text_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // setContetView asocia el archivo javo logico con el xml gui
        setContentView(R.layout.activity_main);

        text1=(EditText) findViewById(R.id.editText1);

        text2=(EditText) findViewById(R.id.editText2);
        text_resultado = (TextView) findViewById(R.id.textView2);
        btn_calcular =(Button) findViewById(R.id.button4);
        btn_calcular.setOnClickListener(this::click_Button);

    }

public void click_Button (View v){
        int valor1 =Integer.parseInt(text1.getText().toString());
        int valor2 =Integer.parseInt(text2.getText().toString());
        int resulted = valor1+valor2;
        text_resultado.setText("La suma es: "+resulted);
}
}