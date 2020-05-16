package com.reza.animation.xmlAnimations;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.reza.animation.R;

public class Sequential2Activity extends Activity implements AnimationListener {

	ImageView imgLogo;
	Button btnStart;

	// Animation
	Animator animSequential;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sequential);

		imgLogo = (ImageView) findViewById(R.id.imgLogo);
		btnStart = (Button) findViewById(R.id.btnStart);

		// load the animation
		animSequential = (AnimatorSet)AnimatorInflater.loadAnimator(this,
				R.anim.sequential2);
		animSequential.setTarget(imgLogo);

		// set animation listener
//		animSequential.setAnimationListener(this);

		// button click event
		btnStart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// start the animation
				animSequential.start();
			}
		});

	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for zoom in animation

	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

}