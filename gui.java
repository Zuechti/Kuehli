import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 05.09.2016
 * @author 
 */

public class gui extends JFrame {
    // Anfang Attribute
    private JButton bRemove = new JButton();
    private JTextField tName = new JTextField();
    private JTextField tFresh = new JTextField();
    private JButton bAdd = new JButton();
    private JButton bOpen = new JButton();
    private JButton jButton4 = new JButton();
    private Fridge f = new Fridge(20);
    private JTextArea jta = new JTextArea("");
    private JScrollPane jtaScrollPane = new JScrollPane(jta);
    // Ende Attribute

    public gui() { 
        // Frame-Initialisierung
        super("Fridgo");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 446; 
        int frameHeight = 525;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        // Anfang Komponenten

        bRemove.setBounds(200, 88, 113, 33);
        bRemove.setText("Remove");
        bRemove.setMargin(new Insets(2, 2, 2, 2));
        bRemove.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bRemove_ActionPerformed(evt);
                }
            });
        cp.add(bRemove);
        tName.setBounds(200, 8, 225, 33);
        tName.setHorizontalAlignment(SwingConstants.CENTER);
        tName.setText("");
        tName.setToolTipText("Name of Object");
        cp.add(tName);
        tFresh.setBounds(200, 48, 225, 33);
        tFresh.setHorizontalAlignment(SwingConstants.CENTER);
        tFresh.setText("");
        tFresh.setToolTipText("Freshness Date");
        cp.add(tFresh);
        bAdd.setBounds(312, 88, 113, 33);
        bAdd.setText("Add");
        bAdd.setMargin(new Insets(2, 2, 2, 2));
        bAdd.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bAdd_ActionPerformed(evt);
                }
            });
        cp.add(bAdd);
        bOpen.setBounds(8, 8, 185, 33);
        bOpen.setText("Open Door");
        bOpen.setMargin(new Insets(2, 2, 2, 2));
        bOpen.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    bOpen_ActionPerformed(evt);
                }
            });
        bOpen.setToolTipText("Door is currently closed");
        cp.add(bOpen);
        jButton4.setBounds(8, 48, 185, 33);
        jButton4.setText("jButton4");
        jButton4.setMargin(new Insets(2, 2, 2, 2));
        jButton4.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent evt) { 
                    jButton4_ActionPerformed(evt);
                }
            });
        cp.add(jButton4);
        jtaScrollPane.setBounds(200, 128, 225, 257);
        jta.setEditable(false);
        cp.add(jtaScrollPane);
        // Ende Komponenten

        setVisible(true);
    } // end of public gui

    // Anfang Methoden

    public static void main(String[] args) {
        new gui();
    } // end of main

    public void bRemove_ActionPerformed(ActionEvent evt) {

    } // end of bRemove_ActionPerformed

    public void bAdd_ActionPerformed(ActionEvent evt) {
        if(f.isOpen()){
            f.addWare(Integer.parseInt(tFresh.getText()), tName.getText());

            updateText();
        }
        else{
            jta.setText("Der Kühlschrank ist zu. BAKA");
        }
    } // end of bAdd_ActionPerformed

    public void bOpen_ActionPerformed(ActionEvent evt) {
        f.invertDoor();
        f.invertLight();
        if(f.isOpen()){
            bOpen.setText("Close Door");
            updateText();
        }
        else{
            bOpen.setText("Open Door");
            jta.setText("");
        }
    } // end of bOpen_ActionPerformed
    public void jButton4_ActionPerformed(ActionEvent evt) {
    } // end of jButton4_ActionPerformed
    public void updateText(){
        jta.setText("");
        for(int i=0;i<f.getStorageLength();i++){

            int y=i+1;
            if(f.getStorage(i)!=null){
                jta.setText(jta.getText()+y+": "+f.getStorage(i).getName()+" "+f.getStorage(i).getMhd()+"\n");
            }
            else{
                jta.setText(jta.getText()+""+y+": "+"empty"+"\n");
            }
        }
    }
    // Ende Methoden
} // end of class gui





