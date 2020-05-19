
package com.reza.animation.temp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reza.animation.R;

public class DrawTrainActivity extends Activity  {

    private static final int TIMER_LENGTH = 30;

    private TimerView mTimerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);

        mTimerView = (TimerView) findViewById(R.id.timer);

        final Button timerStartButton = (Button) findViewById(R.id.btn_timer_start);
        mTimerView.start(TIMER_LENGTH);

        timerStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTimerView.start(TIMER_LENGTH);
            }
        });
    }

    @Override
    protected void onPause() {
        mTimerView.stop();

        super.onPause();
    }
}
