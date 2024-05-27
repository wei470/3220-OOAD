/*
 *Cshape is a abstract class that store id 
 *It defines properties and behaviors common to all shapes.
 */
public abstract class Cshape{
    /*
     *each shape has unique id
     */
    protected int id;
    /*
     *static int type counter for assign unique id for all shapes
     */
    private static int counter = 0;
    
    /*
    default constructor, assign shape with unique id and update the counter by + 1
     */
    public Cshape(){
        id = counter;
        counter ++;
    }
    
     /*abstract method of class, every class that extend Cshape must override toString
      *and indicate the information of the object 
      */
    
    public abstract String toString();
}