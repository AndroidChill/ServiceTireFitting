package beelove.store.servicetirefitting;

import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

        private EditText editText;
        private Spinner spinner;
        private Button button;
        private String phone;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextInputPhone);
        spinner = findViewById(R.id.spinnerCity);
        button = findViewById(R.id.btnContinue);



        editText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());



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


}