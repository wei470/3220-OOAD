/**
 * The Csquare class represents an SQUARE shape.
 * It extends the CRectangle class because square "is-a" Rectangle and override toString method
 */
public class CSquare extends CRectangle{
    
/*
 * default constrctor, accecpt one int variable in constrctor
 * call default constrctor of its surper class public CRectangle(int L, int W) and asign them with s
 */
    public CSquare(int s){
        super(s,s);
    }

/*
 * Returns a string representation of the SQUARE.
 * Overrides the toString method from the CRectangle class.
 * @return A string description of the square: Shape "id": SQUARE "Length / Width";
 */
    public String toString(){
                return "Shape " + id + ": SQUARE "+ Length;
    }
}