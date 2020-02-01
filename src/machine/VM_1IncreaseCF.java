package machine;

import java.util.Map;

/**
 * This class is used for VM-1, which is used for increaseCF action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_1IncreaseCF extends increaseCF{
	
	
	public void IncreaseCF(Object o,Map<String,Object>map)
	{
		 int cf=Integer.parseInt(String.valueOf(o));
		 int oldcf=0;
		 oldcf=Integer.parseInt(String.valueOf(map.get("cf")));				 		 
		 int newcf=cf+oldcf;
		 map.put("cf",newcf);	 
	}

}
