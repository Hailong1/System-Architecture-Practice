package drive;
import java.util.Scanner;

import machine.*;

import java.util.HashMap;
import java.util.Map;


public class Display 
{

	 private Scanner input;
	 private VM1 v1;
	 private VM2 v2;
	 private Map<String,Object>mapvm;
	 private int num;
	 private Map<Integer,Integer>map1;
	 private Map<Integer,Integer>map2;
	 
	 Display()
	 {
	   input=new Scanner(System.in);
	   mapvm=new HashMap<String,Object>();
	   v1=new VM1();
	   v2=new VM2();
	   num=0;
	   map1=new HashMap<Integer,Integer>();
	   map2=new HashMap<Integer,Integer>();
	 }
	 
	 
	 public void vm1_operation()
	 {
		 System.out.println("VM-1 operation list below: please choose one operation.");
		 System.out.println("1.create (int p)");
		 System.out.println("2.coin(int v)");
		 System.out.println("3.card(float x)");
		 System.out.println("4.sugar()");
		 System.out.println("5.tea()");
		 System.out.println("6.chocolate()");
		 System.out.println("7.insert_cups(int n)");
		 System.out.println("8.set_price(int p)");
		 System.out.println("9.cancel()");
		 System.out.println("q.exit");		 
	 }
	
	 
	   public void vm2_operation()
	 {
		 System.out.println("VM-2 operation list below: please choose one operation.");  
		 System.out.println("1.CREATE (float p)");
		 System.out.println("2.COIN(float v)");
		 System.out.println("3.SUGAR()");
		 System.out.println("4.CREAM()");
		 System.out.println("5.COFFEE()");
		 System.out.println("6.InsertCups(int n)");
		 System.out.println("7.SetPrice(float p)");
		 System.out.println("8.CANCEL()");
		 System.out.println("q.exit");	 
	 }
	
