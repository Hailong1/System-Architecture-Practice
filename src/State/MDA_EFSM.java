package State;

import java.util.Map;

import Factory.*;
import machine.*;


/**
 *  This class is used for MDA-EFSM Events.
 */

public class MDA_EFSM 
{
	 VM_State S;
	 int LS;
     OP p;
     int k;
     
    public  MDA_EFSM()
     {
    	 k=0;
    	 p=new OP();
    	 LS=0; 
     }
     
     public int create(Object o,int z,int value)
    {  	     
             if (z==0)  
             {
            	 S=new start();	            	 
            	 S.create(o, value);
            	 ChangeState(1);
             }    	     
    	    	 
    	 return LS;
    	 
      }
     
     
     public int coin(Object o,int f,int value,int z,Map<String,Object>map,Map<Integer,Integer>A)
     {
    	     int flag; 
    		 if (z==1)
    		 {
    			 S=new nocups();
    			 S.coin(o,f,value,map,A);   			 
    		 }
    		 
    		 if (z==3)
    		 {
    			 S=new coins_inserted();
    			 S.coin(o, f, value, map, A);
    		 }
    		 
    		 if (z==2)
    		 {
    			  S=new idle();    			  
    			  flag=S.coin(o,f,value,map,A);
    			  if (flag==1)
    			  {
    				  ChangeState(3);
    				  System.out.println("please select drink");
    			  }
    			  else
    			  {
    				  System.out.println("cultimate coin value is "+map.get("cf"));
    			  }
    			  
    		 }
    	 
    	 return LS; 	 
     }
     
     
     public int insert_cups(Object o,Map<String,Object>map,int z,int value)
     {

    	     int flag=0;

    		 if (z==1)
    		 {
    			 S=new nocups();
    			 flag=S.insert_cups(o,value,map);
    			 if (flag==1)
    			 {
    				 ChangeState(2);
    			 }
    		 }
    		 
    		 if (z==2)
    		 {
    			 S=new idle();
    			 flag=S.insert_cups(o, value, map);
           
    		 }
    		 
    	    	 
    	 return LS;
     }
     
     
     
     public int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int z,int value)    
     {

    		 if (z==2)
    		 {
    			 System.out.println("please select the drink.");
    			 S=new idle();
    			 S.card(o, map,A,value);
    			 ChangeState(3);
    		 }
    	     	 
    	 return LS;   	 
     }
     
     
     public int additive(Object o,Map<String,Object>map,Map<Integer,Integer>A,int z,int value)
     {
  
    		 if (z==3)
    		 {
    			 S=new coins_inserted();
    			 int a=Integer.parseInt(String.valueOf(o));    	
    			 S.additive(o,value,A,a);
    			 
    		 }
    		 
    	 return LS;
     }
     
     
     public int dispose_drink(Object o,Map<String,Object>map,Map<Integer,Integer>A,int z,int value)
     {   	 
    		 int flag=0;
    		 if(z==3)
    		 {
    			 S=new coins_inserted();
    			 int d=Integer.parseInt(String.valueOf(o));    			 
    			 flag=S.dispose_drink(o, value, d,map,A);    			 
    		 }
    		 if (flag==1)
    		 {    			
    			 ChangeState(1);
    		 }
    		 if(flag==2)
    		 {
    			 ChangeState(2);
    		 }
    	    	 
    	 return LS;
    	 
     }
     
     public int set_price(Object o,Map<String,Object>map,int z,int value)
     {
    		 if(z==2)
    		 {
    			 map.put("price", o);
    			 S=new idle();
    			 S.set_price(o, value);
    		 }
    	    	 
    	 return LS;
     }
     
     public int cancel(Object o,Map<String,Object>map,int z,int value)
     {
    		 if(z==3)
    		 {
    			 S=new coins_inserted();
    			 S.cancel(o,map,value);
    			 ChangeState(2);
    		 }
    	   	 
    	 return LS;
     }
     
     
     public void ChangeState (int ID)
     {
    	 LS=ID;
     }
       
     
     public void initialize (AbstractFactory af)
     {
    	   p.initialize(af);      	     	 
     }
     
	
}
