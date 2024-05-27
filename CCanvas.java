/*
 * CCanvas class is a container that store all shape that created
 * CCanvas "has-a" shape
 */

import java.util.ArrayList;
import java.util.List;

public class CCanvas{
/*
 * Store all shapes in Arraylist 
 */
    private List<Cshape> shape = new ArrayList<>(); 
    
/*
 *add new shapes into linklist    
 */
    public void add(Cshape name){
        shape.add(name);
    }
    
/*
 *print the information of all object in order
 */
    public void print(){ 
        for(Cshape name: shape){
            System.out.println(name.toString());
        }
    }
    

}