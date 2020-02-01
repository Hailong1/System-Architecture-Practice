package machine;

/**
 * This class is used for VM-2, which is used for DisposeDrink action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_2DisposeDrink extends disposeDrink{
	
	public void DisposeDrink(Object o)
	{
		int d=Integer.parseInt(String.valueOf(o));
		if (d==1)
		{
			System.out.println("Dispose a drink COFFEE.");
		}
	
	}

}
