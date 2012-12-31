package phonegap.example.connection;

import android.os.Bundle;

import org.apache.cordova.*;

public class ConnectionActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_connection);
		super.loadUrl("file:///android_asset/www/index.html");
	}

}
