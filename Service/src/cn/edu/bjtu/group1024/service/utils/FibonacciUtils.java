package cn.edu.bjtu.group1024.service.utils;

/**
 * 쳲������㷨������
 * @author Tans
 *
 */
public class FibonacciUtils {

	/**
	 * JAVA�ݹ�
	 * @param n
	 * @return
	 */
	public static int javaRecursion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return (javaRecursion(n - 1) + javaRecursion(n - 2));
		}
	}

	/**
	 * JAVA����
	 * @param n
	 * @return
	 */
	public static int javaInterative(int n) {
		int n1 = 1;
		int n2 = 1;
		int result = 0;
		if (n == 1 || n == 2) {
			return n1;
		}
		for (int i = 3; i <= n; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
		}
		return result;
	}

	/**
	 * NATIVE�ݹ�
	 * @param n
	 * @return
	 */
	public static int nativeRecursion(int n) {
		return 0;
	}

	/**
	 * NATIVE����
	 * @param n
	 * @return
	 */
	public static int nativeInterative(int n) {
		return 0;
	}

}
