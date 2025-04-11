import javax.swing.*;
public class menu {
    JMenu  menuu, submenu;
    JMenuItem i1, i2, i3, i4, i5;

    menu(){
        JFrame f = new JFrame("menu and menu example");
        JMenuBar mb = new JMenuBar();
        menuu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menuu.add(i1);
        menuu.add(i2);
        menuu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menuu.add(submenu);
        mb.add(menuu);   // add main menu to menubar
        f.setJMenuBar(mb); //set the menu bar on the frame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
    public static void main(String[] args) {
        new menu();
    }
    
}