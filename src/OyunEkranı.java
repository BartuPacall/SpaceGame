
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class OyunEkranı extends JFrame{

    public OyunEkranı(String string) throws HeadlessException {
        super(string);
    }
    
    
    
    public static void main(String[] args) {
        
        OyunEkranı ekran = new OyunEkranı("Oyun Ekranı");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        
        
        ekran.setSize(800 , 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();// klavye işlemlerini anlaması için direkt odağı bana ver diyor
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true); // focusu jpanele verdik
        
        oyun.setFocusTraversalKeysEnabled(false); // klavye işlerini anlaması için gerekli olan 1 işlem daha buna false demeliyiz ki klavye işlerimiz gerçekleşebilsin
        
        ekran.add(oyun);
        ekran.setVisible(true);
        
        
    }
    
    
}
