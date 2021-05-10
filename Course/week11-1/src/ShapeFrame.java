import javax.swing.*;
import java.awt.*;

public class ShapeFrame extends JFrame {
    private Shape[] shapes;

    public ShapeFrame(){
        setTitle("My Shape");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        shapes = new Shape[3];
        shapes[0] = new Rectangle(50,50,200,100);
        shapes[1] = new Circle(100,150,50);
        shapes[2] = new Rectangle(200,150,50,50);
    }

    public void paint(Graphics g){
        super.paint(g);
        for (Shape shape: shapes){
            shape.draw(g);
        }
    }
}