	  public void vm1_show()
	 {
		selection1();  		  
        String select=input.next();
		while (!select.equals("q"))
		{		
		   if (select.equals("1"))
		   {
			   System.out.print(" Operation: create(int p)");
			   System.out.print("\n");
			   System.out.print(" Enter value of parameter p:");
			   System.out.print("\n");
			   int p=input.nextInt();
			   if (num==0)
			   {    num=v1.create(p,0);
			   mapvm.put("price",p);}
			   mapvm.put("s", num);			   
			   selection1();			   
			   select=input.next();
		   }
		 
		   else if (select.equals("2"))
		   {
			   System.out.print(" Operation: coin(int v)");
			   System.out.print("\n");
			   System.out.print(" Enter value of parameter v:");
			   System.out.print("\n");			   
			   int v=input.nextInt();
			   num=v1.coin(v,mapvm,map1,num);
			   mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("3"))
		   {
			   System.out.print(" Operation: card(float x)");
			   System.out.print("\n");
			   System.out.print(" Enter value of parameter x:");
			   System.out.print("\n");			   
			   float x=input.nextFloat();
			   mapvm.put("card",x);
               num=v1.card(x,mapvm,map1,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("4"))
		   {
			   System.out.print(" Operation: sugar()");
			   System.out.print("\n");
               num=v1.sugar(1,mapvm,map1,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("5"))
		   {
			   System.out.print(" Operation: tea()");
			   System.out.print("\n");
               num=v1.tea(1,mapvm,map1,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("6"))
		   {
			   System.out.print(" Operation: cholocate()");
			   System.out.print("\n");
               num=v1.cholocate(2,mapvm,map1,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   		 
		   else if (select.equals("7"))
		   {
			   System.out.print(" Operation: insert_cups(int n)");
			   System.out.print("\n");
			   System.out.print(" Enter value of parameter n:");
			   System.out.print("\n");			   
			   int n=input.nextInt();
			   if (num==1||num==2)
			       mapvm.put("n",n);
               num=v1.insert_cups(n,mapvm,num);
               int temp_n=Integer.parseInt(String.valueOf(mapvm.get("n")));
               if (num==1||num==2)
			      System.out.println("total number of cups are "+temp_n);               
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("8"))
		   {
			   System.out.print(" Operation: set_price(int p)");
			   System.out.print("\n");
			   System.out.print(" Enter value of parameter p:");
			   System.out.print("\n");			   
			   int p=input.nextInt();
               num=v1.set_price(p,mapvm,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   
		   else if (select.equals("9"))
		   {
			   System.out.print(" Operation: cancel()");
			   System.out.print("\n");
               num=v1.cancel(mapvm,num);
               mapvm.put("s", num);
			   selection1();			  
			   select=input.next();
		   }
		   else
		   {
			   selection1();			  
			   select=input.next();				   
		   }
		   		   		   
		}
		
		if (select.equals("q"))
	   {
		   System.out.println("The machine 1 is exit. Thank you");
		   input.close();
	   }			
		
	 }
	  
	  public void begin()
		 {
			 System.out.println("This is the demo for project CS586");
			 System.out.println("please choose the VM-1 or VM-2");
			 System.out.println("input 1 reprsents VM-1 or input 2 represents VM-2");
			 String choice=input.next();
			 mapvm.put("cf",0);
			 mapvm.put("price",0);
			 mapvm.put("n", 0);
			 mapvm.put("k", 0);
			 mapvm.put("card", 0);
			 if (choice.equals("1"))
			 {
				 vm1_operation();
				 v1.process();
				 vm1_show();
				 
			 }
			 if (choice.equals("2"))
			 {
				 vm2_operation();
				 v2.process();
				 vm2_show();
			 }
			
		 }  
		  	  	  
	  public void vm2_show()
	 {
		    selection2();  		  
	        String select=input.next();
			while (!select.equals("q"))
			{
						    	
			   if (select.equals("1"))
			   {
				   System.out.print(" Operation: CREATE(float p)");
				   System.out.print("\n");
				   System.out.print(" Enter value of parameter p:");
				   System.out.print("\n");
				   float p=input.nextFloat();
				   if (num==0)
				   {    num=v2.CREATE(p,0);
				   mapvm.put("price",p);}
				   mapvm.put("s", num);
				   selection2();			   
				   select=input.next();
			   }
			   
			   else if (select.equals("2"))
			   {
				   System.out.print(" Operation: COIN(float v)");
				   System.out.print("\n");
				   System.out.print(" Enter value of parameter v:");
				   System.out.print("\n");			   
				   float v=input.nextFloat();;
				   num=v2.COIN(v,mapvm,map2,num);
				   mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			   
			   else if (select.equals("3"))
			   {
				   System.out.print(" Operation: SUGAR()");
				   System.out.print("\n");
	               num=v2.SUGAR(2,mapvm,map2,num);
	               mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			   else if (select.equals("4"))
			   {
				   System.out.print(" Operation: CREAM()");
				   System.out.print("\n");
	               num=v2.CREAM(1,mapvm,map2,num);
	               mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			   else if (select.equals("5"))
			   {
				   System.out.print(" Operation: COFFEE()");
				   System.out.print("\n");
	               num=v2.COFFEE(1,mapvm,map2,num);
	               mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			 
			   else if (select.equals("6"))
			   {
				   System.out.print(" Operation: InsertCups(int n)");
				   System.out.print("\n");
				   System.out.print(" Enter value of parameter n:");
				   System.out.print("\n");			   
				   int n=input.nextInt();
				   if (num==2||num==1)
				       mapvm.put("n",n);
	               num=v2.InsertCups(n,mapvm,num);
	               int temp_n=Integer.parseInt(String.valueOf(mapvm.get("n")));
	               if (num==2||num==1)
				       System.out.println("total number of cups are "+temp_n);
				   mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			   else if (select.equals("7"))
			   {
				   System.out.print(" Operation: SetPrice(float p)");
				   System.out.print("\n");
				   System.out.print(" Enter value of parameter p:");
				   System.out.print("\n");			   
				   float p=input.nextFloat();
	               num=v2.SetPrice(p,mapvm,num);
	               mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   
			   else if (select.equals("8"))
			   {
				   System.out.print(" Operation: CANCEL()");
				   System.out.print("\n");
	               num=v2.CANCEL(mapvm,num);
	               mapvm.put("s", num);
				   selection2();			  
				   select=input.next();
			   }
			   else
			   {
				   selection2();			  
				   select=input.next();				   
			   }
			   
			   
			}
			
			if (select.equals("q"))
		   {
			  System.out.println("The machine 2 is exit. Thank you");
			  input.close();
		   }	
		
	 }
	  
	  
	  public void selection2()
	  {
		  System.out.println(" Select Operation: ");
		  System.out.println("1-CREATE,2-COIN,3-SUGAR,4-CREAM,5-COFFEE,6-InsertCups,7-SetPrice,8-CANCEL,q-exit");
	  }
	  
	  public void selection1()
	 {
		  System.out.println(" Select Operation: ");
		  System.out.println("1-create,2-coin,3-card,4-sugar,5-tea,6-cholocate,7-insert_cups,8-set_price,9-cancel,q-exit");
	 }
	  
	  	 
	 
}
