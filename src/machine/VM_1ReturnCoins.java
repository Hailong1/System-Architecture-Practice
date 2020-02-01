package machine;

import java.util.Map;

/**
 * This class is used for VM-1, which is used for ReturnCoins action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_1ReturnCoins extends returnCoins{
	
	public void ReturnCoins(Object o,Map<String,Object>map)
	{
		int v=Integer.parseInt(String.valueOf(o));  
		DS_1 data=new DS_1();
		int cf=Integer.parseInt(String.valueOf(map.get("cf")));
		int newcf=cf+v;
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
