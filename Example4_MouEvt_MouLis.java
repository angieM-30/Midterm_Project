
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*; 

public class Example4_MouEvt_MouLis extends Frame {
    private TextField tfMouseX;
    private TextField tfMouseY;
    
    public Example4_MouEvt_MouLis(){
        setLayout(new FlowLayout());
        
        add(new Label("X-Click: "));
        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);
        
        add(new Label("Y-Click: "));
        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);
        
        //addMouseListener(new MyMouseListener());
        
        setTitle("Mouse Event");
        setSize(350, 100);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Example4_MouEvt_MouLis();
    }
    
    private abstract class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent evt){
            tfMouseX.setText(evt.getX() + "");
            tfMouseY.setText(evt.getY() + "");
        }
        
        public void mousePressed(WindowEvent evt) { }
        public void mouseReleased(WindowEvent evt) { }
        public void mouseEntered(WindowEvent evt) { }
        public void mouseExited(WindowEvent evt) { }
    }
}
