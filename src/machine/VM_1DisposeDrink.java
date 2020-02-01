package machine;


/**
 * This class is used for VM-1, which is used for disposeDrink action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_1DisposeDrink extends disposeDrink{
	
	public void DisposeDrink(Object o)
	{
		int d=Integer.parseInt(String.valueOf(o));
		if (d==1)
		{
			System.out.println("Dispose a drink tea.");
		}
		if (d==2)
		{
			System.out.println("Dispose a drink chocolate");
		}
	}

}
