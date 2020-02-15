package szyfrowanie;

public class EnkoderDecocer {

	public String encodePassw(String password) {
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

	public String decodePassw(String password) {
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

//	public static void main(String aargs []) {
//		
//		System.out.println(encodePassw("Janusz"));
//		
//		System.out.print(decodePassw("Tkx }?"));
//	}
}