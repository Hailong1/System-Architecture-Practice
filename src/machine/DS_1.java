package machine;

/**
 *  This class is used for store the VM-1 data.
 */

public class DS_1 extends DataStore{
	
	private float temp_p;
	private int temp_v;
	private int price;
	private int cf;
	
	
	public DS_1()
	{
		this.cf=0;
	}
	
	
	void setP(float x)
	{
		temp_p=x;
	}
     float getP()
	{
		return temp_p;
	}
	void setV(int x)
	{
		temp_v=x;
	}
	
	 int getV()
	 {
		 return temp_v;
	 }
	 void setprice(int x)
	 {
		 price=x;
	 }
	 int getprice()
	 {
		 return price;
	 }
	 void setcf(int x)
	 {
		 cf=x; 
	 }
	 int getcf()
	 {
		 return cf;
	 }
	

}
