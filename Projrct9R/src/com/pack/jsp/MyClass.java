package com.pack.jsp;

public class MyClass {
public static String get_eligiblity(double per){
	if(per>75){
		return ("You are eligibe");
	}
	else {
		 return ("Sorry! You didn't meet the eligiblity criteria");
	}
}
}
