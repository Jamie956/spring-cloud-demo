package org.example.annotation_bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Z {
	@Autowired
	private Y2 y123;

	public void setY2(Y2 y) {
		System.out.println("set");
		this.y123 = y;
	}

	public Y2 getY2() {
		return y123;
	}
}
