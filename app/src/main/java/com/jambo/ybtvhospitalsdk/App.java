package com.jambo.ybtvhospitalsdk;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.jianbao.libraryrtc.YBDocManager;

import timber.log.Timber;

/**
 * @author: 陈川
 * @date: 2022/3/15
 */
public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		YBDocManager.init(this,"inquiryTest1","6708eafef26d4e7ea2b888fa3ebe39e0", true);
		YBDocManager.debugMode(true);
	}
}
