
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class Example3_WindEvt_WindLis extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
public Example3_WindEvt_WindLis(){
        setLayout(new FlowLayout());
        
        lblCount = new Label("Counter");
        add(lblCount);
        
        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);
        
        btnCount = new Button("Count");
        add(btnCount);
        
        BtnCountListener Listener = new BtnCountListener();
        btnCount.addActionListener(Listener);
                      
        setTitle("AWT Counter");
        setSize(300, 100);
        
        setVisible(true);
    }
    
    

    public static void main(String[] args) {
        
       new Example3_WindEvt_WindLis();
        
    }
    
    private class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            ++count;
            tfCount.setText(count + "");
        }
    }
    
    private abstract class MyWindowListener implements ActionListener{
   
        public void windowClosing(WindowEvent evt){
            System.exit(0);
        }
        
         public void windowOpened(WindowEvent evt) { }
         public void windowClosed(WindowEvent evt) { }
         public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified");}
         public void windowDeIconified(WindowEvent evt) { System.out.println("Window Deiconified");}
         public void windowActivated(WindowEvent evt) { System.out.println("Window Activated");}
         public void windowDeActivated(WindowEvent evt) { System.out.println("Window Deactivated");}
        
    }
}