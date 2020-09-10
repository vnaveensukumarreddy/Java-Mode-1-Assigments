package com.processing;

public class ChildClass extends ParentClass {

	int k;

	public ChildClass(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	public int add()
	{
		int c=i+j+k;
		return c;
	}
	
	
}
