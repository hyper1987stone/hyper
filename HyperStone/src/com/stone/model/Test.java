package com.stone.model;

public class Test {
private int id;
private String name; 
public static void main(String[] args) {
	String str="1,2,3,";
	System.out.println(str.substring(0,str.lastIndexOf(",")));
	str=","+str;
	System.out.println(str.replaceFirst(",", ""));
	
	
}


}
