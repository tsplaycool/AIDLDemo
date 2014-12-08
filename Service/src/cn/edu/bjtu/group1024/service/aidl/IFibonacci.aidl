package cn.edu.bjtu.group1024.service.aidl;
interface IFibonacci{
	void javaRecursion(int pos);                   // java²ãµÄµü´ú
	void javaInterative(int pos);                   // java²ãµÄµÝ¹é
	void nativeRecursion(int pos);              // native²ãµÄµü´ú
	void nativeInterative(int pos);               // native²ãµÄµÝ¹é
}