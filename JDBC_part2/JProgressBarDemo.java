// package JDBC_part2;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
import java.lang.*;
 
/**
 *
 * @author Axiom Director
 */
public class JProgressBarDemo {
    

    public static void main(String[] args) {
        final int MAX = 100;
        final JFrame frame = new JFrame("JProgress Demo");
 
        // creates progress bar
        final JProgressBar pb = new JProgressBar();
        pb.setMinimum(0);
        pb.setMaximum(MAX);
        pb.setStringPainted(true);
 
        // add progress bar
        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(pb);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
 
        // update progressbar
        for (int i = 0; i <= MAX; i++) {
            final int currentValue = i;
            try {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        pb.setValue(currentValue);
                    }
                });
                Thread.sleep(100);
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(frame, e.getMessage());
            }
        }
 
    }
} 
