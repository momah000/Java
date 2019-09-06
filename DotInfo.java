/**
 * The class <b>DotInfo</b> is a simple helper class to store the initial color and state
 * (captured or not) at the dot position (x,y)
 *
 * @author Guy-Vincent Jourdan, University of Ottawa
 */
import java.util.Random;
import java.awt.color;
import java.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.BorderFacotory;
import javax.swing.border.Border;

public class DotInfo {

//Used to generate cell type
private static Random generator=new Random();
//Number of Colours
public static final int NUM_COLOURS=6;

private int x;

private int y;

private int color;

private boolean captured;



    /**
     * Constructor 
     * 
     * @param x
     *            the x coordinate
     * @param y
     *            the y coordinate
     * @param color
     *            the initial color
     */
    public DotInfo(int x, int y, int color){
        this.x=x;
        this.y=y;
        this.color=color;


    }

    /**
     * Getter method for the attribute x.
     * 
     * @return the value of the attribute x
     */
    public int getX(){
        return x;
    }
    
    /**
     * Getter method for the attribute y.
     * 
     * @return the value of the attribute y
     */
    public int getY(){
        return y;
    }
    
 
    /**
     * Setter for captured
     * @param captured
     *            the new value for captured
     */
    public void setCaptured(boolean captured) {
        return captured;

    }

    /**
     * Get for captured
     *
     * @return captured
     */
    public boolean isCaptured(){
        this.captured=captured;

    }

    /**
     * Get for color
     *
     * @return color
     */
    public int getColor() {
        return color;

    }

 }