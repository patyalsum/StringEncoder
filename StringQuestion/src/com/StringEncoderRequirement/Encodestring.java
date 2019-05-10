package com.StringEncoderRequirement;

public class Encodestring {
	public static String stringEncoder(String str) {
		//for converting each ascii to char
		char eachcharacter;
		//for new ascii value
		int new_ascii;
		//array of encoded characters
		char encoderchararr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			int ascii=str.charAt(i);			
			
			//for uppercase characters
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				new_ascii= 90-(ascii-65);				
				eachcharacter=(char) new_ascii;
				//System.out.print(eachcharacter);
				encoderchararr[i]=eachcharacter;
			}
			
			//for lowercase characters
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				new_ascii= 122-(ascii-97);				
				eachcharacter=(char) new_ascii;
				//System.out.print(eachcharacter);
				encoderchararr[i]=eachcharacter;
			}
				
				
		}
		String encodedString = new String(encoderchararr);
		//System.out.println(encodedString);
		
		return encodedString;
		
	}
	
	public static void main(String[] args) {
		
		String str="acp";
		String result=stringEncoder(str);
		
		String encodedresult=result.replaceAll("","");
		System.out.println(encodedresult); 
		
	}

}
