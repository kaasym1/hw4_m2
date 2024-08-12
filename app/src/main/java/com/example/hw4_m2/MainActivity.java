package com.example.hw4_m2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_enter = findViewById(R.id.tv_enter);
        EditText editText1 = findViewById(R.id.edit_text_one);
        EditText editText2 = findViewById(R.id.edit_text_two);
        Button button = findViewById(R.id.button);
        TextView doEnter = findViewById(R.id.do_enter);
        LinearLayout linearLayout = findViewById(R.id.edit_text);
        TextView forgotPassword = findViewById(R.id.forgot_password);
        TextView clickHere = findViewById(R.id.click_here);
        TextView welcome = findViewById(R.id.welcome);


        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getResources().getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(getResources().getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button.setOnClickListener(view -> {

            String login = editText1.getText().toString();
            String password = editText2.getText().toString();

            if (login.equals("admin") && password.equals("admin")) {
                linearLayout.setVisibility(View.GONE);
                tv_enter.setVisibility(View.GONE);
                doEnter.setVisibility(View.GONE);
                forgotPassword.setVisibility(View.GONE);
                clickHere.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                welcome.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
            }
        });
    }
}