package cn.edu.bjtu.group1024.common.aidl;
interface IFibonacci{
	int javaRecursion(int pos);                   // java²ãµÄµÝ¹é
	int javaInterative(int pos);                   // java²ãµÄµü´ú
	int nativeRecursion(int pos);              // native²ãµÄµÝ¹é
	int nativeInterative(int pos);               // native²ãµÄµü´ú
}