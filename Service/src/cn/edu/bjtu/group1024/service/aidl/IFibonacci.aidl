package cn.edu.bjtu.group1024.service.aidl;
interface IFibonacci{
	void javaRecursion(int pos);                   // java��ĵ���
	void javaInterative(int pos);                   // java��ĵݹ�
	void nativeRecursion(int pos);              // native��ĵ���
	void nativeInterative(int pos);               // native��ĵݹ�
}