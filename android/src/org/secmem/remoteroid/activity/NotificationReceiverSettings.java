package org.secmem.remoteroid.activity;

import org.secmem.remoteroid.R;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.MenuItem;

public class NotificationReceiverSettings extends SherlockPreferenceActivity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	    this.addPreferencesFromResource(R.xml.notification_receiver_preferences);
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()){
		case android.R.id.home:
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
