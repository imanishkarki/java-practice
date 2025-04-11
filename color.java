import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class color extends JFrame implements ActionListener{
    JButton j1, j2, j3;
    public color(){
        JFrame j = new jFrame("Colors Game");
        j1 = new JButton("RED");
        j2 = new JButton("GREEN");
        j3 = new JButton("BLUE");
        j.setLayout(new GridLayout(1,3));
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        j.add(j1);
        j.add(j2);
        j.add(j3);
        setSize(300,300);
        setVisible(true);

    }
    public void action (ActionEvent e){
        
    }
    
}
