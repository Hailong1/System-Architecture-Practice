package Factory;

import machine.*;

/**
 * 
 * This class is the abstract class for implement the Abstract Factory.
 * This source code are responsible for the implementation of the abstract factory pattern.  
 *
 */
public abstract class AbstractFactory 
{

	public abstract storePrice getStorePrice();
	
	public abstract DataStore getDataStore();
	
	public abstract zeroCF getZeroCF();
	
	public abstract increaseCF getIncreaseCF();
	
	public abstract returnCoins getReturnCoins();
	
	public abstract disposeDrink getDisposeDrink();
	
	public abstract disposeAdditive getDisposeAdditive();
	
}
