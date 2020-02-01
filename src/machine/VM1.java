package machine;


import java.util.Map;

import Factory.AbstractFactory;
import Factory.VM_1Factory;
import State.MDA_EFSM;
import drive.Display;


/**
 * in this class, it will use the abstract factory pattern to create the VM-1 factory. 
 */

public class VM1 {
	
	MDA_EFSM m;
	AbstractFactory af;
	DS_1 d;
	Display ds;
	int q;
	
	public VM1()
	{
		m=new MDA_EFSM();
	}
	
	public void process()
	{
		af=new VM_1Factory();  // create VM-1 Factory()
	    m.initialize(af);		
		
	}
	
	public int create(int p,int z)
	{		
	    q=m.create(p,z,1);
		return q;
	}
			
	public int insert_cups(int n, Map<String,Object>map,int z)
	{
		
		q=m.insert_cups(n,map,z,1);		
		return q;
	}
	
	
	
    public int sugar(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z )
    {
    	q=m.additive(kind,map,A,z,1);
    	return q;
    }
	
    public int tea(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z)
    {
    	q=m.dispose_drink(kind,map,A,z,1);
    	return q;
    }
    
    public int cholocate(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z)
    {
    	q=m.dispose_drink(kind,map,A,z,1);
    	return q;
    }
    
    public int set_price(int p,Map<String,Object>map,int z)
    {
    	q=m.set_price(p,map,z,1);
    	return q;
    }
    
    public int cancel(Map<String,Object>map,int z)
    {
    	q=m.cancel(0,map,z,1); 
    	return q;
    }
    
    public int coin(int v,Map<String,Object>map,Map<Integer,Integer>A,int z)
	{
		
		int price=0;
		int cf=0;
		price=Integer.parseInt(String.valueOf(map.get("price")));
		cf=Integer.parseInt(String.valueOf(map.get("cf")));
		if (cf+v>=price)
		{
			q=m.coin(v,1,1,z,map,A);
		}
		else
		{
			q=m.coin(v,0,1,z,map,A);
		}
		
		return q;
	}
    
    public int card(float x,Map<String,Object>map,Map<Integer,Integer>A,int z)
	{
		float price=Float.parseFloat(String.valueOf(map.get("price")));
		if (Math.abs(x-price)<=0.000001||x>price)
		{
			q=m.card(x,map,A,z,1);
		}
		
		return q;
	}
    
	
}
