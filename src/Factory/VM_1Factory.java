package Factory;

import machine.DS_1;
import machine.DataStore;
import machine.VM_1DisposeAdditive;
import machine.VM_1DisposeDrink;
import machine.VM_1IncreaseCF;
import machine.VM_1ReturnCoins;
import machine.VM_1StorePrice;
import machine.VM_1ZeroCF;
import machine.disposeAdditive;
import machine.disposeDrink;
import machine.increaseCF;
import machine.returnCoins;
import machine.storePrice;
import machine.zeroCF;

/**
 * This class is the VM_1Factory. The source code are responsible for the implementation 
 * the abstract factory pattern.
 */

public class VM_1Factory extends AbstractFactory{
	
	public storePrice getStorePrice(){
		return new VM_1StorePrice();
	}
	
	public DataStore getDataStore()
	{
		return new DS_1();
	}
    
	public zeroCF getZeroCF()
	{
		return new VM_1ZeroCF();
	}
	
	public increaseCF getIncreaseCF()
	{
		
		return new VM_1IncreaseCF();
	}
	
	public returnCoins getReturnCoins()
	{
		return new VM_1ReturnCoins();
	}
	
	public disposeDrink getDisposeDrink()
	{
		return new VM_1DisposeDrink();
	}
	
	public disposeAdditive getDisposeAdditive()
	{
		return new VM_1DisposeAdditive();
	}
	
	
}
