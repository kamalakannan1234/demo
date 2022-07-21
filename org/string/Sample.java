package org.string;

public class Sample {
	public static void main(String[] args) {
		String s ="  kamalaknnan ";
		
		
		//1 LenGth of the string
		 int Length =s.length();
		 System.out.println(Length);
		 
		//to convert all letter into uppercase:
		 
		 String kk =s.toUpperCase();
		System.out.println(kk);
		
		// to convert all letter in Lowercase
		
		String low=s.toLowerCase();
		System.out.println(low);
		
		//fetch  the letter indexposition
		char kkk=s.charAt(6);
		System.out.println(kkk);  
		
		// return index at particular value  
	int k=s.indexOf("k");
	System.out.println(k);
	
	
		//last indexposition
	int l = s.lastIndexOf("n");
	System.out.println(l);
	
	

	String s2=" kamalkanan      ";
	System.out.println(s2);
	System.out.println(s2.trim());
		//*********reverse the value *********
	
	String S ="kamalakannan";
	String rev="";
	for(int i=S.length()-1;i>=0;i++) {
		char c=S.charAt(i);
		rev=rev+c;
		
	}
	
	System.out.println(rev);
	
}
}
	


