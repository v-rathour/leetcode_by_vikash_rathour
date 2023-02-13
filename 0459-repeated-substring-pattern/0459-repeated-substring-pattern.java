class Solution { 
	public boolean repeatedSubstringPattern(String s) {
        // add the double time original string 
		String double_str=s+s;
        // remove the first and last character from the double string 
		String str1=double_str.substring(1, double_str.length()-1); 

		if(str1.contains(s)) 				
			return true;
		else
		   return false;
	}
}