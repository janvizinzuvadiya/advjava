package assignment2;

import javax.swing.JFrame;

public class texteditorclass {
    
    public static void main(String [] args)
    {
        texteditor t=new texteditor();
        t.setTitle("Notepad");
        t.setBounds(0, 0, 900, 900);
        t.setResizable(false);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
