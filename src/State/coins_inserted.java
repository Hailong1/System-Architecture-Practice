package State;

import java.util.Map;

import State.VM_State;

/**
 * This class is the implementation of the fourth state in state pattern, which is the coins_inserted state.
 * This source code are responsible for the implementation of the state pattern.
 */



public class coins_inserted extends VM_State{
	
	public int coin(Object o,int f,int value,Map<String,Object>map,Map<Integer,Integer>A)
	{	
		p.ReturnCoins(o,value,map);

		return 0;
	}
	
	
	public int cancel(Object o,Map<String,Object>map,int value)
	{

		p.ReturnCoins(o, value, map);
		p.ZeroCF(o, value, map);
		return 0;
	}
	
	
	public int dispose_drink(Object o, int value,int d,Map<String,Object>map,Map<Integer,Integer>A)
	{
		int flag=0;
		if(value==1)	
		{	
		    int k=Integer.parseInt(String.valueOf(map.get("k")));
		    if (k<=1)
		   {
		    	if (A.get(d)==1)
		       {
		    		p.DisposeAdditive(d, value);
		       }
		    	else if (A.get(d)==0)
		       {
		    	    p.DisposeDrink(d, value);
		       }
                k--;
                map.put("k", k);
                map.put("n",k);
		    	flag=1;
		   }
		    else
		    {
		    	if (A.get(d)==1)
			       {
			    		p.DisposeAdditive(d, value);
			       }
			    	else if (A.get(d)==0)
			       {
			    	    p.DisposeDrink(d, value);
			       }	    	    
			    k--;
			    map.put("k", k);
			    map.put("n",k);
			    p.ZeroCF(o, value, map);  
			    flag=2;
		    }
					
		}
		if (value==2)
		{
			  int k=Integer.parseInt(String.valueOf(map.get("k")));
			    if (k<=1)
			   {
			       if (A.get(d)==0)
			       {
			    	    p.DisposeDrink(d, value);
			       }
			       else 
			       {
			    	   p.DisposeAdditive(A.get(d), value);
			       }
	                k--;
	                map.put("k",k);
	                map.put("n",k);
			    	flag=1;
			   }
			    else
			    {
			    	   if (A.get(d)==0)
				       {
				    	    p.DisposeDrink(d, value);
				       }
				       else 
				       {
				    	   p.DisposeAdditive(A.get(d), value);
				       }	    	    
				    k--;
				    map.put("k",k);
				    map.put("n",k);
				    p.ZeroCF(o, value, map);  
				    flag=2;
			    }
		}
				
		return flag;
	}
	

	public int additive(Object o,int value,Map<Integer,Integer>A,int a)
	{
		
		if (value==1)
		{	
		
		    for(int key:A.keySet())
		    {

		    	if (A.get(key)==1)
		    	{
		    		A.put(key,0);
		    	}
		    	else if(A.get(key)==0)
		    	{
		    		A.put(key,1);
		    	}
		    		
		    }

		}
		if (value==2)
		{
			
			for(int key1:A.keySet())
		    {

			    if (A.get(key1)==a)
		    	{
		    		A.put(key1, 0);
		    	}
		    	else if(A.get(key1)==0)
		    	{
		    		A.put(key1, a);
		    	}
				
		    }
			 
		}
		return 0;
	}


	
	public int create(Object o,int value){return 0;}	
	public int insert_cups(Object o,int value,Map<String,Object>map){return 0;}	
	public int set_price (Object o,int value){return 0;}
	public int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int value){return 0;}

	
	
	
	

}
