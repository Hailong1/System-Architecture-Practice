package machine;

import java.util.Map;

/**
 * This class is used for VM-2, which is used for ReturnCoins action.
 * This source code are responsible for the implementation the strategy pattern.
 */

public class VM_2ReturnCoins extends returnCoins{
	
	public void ReturnCoins (Object o,Map<String,Object>map)
	{
		float v=Float.parseFloat(String.valueOf(o));  
		DS_2 data=new DS_2();
		float cf=Float.parseFloat(String.valueOf(map.get("cf")));
		float newcf=cf+v;
		data.setcf(newcf);	
		data.setV(v);
		if (v==0)
		{
		  System.out.println("return coin of value : "+data.getcf());
		}
		else
		{	
		  System.out.println("return coin of value : "+data.getV());
		}
		map.put("cf", newcf);
	}

}
