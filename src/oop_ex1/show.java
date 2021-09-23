
package oop_ex1;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class show {
    JFrame fr = new JFrame("HCN");
    JLabel lbl_tb =new JLabel("Hinh chu nhat");
    JLabel lbl_cd = new JLabel(" Chieu dai: ");
    JLabel lbl_cr= new JLabel(" Chieu rong: ");
    
    public show(){
        fr.add(lbl_tb);
        fr.add(lbl_cd);
        fr.add(lbl_cr);
        
        fr.setVisible(true);
    }
    
}
