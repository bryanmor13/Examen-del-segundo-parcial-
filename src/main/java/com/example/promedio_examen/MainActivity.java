package com.example.promedio_examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        import androidx.appcompat.app.AppCompatActivity;
        ActivityMainBinding binding =
                ActivityMainBinding.inflate(getLayoutInflater());//formar un layout
        setContentView(binding.getRoot());


        Log.d("MainActivity","ActivityCreate");
        binding.buttoncal.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String age = binding.ageEdit.getText().toString();
                if(!age.isEmpty()) {
                    int ageInt = Integer.parseInt(age);
                    int result = ageInt * 7;
                    String resultString = "Si promedio , es
                    calcular " + result + " promedio ";
                    binding.resultText.setText(resultString);
                }else {
                    Log.d("MainActivity","");

                    contexto
                    Toast.makeText(MainActivity.this, "Debes insertar
                            un promedio", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}



