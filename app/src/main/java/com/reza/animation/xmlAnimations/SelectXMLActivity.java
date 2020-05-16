package com.reza.animation.xmlAnimations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reza.animation.R;

public class SelectXMLActivity extends Activity {

	Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
			btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
			btnBounce, btnSequential , btn2Sequential, btnTogether;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_xml);

		btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
		btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
		btnCrossFade = (Button) findViewById(R.id.btnCrossFade);
		btnBlink = (Button) findViewById(R.id.btnBlink);
		btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
		btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
		btnRotate = (Button) findViewById(R.id.btnRotate);
		btnMove = (Button) findViewById(R.id.btnMove);
		btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
		btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
		btnBounce = (Button) findViewById(R.id.btnBounce);
		btnSequential = (Button) findViewById(R.id.btnSequential);
		btn2Sequential = (Button) findViewById(R.id.btn2Sequential);
		btnTogether = (Button) findViewById(R.id.btnTogether);

		/*
		 * Buttons click events
		 */

		// fade in
		btnFadeIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, FadeInActivity.class);
				startActivity(i);
			}
		});

		// fade out
		btnFadeOut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, FadeOutActivity.class);
				startActivity(i);
			}
		});

		// cross fade
		btnCrossFade.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this,
						CrossfadeActivity.class);
				startActivity(i);
			}
		});

		// blink
		btnBlink.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, BlinkActivity.class);
				startActivity(i);
			}
		});

		// Zoom In
		btnZoomIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, ZoomInActivity.class);
				startActivity(i);
			}
		});

		// Zoom Out
		btnZoomOut.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, ZoomOutActivity.class);
				startActivity(i);
			}
		});

		// Rotate
		btnRotate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, RotateActivity.class);
				startActivity(i);
			}
		});

		// Move
		btnMove.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, MoveActivity.class);
				startActivity(i);
			}
		});

		// Slide Up
		btnSlideUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, SlideUpActivity.class);
				startActivity(i);
			}
		});

		// Slide Down
		btnSlideDown.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this,
						SlideDownActivity.class);
				startActivity(i);
			}
		});

		// Slide Down
		btnBounce.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this, BounceActivity.class);
				startActivity(i);
			}
		});

		// Sequential
		btnSequential.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this,
						SequentialActivity.class);
				startActivity(i);
			}
		});
		

		// Sequential2
		btn2Sequential.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this,
						Sequential2Activity.class);
				startActivity(i);
			}
		});


		// Together
		btnTogether.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectXMLActivity.this,
						TogetherActivity.class);
				startActivity(i);
			}
		});

	}
}
