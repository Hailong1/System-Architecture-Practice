package machine;

/**
 * This class is used for VM-2, which is used for DisposeAdditive action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_2DisposeAdditive extends disposeAdditive{
	
	public void DisposeAdditive(Object o)
	{
		int d=Integer.parseInt(String.valueOf(o));
		if (d==1)
		{
			System.out.println("Dispose a drink COFFEE with cream.");
		}
		if (d==2)
		{
			System.out.println("Dispose a drink COFFEE with sugar.");
		}

		
	}

}
