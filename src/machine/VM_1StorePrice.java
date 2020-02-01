package machine;

/**
 * This class is used for VM-1, which is used for StorePrice action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_1StorePrice extends storePrice{
	
	
	public void StorePrice(Object o)
	{
		int value=Integer.parseInt(String.valueOf(o));  
		DS_1 data=new DS_1();
		data.setprice(value);	
		System.out.println("price is set to: "+data.getprice());

	}

}
