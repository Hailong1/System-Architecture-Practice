package State;

import java.util.Map;

import State.VM_State;

/**
 * This class is implementation of the second state in state pattern, which is the nocups state.
 * This source code are responsible for the implementation of the state pattern.
 *
 */

public class nocups extends VM_State{
	
	
	public int coin(Object o,int f,int value,Map<String,Object>map,Map<Integer,Integer>A)
	{
			
		p.ReturnCoins(o,value,map);		
		return 0;
	}
	
	public int insert_cups(Object o,int value,Map<String,Object>map)
	{
		    int flag=0;	
		    int n=Integer.parseInt(String.valueOf(o));
		    if (n>0)
		    {
		        int k=n;
		        map.put("k", k);
		    	p.ZeroCF(o, value,map);
		    	flag=1;
		    }

		return flag;
		
	}
		
	
	
	
	
	
	
	public int create(Object o,int value){return 0;}
	public int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int value){return 0;}
	public int cancel(Object o,Map<String,Object>map,int value){return 0;}
	public int set_price(Object o, int value){return 0;}
	public int dispose_drink (Object o,int value,int d,Map<String,Object>map,Map<Integer,Integer>A){return 0;}
	public int additive(Object o,int value,Map<Integer,Integer>A,int a){return 0;}

}
