package State;

import java.util.Map;


/**
 * This class is implementation of the third state in state pattern, which is the idle state.
 * This source code are responsible for the implementation of the state pattern.
 */

public class idle extends VM_State{
	
	public int coin(Object o,int f,int value,Map<String,Object>map,Map<Integer,Integer>A) 
	{
		int flag=0; 
		if (value==1)
		{	
		   if (f==0)
		   {
			   p.IncreaseCF(o,value,map);
		   }
		   if(f==1)
		   {
			   p.IncreaseCF(o,value,map);
			   A.put(1,0);
			   A.put(2,0); 
			   flag=1;
		   }
		   
		}
		if (value==2)
		{
			 if (f==0)
			{
			  p.IncreaseCF(o,value,map);
			}
			if(f==1)
		    {
			  p.IncreaseCF(o,value,map);
			  A.put(1,0);  
			  flag=1;
			}
		}
		
		return flag;
	}

	public int insert_cups(Object o,int value,Map<String,Object>map)
	{
		   int n=Integer.parseInt(String.valueOf(o));
		   if (n>0)
		   {
		      int k=Integer.parseInt(String.valueOf(map.get("k")));
		      int newk=k+n;
		      map.put("k", newk);
		      map.put("n", newk);		      
		   }
		
		return 0;
		
	}
	
	public int set_price(Object o, int value)
	{
	
		    p.StorePrice(o, value);
		
		    return 0;		
	}
	
	public int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int value)
	{
		if (value==1)
		{	
		    p.ZeroCF(o, value, map);
		    A.put(1,0);
			A.put(2,0); 		
		}
		
		return 0;
		
	}

	
	
	
	
	
	
	
	public int create(Object o,int value){return 0;}	
	public int cancel(Object o,Map<String,Object>map,int value){return 0;}	
	public int dispose_drink (Object o,int value,int d,Map<String,Object>map,Map<Integer,Integer>A){return 0;}
	public int additive(Object o,int value,Map<Integer,Integer>A,int a){return 0;}

}
