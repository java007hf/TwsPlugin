package com.example.pluginmain;

import android.content.Context;

import com.tws.plugin.core.PluginApplication;

public class HostApplication extends PluginApplication {

	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
	}

}
