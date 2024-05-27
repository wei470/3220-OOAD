/**
 * The CCircle class represents an circle shape.
 * It extends the Cshape class and override toString method
 */
public class CCircle extends Cshape{
/*
 * Circle has one variable, they are:
 * The radius of circle
 */
    private int radius; 
/*
 * default constrctor, accecpt one int variable in constrctor and assign the CCircle with
 * @param r, the radius of circle
 */
    public CCircle(int r){ 
        this.radius = r;
    }
   

/*
 * Returns a string representation of the Circle.
 * Overrides the toString method from the Cshape class.
 * @return A string description of the Cicle: Shape "id": Circle "radius";
 */
    public String toString(){
        return "Shape " + id + ": Circle "+ radius;
    }
}