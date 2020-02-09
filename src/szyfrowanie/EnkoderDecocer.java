package szyfrowanie;

public class EnkoderDecocer {

	public static String encodePassw(String password) {
		String result = "";
		int lenght = password.length();
		char d;
		for (int i = 0; i < lenght; i++) {
			d = password.charAt(i);
			d += 10;
			result += d;
		}

		return result;
	}

	public static String decodePassw(String password) {
		String result = "";
		int lenght = password.length();
		char d;
		for (int i = 0; i < lenght; i++) {
			d = password.charAt(i);
			d -= 10;
			result += d;
		}

		return result;
	}

}
