/**
 * The CRectangle class represents an Rectangle shape.
 * It extends the Cshape class and override toString method
 */
public class CRectangle extends Cshape{
/*
 * Rectangle has two variable, they are:
 * The length of the Rectangle.
 * The Width of the Rectangle
 */
    protected int Length;
    protected int Width;

/*
 * default constrctor, accecpt two int variable in constrctor and assign the CRectangle with these two virable
 * @param L The Length dimension of the Rectangle.
 * @param W The Width dimension of the Rectangle.
 */
    public CRectangle(int L, int W){
        this.Length = L;
        this.Width = W;
    }
    
/*
 * Returns a string representation of the Rectangle.
 * Overrides the toString method from the Cshape class.
 * @return A string description of the Rectangle: Shape "id": Rectangle "Length" * "Width".
 */
    public String toString(){
             return "Shape " + id + ": RECTANGLE "+ Length + "x" + Width; 
          }
}