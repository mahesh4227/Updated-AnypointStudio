package com.main;

import javax.jws.WebService;

@WebService
public class Soap {
	
	public int add(int a,int b)
	{
		return a+b;
	}

}
