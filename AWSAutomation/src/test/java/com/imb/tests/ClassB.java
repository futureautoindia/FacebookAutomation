package com.imb.tests;

import org.testng.annotations.Test;

public class ClassB {
	@Test(groups = { "regression", "smoke" })
	public void TC_005() {
		System.out.println("TC_005 is executed");
	}

	@Test(groups = { "smoke" })
	public void PO_006() {
		System.out.println("PO_006 is executed");

	}

	@Test(groups = { "sanity", "regression" })
	public void OJ_007() {
		System.out.println("OJ_007 is executed");
	}

}
