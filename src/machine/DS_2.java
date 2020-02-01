package machine;

/**
 * This class is used for store the VM-2 data.
 */

public class DS_2 extends DataStore{
	
	private float temp_p;
	private float temp_v;
	private float price;
	private float cf;
	
	public DS_2()
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
	void setV(float x)
	{
		temp_v=x;
	}
	
	 float getV()
	 {
		 return temp_v;
	 }
	 void setprice(float x)
	 {
		 price=x;
	 }
	 float getprice()
	 {
		 return price;
	 }
	 void setcf(float x)
	 {
		 cf=x; 
	 }
	 float getcf()
	 {
		 return cf;
	 }
	

}
