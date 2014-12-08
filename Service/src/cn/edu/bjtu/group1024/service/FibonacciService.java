package cn.edu.bjtu.group1024.service;

import cn.edu.bjtu.group1024.common.aidl.IFibonacci;
import cn.edu.bjtu.group1024.service.utils.FibonacciUtils;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
public class FibonacciService extends Service {

	
	private final IFibonacci.Stub mBinder = new IFibonacci.Stub() {

		@Override
		public int nativeRecursion(int pos) throws RemoteException {
			return 0;
		}

		@Override
		public int nativeInterative(int pos) throws RemoteException {
			return 0;
		}

		@Override
		public int javaRecursion(int pos) throws RemoteException {
			return 0;
		}

		@Override
		public int javaInterative(int pos) throws RemoteException {
			return FibonacciUtils.javaInterative(pos);
		}
	};

	@Override
	public IBinder onBind(Intent arg0) {
		return mBinder;
	}

}
