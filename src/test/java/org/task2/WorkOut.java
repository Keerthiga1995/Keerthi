package org.task2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkOut {
@BeforeClass
public void bc() {
	System.out.println("BeforeClass");
}
@AfterClass
public void ac() {
	System.out.println("AfterClass");
}
@BeforeMethod
public void bm() {
	System.out.println("BeforeMethod");
}
@AfterMethod
public void af() {
	System.out.println("AfterMethod");
}
@Test
public void test1()
{
	System.out.println("Test1");
}
}
