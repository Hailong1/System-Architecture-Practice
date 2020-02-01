package machine;

import java.util.Map;

/**
 * This class is used for VM-2, which is used for IncreaseCF action.
 * This source code are responsible for the implementation the strategy pattern.
 */

public class VM_2IncreaseCF extends increaseCF{
	
	public void IncreaseCF(Object o,Map<String,Object>map)
	{
		 float cf=Float.parseFloat(String.valueOf(o));
		 float oldcf=0;
		 oldcf=Float.parseFloat(String.valueOf(map.get("cf")));				 
		 
		 float newcf=cf+oldcf;
		 new DS_2().setcf(newcf);
		 map.put("cf",newcf);
	}

}
