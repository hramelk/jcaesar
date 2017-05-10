public class Caesar {
	public static final int	encode	= 1;
	public static final int	decode	= 0;
	
	public static String encode(String openText, int key) {
		String encoded = "";
		for (int i = 0; i < openText.length(); i++) {
			char cp = openText.charAt(i);
			int index = getIndexByRange(cp);
			if (index == 0) {
				encoded += cp;
				continue;
			}
			int num = cp - index;
			num = (num + key) % 26;
			encoded += (char) (num + index);
		}
		return encoded;
	}
	
	public static String decode(String encodedText, int key) {
		String decodedText = "";
		for (int i = 0; i < encodedText.length(); i++) {
			char cp = encodedText.charAt(i);
			int index = getIndexByRange(cp);
			if (index == 0) {
				decodedText += cp;
				continue;
			}
			int num = cp - index;
			num = (26 + num - key) % 26;
			decodedText += (char) (num + index);
		}
		return decodedText;
	}
	
	public static String encodeDecode(String text, int key, int encORdec) {
		String encoded = "";
		int action = 0;
		if (encORdec == 0) {
			action = 26;
			key *= -1;
		} else {
			action = 0;
		}
		for (int i = 0; i < text.length(); i++) {
			char cp = text.charAt(i);
			int index = getIndexByRange(cp);
			if (index == 0) {
				encoded += cp;
				continue;
			}
			int num = cp - index;
			num = (action + num + key) % 26;
			encoded += (char) (num + index);
		}
		return encoded;
	}
	
	private static int getIndexByRange(char cp) {
		if (cp >= 'a' && cp <= 'z') {
			return 97;
		} else if (cp >= 'A' && cp <= 'Z') {
			return 65;
		} else {
			return 0;
		}
	}
}
