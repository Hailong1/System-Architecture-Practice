package State;
import java.util.Map;


/**
 * This class is the state of the OP class that is responsible for the MDA-EFSM actions.
 * so this source code are responsible for the implementation of the state pattern.
 * And it is used the De-centralized State Pattern.  
 *
 */

public abstract class VM_State extends MDA_EFSM{

	        
    public abstract int create(Object o,int value);
    
    public abstract int insert_cups(Object o,int value,Map<String,Object>map);
    
    public abstract int coin(Object o,int f,int value,Map<String,Object>map,Map<Integer,Integer>A);
    
    public abstract int card(Object o,Map<String,Object>map,Map<Integer,Integer>A,int value);
    
    public abstract int cancel(Object o,Map<String,Object>map, int value);
    
    public abstract int set_price(Object o, int value);
    
    public abstract int dispose_drink(Object o, int value, int d,Map<String,Object>map,Map<Integer,Integer>A);
    
    public abstract int additive(Object o, int value,Map<Integer,Integer>A,int a);
    
    MDA_EFSM m=new MDA_EFSM();
    
}
