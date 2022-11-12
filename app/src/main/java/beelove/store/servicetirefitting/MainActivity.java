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

public class MainActivity extends AppCompatActivity {

        private EditText editText;
        private Spinner spinner;
        private Button button;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextInputPhone);
        spinner = findViewById(R.id.spinnerCity);
        button = findViewById(R.id.btnContinue);

                editText.addTextChangedListener(new CurrencyTextWatcher());

        }

        private class CurrencyTextWatcher implements TextWatcher {  /// Зачем объявлен новый класс?

                StringBuilder sb = new StringBuilder();
                boolean ignore;

                private final char numPlace = 'X';

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void afterTextChanged(Editable editable) {
                        if (!ignore) {
                                removeFormat(editable.toString());
                                applyFormat(sb.toString());
                                ignore = true;
                                editable.replace(0, editable.length(), sb.toString());
                                ignore = false;
                        }
                }

                private void removeFormat(String text) {
                        sb.setLength(0);
                        for (int i = 0; i < text.length(); i++) {
                                char c = text.charAt(i);
                                if (isNumberChar(c)) {
                                        sb.append(c);
                                }
                        }
                }

                private void applyFormat(String text) {
                        String template = getTemplate(text);
                        sb.setLength(0);
                        for (int i = 0, textIndex = 0; i < template.length() && textIndex < text.length(); i++) {
                                if (template.charAt(i) == numPlace) {
                                        sb.append(text.charAt(textIndex));
                                        textIndex++;
                                } else {
                                        sb.append(template.charAt(i));
                                }
                        }
                }

                private boolean isNumberChar(char c) {
                        return c >= '0' && c <= '9';
                }

                private String getTemplate(String text) {
                        if (text.startsWith("8")) {
                                return "X (XXX) XXX-XX-XX";
                        }
                        if (text.startsWith("7")) {
                                return "+X (XXX) XXX-XX-XX";
                        }
                        if (text.startsWith("9")) {
                                return "+7 (XXX) XXX-XX-XX";
                        }
                        return  "+X (XXX) XXX-XX-XX";
                }
        }
        public void clickBtnConinue(View view) {
                Intent intent = new Intent(this, PinCodeActivity.class);
                startActivity(intent);
        }

        public void clickInputPhone(View view) {

        }
}