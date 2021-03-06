import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

// create a square drawing function that takes 2 parameters:
// the x and y coordinates of the square's top left corner
// and draws a 50x50 square from that point.
// draw 3 squares with that function.

public class SquarePositioning {

  public static void mainDraw(Graphics graphics) {
    drawingFunction3(20, 30, graphics);
    drawingFunction3(160, 180, graphics);
    drawingFunction3(230, 90, graphics);
  }

  public static void drawingFunction3(int x, int y, Graphics graphics) {
    graphics.drawRect(x, y, 50, 50);

  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}