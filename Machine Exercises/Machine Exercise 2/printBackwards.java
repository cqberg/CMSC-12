package me2;

public class printBackwards {
	public static void main(String[] args) {
		String word = "The quick brown fox jumped.";
		int wordLen = word.length();		
		int spaceCount = 0;
		char letter;
		
		for(int i = 0; i < wordLen; ++i) {
			letter = word.charAt(i);
			
			if(letter == ' ' || letter == '.') {
				spaceCount++;
			}
		}
		
		int[] index = new int[spaceCount];
		int count = 0;
		
		for(int i = 0; i < wordLen; ++i) {
			letter = word.charAt(i);
			if(letter == ' ' || letter == '.') {
				index[count] = i;
				count++;
			}
		}
		
		//System.out.println("Number of spaces: " + spaceCount);
		
		//for(int i = 0; i < spaceCount; ++i) {
			//System.out.print(" " + index[i]);
		//}
		
		//for(int i = (wordLen-1); i >= 0; i--) {
			//letter = word.charAt(i);
			//System.out.println(letter);
		//}
		
		//System.out.println("\n");
		for(int i = 0; i < spaceCount; ++i) {
			count = 0;
			for(int j = index[i]-1; j >= 0; --j) {
				if(word.charAt(j) == ' ') {
					break;
				} else {
					System.out.print(word.charAt(j));
					count++;
				}
			}
			System.out.print(" " + count);
			System.out.println("\n");
		}
		
	}
}
