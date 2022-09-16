import java.awt.*;
import javax.swing.*;

public class DrawingFrame extends JFrame{
    private int width;
    private int height;
    private String title;
    //constructeur
    public DrawingFrame(int w, int h, String t){
        width = w;
        height = h;
        title =t;

    }

    public void setUpFrame(){
        Container contentPane = getContentPane();
        DrawingComponent drawingComponent = new DrawingComponent(width,height, Color.BLACK);
        //--------1-----
        ButtonControls buttonControls = new ButtonControls(drawingComponent);
        buttonControls.setUpPanel( );
        //--------
        
        setTitle(title);
        contentPane.add(drawingComponent, BorderLayout.CENTER);
        contentPane.add(buttonControls, BorderLayout.SOUTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

}