package com.techment.WordCount;

public class WordCount {

	public static void main(String[] args) {
		String str = "Hello welcome to india";
		int word = 1;
		int character = 1;
		
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(ch==' ') {
				word++;
			}else if(ch!=' ') {
				character++;
			}
			
		}
		System.out.println("Total Word :"+word);
		System.out.println("Total Character :"+character);

	}

}
