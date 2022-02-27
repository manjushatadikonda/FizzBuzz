import java.util.HashMap;
import java.util.Map;

public class checkapp {
	public HashMap<Object,String> check(Object[] arr)
	{
		
		HashMap<Object,String> hMap=new HashMap<Object,String>();
		for(int i=0;i<arr.length;i++)
		{
				try
				{if((int)arr[i]%3==0 && (int)arr[i]%5!=0)
			      {
			    	  hMap.put(arr[i], "Fizz");
			      }
			      else if((int)arr[i]%5==0 && (int)arr[i]%3!=0)
			      {
			    	  hMap.put(arr[i], "Buzz");
			      } 
			      else if((int)arr[i]%3==0 && (int)arr[i]%5==0)
				     {
				    	 hMap.put(arr[i],"FizzBuzz");
				     }
				
			      else
			      {
			    	  String s="Divided "+arr[i]+" by 3"+"\n"+"\t"+"Divided "+arr[i]+" by 5";
			    	  hMap.put(arr[i], s);
			      }
				}
				catch(Exception e)
				{
					hMap.put(arr[i],"Invalid item");
				}
		
		}
		
		return hMap;
	}
}
