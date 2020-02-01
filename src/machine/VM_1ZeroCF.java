package machine;

import java.util.Map;

/**
 * This class is used for VM-1, which is used for ZeroCF action.
 * This source code are responsible for the implementation the strategy pattern.
 */

public class VM_1ZeroCF extends zeroCF{
	
	public void ZeroCF(Object o,Map<String,Object>map)
	{
		DS_1 data=new DS_1();
		data.setcf(0);
		map.put("cf",0);
	}

}
