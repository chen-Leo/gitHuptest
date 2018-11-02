package test2;

import java.util.Arrays;

public class Main {
	// 判断数字
	public static boolean isNum(String str) {
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57)
				return false;
		}
		return true;
	}

	// 判断大写
	public static boolean isUpChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (!((int) str.charAt(i) > 64 && (int) str.charAt(i) < 91))
				return false;
		}
		return true;
	}

	// 判断小写
	public static boolean isLowChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (!((int) str.charAt(i) > 96 && (int) str.charAt(i) < 123))
				return false;
		}
		return true;
	}

	// 判断是否全为字母
	public static boolean isChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			int chr = str.charAt(i);
			if (!((int) str.charAt(i) > 96 && (int) str.charAt(i) < 123)
					|| ((int) str.charAt(i) > 64 && (int) str.charAt(i) < 91))
				return false;
		}
		return true;
	}

	// 小写转大写
	public static String lowToUp(String str) {
		if (!isChar(str)) {
			System.out.println("error ,not all chars");
			System.exit(-1);
		}
		str = str.toUpperCase();
		return str;
	}

	// 数字顺序输出
	public static void printMath(String str) {

		if (!isNum(str)) {
			System.out.println("error ,not all mathnum");
			System.exit(-1);
		}

		char[] a = str.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);

	}

	// 字母顺序输出
	public static void printChar(String str) {

		if (!isChar(str)) {
			System.out.println("error ,not all char");
			System.exit(-1);
		}

		char[] a = str.toCharArray();
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
	
	
	
	
	


