import java.util.Random;
import java.util.HashSet;

public class Main
{
	public static void main(String[] args) {
/*
 *count for number of shapes stored
 */
	    int count = 0;
/*
 *canvas to hold all shapes
 */
		CCanvas canvas = new CCanvas();
/*
 *set up random Numbers
 */
		Random random = new Random();
/*
 *set up hashset for checking existing shapes
 */
		HashSet<String> existing = new HashSet<>();
/* Only create 10 shapes, the loop will exit when there is 10 objects
*
*/
		while (count <= 10){
		Cshape object = null;
		int t = random.nextInt(4); 
/* let t = {0,1,2,3} to determine which random shape will object be
 * if t=0, create Coval
 * if t=1 create Circle
 * if t=2 create CRectangle
 * if t=3 create CSquare 
 */
if(t == 0){
    object= new COval(random.nextInt(100),random.nextInt(100));
}
if(t == 1){
    object= new CCircle(random.nextInt(100));
}
if(t == 2){
   object= new CRectangle(random.nextInt(100),random.nextInt(100));
}
if(t == 3){
   object= new CSquare(random.nextInt(100));
}

String t1 = object.toString(); 
/* use temporary variable to store toString information of this object after ":"
 * add the string information to hashmap existing
 * this process will check if the object that create is repeated from previous object
 * because in treemap, when add(x), will return true if x is not exist, and will return false if x is not exist
 */
if(existing.add(t1) == true){  
                               
    canvas.add(object);
/*
 * update the counter +1 only if t1 is not exist in canvas
 */
    count ++;          
}
 

}
/*
 *output all data store in canvas calling private print method on CCanvas class
 */
	canvas.print(); 
	}
}
