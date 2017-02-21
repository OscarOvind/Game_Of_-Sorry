
/**
 * light weight graphics object that can draw its self 
 * (its supossed theo be a circle)
 * 
 * @author (Jonathan Ho) 
 * @version (V.1 Jan 13)
 */
import javax.swing.*;
import java.awt.*;
public class piece
{
    //instance fields
    private int xLocation;
    private int yLocation; 
    Color colour;
    protected int locationValue = 0;
    // constructor
    public piece(int player, tile[] tileArray)
    {
        
        // sets the color
        switch( player)
        {
            case 0: 
                colour = Color.BLUE;
                locationValue = 4;
                break;
            case 1:
                colour = Color.GREEN;
                locationValue = 19;
                break;
            case 2: 
                colour = Color.RED;
                locationValue = 34;
                break;
            case 3:
                colour = Color.YELLOW;
                locationValue = 49;
                break;
                
        }
        
        xLocation = tileArray[locationValue].getX();
        yLocation = tileArray[locationValue].getY();
    }
    public piece(int player, int x, int y)
    {
        switch( player)
        {
            case 0: 
                colour = Color.BLUE;
                locationValue = 4;
                break;
            case 1:
                colour = Color.GREEN;
                locationValue = 19;
                break;
            case 2: 
                colour = Color.RED;
                locationValue = 34;
                break;
            case 3:
                colour = Color.YELLOW;
                locationValue = 49;
                break;
                
        }
        xLocation = x;
        yLocation = y;
    }
    // its draw method
    public void draw(Graphics g)
    {
        g.setColor(colour);
        g.fillOval(xLocation,yLocation,45, 45);
    }
    // updates the x coodinate of the tile
    public void updateX(int x)
    {
        xLocation = x;
    }
    public void updateY(int y)
    {
        yLocation = y;
    }
    
    public void setlocationValue(int x)
    {
        locationValue = x;
    }
    
    public int getlocationValue()
    {
        return locationValue;
    }
    
    public int getNextSpot(int spots)
    {
        int newSpot = locationValue + spots;
        if( newSpot > 59)
            newSpot = newSpot - 60;
        else if (newSpot < 0)
            newSpot = newSpot + 60;
            
        return newSpot;
    }
}
