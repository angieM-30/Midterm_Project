
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*;

public class Example1_AWTCounter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;
    
    public Example1_AWTCounter (){
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
        
        Example1_AWTCounter app = new Example1_AWTCounter();
        
    }
    
    private class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            ++count;
            tfCount.setText(count + "");
        }
    }
}

