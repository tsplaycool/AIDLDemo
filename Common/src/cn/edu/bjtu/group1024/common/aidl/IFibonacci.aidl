package cn.edu.bjtu.group1024.common.aidl;
interface IFibonacci{
	int javaRecursion(int pos);                   // java��ĵݹ�
	int javaInterative(int pos);                   // java��ĵ���
	int nativeRecursion(int pos);              // native��ĵݹ�
	int nativeInterative(int pos);               // native��ĵ���
}