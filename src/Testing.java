import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
	checkapp obj=new checkapp();
	@Test
	public void printtest()
	{
		Object[] arr1= {1,33,15,'a','B'};
		HashMap<Object,String> hMap1=obj.check(arr1);
		for(Map.Entry<Object, String> check:hMap1.entrySet())
		{
			System.out.println(check.getKey()+"\t"+check.getValue()+"\n");
		}
	}
	@Test
	public void test1()
	{
		Object[] arr1= {1,33,15,'a','B'};
		HashMap<Object,String> hMap1=obj.check(arr1);
		Assert.assertEquals(hMap1.get('a'),"Invalid item");
	}
	@Test
	public void test2()
	{
		Object[] arr1= {1,33,15,'a','B'};
		HashMap<Object,String> hMap1=obj.check(arr1);
		Assert.assertEquals(hMap1.get(33),"Fizz");
	}
	@Test
	public void test3()
	{
		Object[] arr1= {1,33,15,'a','B',10};
		HashMap<Object,String> hMap1=obj.check(arr1);
		Assert.assertEquals(hMap1.get(10),"Buzz");
	}
	@Test
	public void test4()
	{
		Object[] arr1= {1,33,15,'a','B',10};
		HashMap<Object,String> hMap1=obj.check(arr1);
		Assert.assertEquals(hMap1.get(15),"FizzBuzz");
	}
	@Test
	public void test5()
	{
		Object[] arr1= {1,33,15,'a','B',10};
		HashMap<Object,String> hMap1=obj.check(arr1);
		Assert.assertEquals(hMap1.get(1),"Divided 1 by 3"+"\n"+"\t"+"Divided 1 by 5");
		

	}
}
