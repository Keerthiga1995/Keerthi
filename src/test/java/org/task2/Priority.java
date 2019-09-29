package org.task2;

import org.testng.annotations.Test;

public class Priority {
@Test(priority=9)
public void test1()
{
	System.out.println("Test1");
}
@Test(priority=-1)
public void test2() {
	System.out.println("Test2");
}
@Test(priority=20)
public void test3() {
	System.out.println("Test3");
}
}
