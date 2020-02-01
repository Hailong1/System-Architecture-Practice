package machine;

/**
 * This class is used for VM-1, which is used for disposeAdditive action.
 * This source code are responsible for the implementation the strategy pattern.
 */


public class VM_1DisposeAdditive extends disposeAdditive{
	
	public void DisposeAdditive(Object o)
	{
		int d=Integer.parseInt(String.valueOf(o));
		if (d==1)
		{
			System.out.println("Dispose a drink tea with sugar.");
		}
		if (d==2)
		{
			System.out.println("Dispose a drink chocolate with sugar");
		}
		
	}

}
