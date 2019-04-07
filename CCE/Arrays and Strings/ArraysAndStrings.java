public class ArraysAndStrings {

	public static void main(String[] args) {
		compressStr("aaabccccaa");
	}

	// 1.1 
	// Determine if a String has all Unique Characters

	public static boolean isAllUnique(String str) {

		if(str == null) {
			return true;
		}

		return false;

	}


	public static String compressStr(String str) {
		if(str == null || str.length() == 0) {
			return str;
		}

		int charCount = 1;
		char ch = str.charAt(0);
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<str.length(); i++) {
			if(str.charAt(i) == ch) {
				charCount++;	
			} else {
				sb.append(ch+""+charCount);
				ch = str.charAt(i);
				charCount = 1;
			}
		}
		sb.append(ch+""+charCount);
		System.out.println(sb);


		return sb.toString().length() < str.length() ? sb.toString() : str;
	}
	


 }
