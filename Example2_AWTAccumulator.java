
package midterm_project.Midterm_Project;
import java.awt.*;
import java.awt.event.*;

public class Example2_AWTAccumulator extends Frame{
    
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0;
    
    public Example2_AWTAccumulator (){
        setLayout(new GridLayout(2, 2));
        
        add(new Label("Enter an Integer: "));
        
        tfInput = new TextField(10);
        add(tfInput);
        
        tfInput.addActionListener(new TFInputListener());
        
        add(new Label("The Accumulated Sum is: "));
        
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);
        
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Example2_AWTAccumulator();
    }
    
    private class TFInputListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}