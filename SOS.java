//import from the API
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;


public class SOS extends JFrame implements ActionListener{
    public SOS(String title){
        setTitle(title);
        setSize(600, 600);
        JMenuBar menuBar=new JMenuBar();
        JMenu filMenu=new JMenu("File");
        menuBar.add(filMenu);
        setJMenuBar(menuBar);
        JMenuItem openFile=new JMenuItem("Open");
        openFile.addActionListener(this);
        filMenu.add(openFile);
        JMenuItem editFile=new JMenuItem("Edit");
        filMenu.add(editFile);
        JMenuItem selectionFile=new JMenuItem("Selection");
        filMenu.add(selectionFile);
        JMenuItem helpFile=new JMenuItem("Help");
        filMenu.add(helpFile);


    }
    public static void main(String[] args) {
        //create an instance of SOS
        SOS myWing=new SOS("University Management System");
        myWing.setVisible(true);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
     
    }

}