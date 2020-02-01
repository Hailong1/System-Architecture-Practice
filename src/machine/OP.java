package machine;

import java.util.Map;

import Factory.AbstractFactory;

/**
 * This class is OP class, which is responsible for the MDA-EFSM actions.
 */

public class OP 
{ 
	  storePrice s;
	  DataStore d;
	  zeroCF z;
	  increaseCF i;
	  returnCoins r;
	  disposeDrink d1;
	  disposeAdditive d2;
	  
	  
	  /**
		* initialize the Abstract Factory. 
		*/	 
	 public void initialize(AbstractFactory af)
	  {	
			 s=af.getStorePrice();
			 d=af.getDataStore();
			 z=af.getZeroCF();
			 i=af.getIncreaseCF();
			 r=af.getReturnCoins();
			 d1=af.getDisposeDrink();
			 d2=af.getDisposeAdditive();
			
	  }
	  
	 	 
	 public void StorePrice(Object o,int value)
	 {
		 
		  if (value==1)
		  {
			
		    new VM_1StorePrice().StorePrice(o);
		  }
		  if (value==2)
		  {
			  
			  new VM_2StorePrice().StorePrice(o);
		  }
		 
	 }
	 
	 
	 public void ZeroCF(Object o,int value,Map<String,Object>map)
	 {
		  if (value==1)
		  {
    		  new VM_1ZeroCF().ZeroCF(o,map);
		  }
		  if (value==2)
		  {
			  new VM_2ZeroCF().ZeroCF(o,map);
		  }
		 
	 }
	 
	 public void IncreaseCF(Object o,int value,Map<String,Object>map)
	 {
		  if(value==1)
		  {
			  new VM_1IncreaseCF().IncreaseCF(o,map);
		  }
		  if (value==2)
		  {
			  new VM_2IncreaseCF().IncreaseCF(o,map);
		  }
	 }
	 
	 public void ReturnCoins(Object o, int value,Map<String,Object>map)
	 {
		  if(value==1)
		  {
			  new VM_1ReturnCoins().ReturnCoins(o,map);
		  }
		  if(value==2)
		  {
			  new VM_2ReturnCoins().ReturnCoins(o,map);
		  }
		 		 
	 }
	 
	 public void DisposeDrink(Object o,int value)
	 {
		 if(value==1)
		 {
			 new VM_1DisposeDrink().DisposeDrink(o);
		 }
		 if(value==2)
		 {
			 new VM_2DisposeDrink().DisposeDrink(o);
		 }
	 }
	 
	 
	 public void DisposeAdditive(Object o,int value)
	 {
		 if (value==1)
		 {
			 new VM_1DisposeAdditive().DisposeAdditive(o);
		 }
		 if(value==2)
		 {
			 new VM_2DisposeAdditive().DisposeAdditive(o);
		 }
	 }
	 	
}
