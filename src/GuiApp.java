
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiApp extends JFrame {

    //a method with the same name as the class
    //is called a constructor - used to initialize the object
    public GuiApp() {
        super("Super Duper Gui App");
        //you need 3 things for a menu
        //1. JMenuBar 2. JMenu 3. JMenuItem
        JMenuBar jmb = new JMenuBar();
        setJMenuBar(jmb);
        //file menu
        JMenu jm = jmb.add(new JMenu("File"));
        JMenuItem jmi = jm.add(new JMenuItem("New...", 'N'));
        jmi = jm.add(new JMenuItem("Add...", 'A'));
        jm.addSeparator();
        jmi = jm.add(new JMenuItem("Exit", 'X'));
        ///java uses listeners for event handlers
        //for the click event you need an ActionListener
        jmi.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                System.exit(0);
                
                
            }
            }
        //sort menu
        jm = jmb.add(new JMenu("Sort"));
        jmi = jm.add(new JMenuItem("Names", 'N'));
        jmi = jm.add(new JMenuItem("Grades", 'G'));
        //help menu
        jm = jmb.add(new JMenu("Help"));
        jmi = jm.add(new JMenuItem("About", 'A'));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Monotype Corsiva", Font.ITALIC, 72));
        g.setColor(Color.magenta);
        g.drawString("This is a test", 40, 100);
        g.drawLine(40, 40, 200, 200);
        g.fillRect(200, 100, 100, 100);
    }

    public static void main(String[] args) {

        new GuiApp();

    }

}
