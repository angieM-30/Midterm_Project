
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*;

public class Example3_WindEvt_WindLis extends Frame {

    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
public Example3_WindEvt_WindLis(){
        setLayout(new FlowLayout());
        
        add(new Label("Counter"));
          
        tfCount = new TextField("0", 10);
        tfCount.setEditable(false);
        add(tfCount);
        
        btnCount = new Button("Count");
        add(btnCount);
        
        btnCount.addActionListener(new BtnCountListener());
        addWindowListener(new MyWindowListener());
                      
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
    
    private class MyWindowListener implements WindowListener{
        @Override
        public void windowClosing(WindowEvent evt){
            System.exit(0);
        }
        
        @Override public void windowOpened(WindowEvent evt) { }
        @Override public void windowClosed(WindowEvent evt) { }
        @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified");}
        public void windowDeIconified(WindowEvent evt) { System.out.println("Window Deiconified");}
        @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated");}
        public void windowDeActivated(WindowEvent evt) { System.out.println("Window Deactivated");}

        @Override
        public void windowDeiconified(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent we) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}