
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*; 

public class Example5_MouEvt_MouMotLis extends Frame {
    private TextField tfMouseX;
    private TextField tfMouseY;
    
    private TextField tfMousePositionX;
    private TextField tfMousePositionY;
    
    public Example5_MouEvt_MouMotLis(){
        setLayout(new FlowLayout());
        
        add(new Label("X-Click: "));
        tfMouseX = new TextField(10);
        tfMouseX.setEditable(false);
        add(tfMouseX);
        add(new Label("Y-Click: "));
        tfMouseY = new TextField(10);
        tfMouseY.setEditable(false);
        add(tfMouseY);
        
        add(new Label("X-Position: "));
        tfMousePositionX = new TextField(10);
        tfMousePositionX.setEditable(false);
        add(tfMousePositionX);
        add(new Label("Y-Position: "));
        tfMousePositionY = new TextField(10);
        tfMousePositionY.setEditable(false);
        add(tfMousePositionY);
        
        MyMouseListener listener = new MyMouseListener(); 
        addMouseListener(listener); 
        addMouseMotionListener(listener);
        
        setTitle("Mouse Event");
        setSize(400, 120);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Example5_MouEvt_MouMotLis();
    }
    
    private class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override public void mouseClicked(MouseEvent evt) { 
            tfMouseX.setText(evt.getX() + "");
            tfMouseY.setText(evt.getY() + "");
    }
        
        @Override public void mousePressed(MouseEvent evt) { } 
        @Override public void mouseReleased(MouseEvent evt) { } 
        @Override public void mouseEntered(MouseEvent evt) { } 
        @Override public void mouseExited(MouseEvent evt) { }
        
        @Override public void mouseMoved(MouseEvent evt) { 
            tfMousePositionX.setText(evt.getX() + ""); 
            tfMousePositionY.setText(evt.getY() + ""); 
        }
        @Override public void mouseDragged(MouseEvent evt) { }
    }
}