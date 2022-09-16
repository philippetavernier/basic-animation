import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingComponent extends JComponent{
    private int width;
    private int height;
    private Color backgroundColor;

    //--------1------
    private Square square;

 
    public DrawingComponent(int w, int h, Color c){  //CONSTRUCTEUR
        width=w;
        height=h;
        backgroundColor=c;

        //------1-----
        square = new Square(100,250,150,Color.ORANGE);
        setPreferredSize(new Dimension(width,height));
        //-----
    }

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Rectangle2D.Double background = new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(backgroundColor);
        g2d.fill(background);


        //------1------
        square.draw(g2d);

    }

    public void setBackgroundColor(Color bgColor){
        backgroundColor = bgColor;

    }

    public Square getSquare(){
        return square;
    }
}