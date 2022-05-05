
package com.unipi._usojswing;
import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author unipi
 */
public class Panel extends JFrame{
    
    private JTextArea testo;
    private JButton btn;
    
    public Panel(String title)
    {
        super(title);
        
        testo = new JTextArea();
        btn = new JButton("chiudi");
        
        setLayout(new BorderLayout());
        add(btn, BorderLayout.LINE_END);
        
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
