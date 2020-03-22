package com.sreeja.tddjunit;

public class RemoveAinFirst2Characters {
	public String remove(String string) {
		// TODO Auto-generated method stub
		String result="";
		if(string.length()>=1) {
			if(string.charAt(0)!='A') {
				result+=string.charAt(0);
			}
			if(string.length()>=2) {
				if(string.charAt(1)!='A') {
					result+=string.charAt(1);
				}
				result+=string.substring(2);
			}
		}
		return result;
	}
}
