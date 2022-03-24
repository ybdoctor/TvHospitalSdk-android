package com.jambo.ybtvhospitalsdk;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jianbao.libraryrtc.YBDocManager;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		YBDocManager
				.login("123456", "18367180392");
		findViewById(R.id.start)
				.setOnClickListener(view -> {
					YBDocManager.start(this);
				});
	}
}