/**
 * The COval class represents an oval shape.
 * It extends the Cshape class and override toString method
 */
public class COval extends Cshape{
/*
 * Oval has two variable, they are:
 * The vertical dimension of the oval.
 * The Horizontal dimension of the oval
 */
    private int Horizontal; 
    private int Vertical;
    
/*
 * default constrctor, accecpt two int variable in constrctor and assign the Coval with these two virable
 * @param H The horizontal dimension of the oval.
 * @param V The vertical dimension of the oval.
 */
    public COval(int H, int V){
        this.Horizontal= H;
        this.Vertical = V;
    }
    
/*
 * Returns a string representation of the oval.
 * Overrides the toString method from the Cshape class.
 * @return A string description of the oval: Shape "id": OVAL "horizontal" * "Vertical".
 */
    public String toString(){
        return "Shape " + id + ": OVAL "+ Horizontal+ "x" + Vertical;
    }
}