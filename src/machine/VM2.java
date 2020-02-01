package machine;

import java.util.Map;

import Factory.AbstractFactory;
import Factory.VM_2Factory;
import State.MDA_EFSM;
import drive.Display;

/**
 * in this class, it will use the abstract factory pattern to create the VM-1 factory. 
 */

public class VM2 
{
	
	MDA_EFSM m;
	AbstractFactory af;
	DS_2 d;
	Display ds;
	int q;
	
	public VM2()
	{
		m=new MDA_EFSM();
	}
	
	public void process()
	{
		af=new VM_2Factory(); // create VM-2 Factory()
	    m.initialize(af);		
		
	}
	

	
	public int CREATE(float p,int z)
	{		
	    q=m.create(p,z,2);
		return q;
	}
	
	
	
	
	public int InsertCups(int n, Map<String,Object>map,int z)
	{
		
		q=m.insert_cups(n,map,z,2);		
		return q;
	}
	
	
    public int SUGAR(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z )
    {
    	q=m.additive(kind,map,A,z,2);
    	return q;
    }
	
    public int CREAM(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z)
    {
    	q=m.additive(kind,map,A,z,2);
    	return q;
    }
    
    public int COFFEE(int kind,Map<String,Object>map,Map<Integer,Integer>A,int z)
    {
    	q=m.dispose_drink(kind,map,A,z,2);
    	return q;
    }
    
    public int SetPrice(float p,Map<String,Object>map,int z)
    {
    	q=m.set_price(p,map,z,2);
    	return q;
    }
    
    public int CANCEL(Map<String,Object>map,int z)
    {
    	q=m.cancel(0,map,z,2); 
    	return q;
    }
	
    
    public int COIN(float v,Map<String,Object>map,Map<Integer,Integer>A,int z)
	{
		
		float price=0;
		float cf=0;
	    price=Float.parseFloat(String.valueOf(map.get("price")));
		cf=Float.parseFloat(String.valueOf(map.get("cf")));			

		if (cf+v>price||Math.abs(cf+v-price)<=0.0000001)
		{		
			q=m.coin(v,1,2,z,map,A);
		}
		else
		{		
			q=m.coin(v,0,2,z,map,A);
		}
		
		return q;
	}
	
	
}
