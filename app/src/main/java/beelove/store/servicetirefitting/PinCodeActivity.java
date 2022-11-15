package beelove.store.servicetirefitting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PinCodeActivity extends AppCompatActivity {
    private int counterCircles = 0;

    private TextView circleOne;
    private TextView circleTwo;
    private TextView circleThree;
    private TextView circleFour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
        circleOne = findViewById(R.id.circle_1);
        circleTwo = findViewById(R.id.circle_2);
        circleThree = findViewById(R.id.circle_3);
        circleFour = findViewById(R.id.circle_4);
    }



    public void changeCircle() {

        if (counterCircles == 0 || counterCircles < 4) {
            counterCircles++;
            switch (counterCircles) {
                case (1):
                    circleOne.setBackgroundResource(R.drawable.circle_full);
                    break;
                case (2):
                    circleTwo.setBackgroundResource(R.drawable.circle_full);
                    break;
                case (3):
                    circleThree.setBackgroundResource(R.drawable.circle_full);
                    break;
                case (4):
                    circleFour.setBackgroundResource(R.drawable.circle_full);
                    break;
            }

        }
    }

    public void removeCircle() {
        if (counterCircles > 0 || counterCircles < 5) {

            switch (counterCircles) {
                case (1):
                    circleOne.setBackgroundResource(R.drawable.circle_empty);
                    break;
                case (2):
                    circleTwo.setBackgroundResource(R.drawable.circle_empty);
                    break;
                case (3):
                    circleThree.setBackgroundResource(R.drawable.circle_empty);
                    break;
                case (4):
                    circleFour.setBackgroundResource(R.drawable.circle_empty);
                    break;
            }
            counterCircles--;
        }
    }


    public void clickBtnOne(View view) {
        changeCircle();

        }


    public void clickBtnTwo(View view) {changeCircle();
    }

    public void clickBtnThree(View view) {changeCircle();
    }

    public void clickBtnFour(View view) {changeCircle();
    }

    public void clickBtnFive(View view) {changeCircle();
    }

    public void clickBtnSix(View view) {changeCircle();
    }

    public void clickBtnSeven(View view) {changeCircle();
    }

    public void clickBtnEight(View view) {changeCircle();
    }

    public void clickBtnNine(View view) {changeCircle();
    }
    public void clickBtnZero(View view) {changeCircle();
    }

    public void clickBtnFinger(View view) {
    }

    public void clickBtnBackspace(View view) {
            removeCircle();
        }

}