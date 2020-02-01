package Factory;

import machine.DS_2;
import machine.DataStore;
import machine.VM_2DisposeAdditive;
import machine.VM_2DisposeDrink;
import machine.VM_2IncreaseCF;
import machine.VM_2ReturnCoins;
import machine.VM_2StorePrice;
import machine.VM_2ZeroCF;
import machine.disposeAdditive;
import machine.disposeDrink;
import machine.increaseCF;
import machine.returnCoins;
import machine.storePrice;
import machine.zeroCF;

/**
 * This class is the VM_2Factory. The source code are responsible for the implementation 
 * the abstract factory pattern.
 */

public class VM_2Factory extends AbstractFactory{
	
	public storePrice getStorePrice(){
		return new VM_2StorePrice();
	}

	public DataStore getDataStore()
	{
		return new DS_2();
	}
	
	
	public zeroCF getZeroCF()
	{
		return new VM_2ZeroCF();
	}
	
	public increaseCF getIncreaseCF()
	{
		
		return new VM_2IncreaseCF();
	}
	
	public returnCoins getReturnCoins()
	{
		return new VM_2ReturnCoins();
	}
	
	public disposeDrink getDisposeDrink()
	{
		return new VM_2DisposeDrink();
	}
	
	public disposeAdditive getDisposeAdditive()
	{
		
		return new VM_2DisposeAdditive();
	}
	
	
	
	
	
	
}
