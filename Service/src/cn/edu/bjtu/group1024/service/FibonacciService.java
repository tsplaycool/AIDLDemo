package cn.edu.bjtu.group1024.service;

import cn.edu.bjtu.group1024.service.aidl.IFibonacci;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class FibonacciService extends Service {

	private final IFibonacci.Stub mBinder = new IFibonacci.Stub() {

		@Override
		public void nativeRecursion(int pos) throws RemoteException {

		}

		@Override
		public void nativeInterative(int pos) throws RemoteException {

		}

		@Override
		public void javaRecursion(int pos) throws RemoteException {

		}

		@Override
		public void javaInterative(int pos) throws RemoteException {

		}
	};

	@Override
	public IBinder onBind(Intent arg0) {
		return mBinder;
	}

}
