package machine;

/**
 * This class is used for VM-2, which is used for StorePrice action.
 * This source code are responsible for the implementation the strategy pattern.
 */

public class VM_2StorePrice extends storePrice{
	
	public void StorePrice(Object o)
	{
		float value=Float.parseFloat(String.valueOf(o));
		DS_2 data=new DS_2();
		data.setprice(value);	
		System.out.println("price is set to:"+data.getprice());
	}

}
