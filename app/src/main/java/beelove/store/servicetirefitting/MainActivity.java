package beelove.store.servicetirefitting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import beelove.store.servicetirefitting.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        private EditText editText;
        private EditText spinner;
        private Button button;
        private ImageButton settingButton;
        private String phone;


        private ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        editText = binding.editTextInputPhone;
        spinner = findViewById(R.id.et_city);
        button = findViewById(R.id.btnContinue);
        settingButton = findViewById(R.id.btn_setting);

        initListener();

        editText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        }

        private void initListener() {
                button.setOnClickListener(this::clickBtnConinue);

                settingButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "click setting button", Toast.LENGTH_LONG).show();
                        }
                });

                spinner.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                // realization dialog
                        }
                });
        }

        /*--Тут должен быт метод сохранения телефона если он нам куда-то нужен--*/
       /* @Override
        protected void onSaveInstanceState(Bundle outState) {
                outState.putString("Phone", phone);
                if(phone!=null)

                super.onSaveInstanceState(outState);
        }*/

        public void clickBtnConinue(View view) {

                Intent intent = new Intent(this, PinCodeActivity.class);
                startActivity(intent);
        }

        @Override
        protected void onSaveInstanceState(@NonNull Bundle outState) {
                super.onSaveInstanceState(outState);
        }
}