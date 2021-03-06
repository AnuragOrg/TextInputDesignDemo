package anurag.example.com.textinputlayoutdesigndemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textDummyHintMobileNumber;
    TextView textDummyHintPromoCode;
    EditText editMobileNumber;
    EditText editPromoCode;
//prasad
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDummyHintMobileNumber = (TextView) findViewById(R.id.text_dummy_hint_mobile_number);
        textDummyHintPromoCode = (TextView) findViewById(R.id.text_dummy_hint_promo_code);
        editMobileNumber = (EditText) findViewById(R.id.edit_mobile_number);
        editPromoCode = (EditText) findViewById(R.id.edit_promo_code);

        // Mobile number
        editMobileNumber.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // Show white background behind floating label
                            textDummyHintMobileNumber.setVisibility(View.VISIBLE);
                        }
                    }, 100);
                } else {
                    // Required to show/hide white background behind floating label during focus change
                    if (editMobileNumber.getText().length() > 0)
                        textDummyHintMobileNumber.setVisibility(View.VISIBLE);
                    else
                        textDummyHintMobileNumber.setVisibility(View.INVISIBLE);
                }
            }
        });

        // Promo code
        editPromoCode.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

                if (hasFocus) {
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            // Show white background behind floating label
                            textDummyHintPromoCode.setVisibility(View.VISIBLE);
                        }
                    }, 100);
                } else {
                    // Required to show/hide white background behind floating label during focus change
                    if (editPromoCode.getText().length() > 0)
                        textDummyHintPromoCode.setVisibility(View.VISIBLE);
                    else
                        textDummyHintPromoCode.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
