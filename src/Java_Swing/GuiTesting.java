package Java_Swing;

import lombok.SneakyThrows;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuiTesting {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("javaLab.txt");

        // creating the jframe
        JFrame jFrame = new JFrame("Lab Exam");
        jFrame.setSize(400,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

        // textfields
        JTextField t1,t2,t3;
        t1=new JTextField("");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("");
        t2.setBounds(50,150, 200,30);
        t3=new JTextField("");
        t3.setBounds(50,200, 200,30);

        //button
        JButton b=new JButton("Add");
        JButton b1=new JButton("Show");
        JButton b2=new JButton("Winner");
        b.setBounds(50,250,95,30);
        b1.setBounds(50,300,95,30);
        b2.setBounds(50,350,95,30);

        b.addActionListener(new ActionListener() {
            @SneakyThrows
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                int id =  Integer.parseInt( t2.getText() );
                float marks = Float.parseFloat(t3.getText());

                String input = name +","+id+","+marks;

                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(input);

                bufferedWriter.close();
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JTextArea area=new JTextArea("TextArea");
        area.setBounds(10,400, 200,200);

        // adding to jframe
        jFrame.add(area);
        jFrame.add(b);
        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(t1);
        jFrame.add(t2);
        jFrame.add(t3);
    }
}
