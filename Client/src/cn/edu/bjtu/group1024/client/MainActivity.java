package cn.edu.bjtu.group1024.client;

import cn.edu.bjtu.group1024.common.aidl.IFibonacci;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private Button mJavaIterationBtn;
	private Button mJavaRecursionBtn;
	private Button mNativeIterationBtn;
	private Button mNativeRecursionBtn;
	private EditText mEditText;

	private IFibonacci mFibonacci;
	private ServiceConnection mServiceConnection = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {

		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			mFibonacci = IFibonacci.Stub.asInterface(service);
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mJavaIterationBtn = (Button) findViewById(R.id.btn_java_iteration);
		mJavaRecursionBtn = (Button) findViewById(R.id.btn_java_recursion);
		mNativeIterationBtn = (Button) findViewById(R.id.btn_native_iteration);
		mNativeRecursionBtn = (Button) findViewById(R.id.btn_native_recursion);
		mEditText = (EditText) findViewById(R.id.editText);

		mJavaIterationBtn.setOnClickListener(this);
		mJavaRecursionBtn.setOnClickListener(this);
		mNativeIterationBtn.setOnClickListener(this);
		mNativeRecursionBtn.setOnClickListener(this);

	}

	@Override
	protected void onStart() {
		super.onStart();
		Intent intent = new Intent("android.intent.action.FibonacciService");
		bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
	}

	@Override
	protected void onStop() {
		super.onStop();
		unbindService(mServiceConnection);
	}

	@Override
	public void onClick(View v) {
		String editString = mEditText.getText().toString();
		if (TextUtils.isEmpty(editString)) {
			Toast.makeText(this, "输入为空", Toast.LENGTH_LONG).show();
			return;
		} else if (Integer.parseInt(editString) == 0) {
			Toast.makeText(this, "输入不能为0", Toast.LENGTH_LONG).show();
			return;
		}
		int num = Integer.parseInt(editString);
		try {
			switch (v.getId()) {
			case R.id.btn_java_iteration:
				String s = null;
				s = mFibonacci.javaInterative(num) + "";
				Toast.makeText(this, s, Toast.LENGTH_LONG).show();
				break;
			case R.id.btn_java_recursion:
				break;
			case R.id.btn_native_iteration:
				break;
			case R.id.btn_native_recursion:
				break;
			}
		} catch (RemoteException e) {
			e.printStackTrace();

		}

	}
}
