//import from the API
import javax.swing.JFrame;

public class SOS extends JFrame{
    public SOS(String title){
       setTitle(title);
       setSize(600, 600);
       
       
    }
    public static void main(String[] args) {
        //create an instance of SOS
        SOS myWing=new SOS("University Management System");
        myWing.setVisible(true);
       
    }

}