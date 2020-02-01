package State;

import java.util.Map;

/**
 * This class is implementation of the first state in state pattern, which is the start state.
 * This source code are responsible for the implementation of the state pattern.
 */

public class start extends VM_State
{
	
	public int create(Object o,int value)
	{
		p.StorePrice(o, value);
		   
	
		return 0;
	}
	
	
	
	
	
	
	public int idle(Object o,int value){return 0;}
	public int insert_cups(Object o,int value,Map<String,Object>map){return 0;}
	public int coin(Object o,int f,int value,Map<String,Object>map,Map<Integer,Integer>A){return 0;}
	public int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int value){return 0;}
	public int cancel(Object o,Map<String,Object>map,int value){return 0;}
	public int set_price(Object o, int value){return 0;}
	public int dispose_drink (Object o,int value,int d,Map<String,Object>map,Map<Integer,Integer>A){return 0;}
	public int additive(Object o,int value,Map<Integer,Integer>A,int a){return 0;}
	
	

}
