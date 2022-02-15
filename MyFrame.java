import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements MouseListener, ActionListener{
    
    JLabel label1,label2,label3,label4,label5,label6,label7,label8, label9, extraLabel, greenlight, redlight;
    int x, y, z;
    JTextField set1, set2, set3, set4, set5, set6, set7, set8;
    ImageIcon image1, image2, image3, image4, image5, image6, image7, image8, image9;
    int b1a = 0, b1b = 0, b1c = 88, b1d = 100;
    int b2a = 88, b2b = 0,b2c = 88, b2d = 100;
    int b3a = 176, b3b = 0, b3c = 88, b3d = 100;
    int b4a = 0, b4b = 100, b4c = 88, b4d = 100;
    int b5a = 88, b5b = 100, b5c = 88, b5d = 100;
    int b6a = 176, b6b = 100, b6c = 88, b6d = 100;
    int b7a = 0, b7b = 200, b7c = 88, b7d = 100;
    int b8a = 88, b8b = 200, b8c = 88, b8d = 100;
    int b9a = 176, b9b = 200, b9c = 88, b9d = 100;

    int a, b;
    JButton butt;


    MyFrame(){
        JOptionPane.showMessageDialog(null, "Puzzle Swap Game! Beta-A001 By ReCruAs");
        //betashuffle
        b2a = 0; b2b = 0;b2c = 88; b2d = 100;
        b7a = 176; b7b = 0; b7c = 88; b7d = 100;
        b4a = 88; b4b = 200; b4c = 88; b4d = 100;
        b5a = 88; b5b = 100; b5c = 88; b5d = 100;
        b6a = 176; b6b = 100; b6c = 88; b6d = 100;
        b3a = 0; b3b = 200; b3c = 88; b3d = 100;
        b8a = 0; b8b = 100; b8c = 88; b8d = 100;
        b1a = 176; b1b = 200; b1c = 88; b1d = 100;
        b9a = 88; b9b = 0; b9c = 88; b9d = 100;

        this.setTitle("Puzzle Swap Game! (BETA-A001)");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ImageIcon icon = new ImageIcon("ert.png");
        this.setIconImage(icon.getImage());
        this.setSize(380,390);
        this.setLocation(700, 300);
        this.setLayout(null);
        this.setResizable(false);

        label1 = new JLabel();
        image1 = new ImageIcon("ert1.png");
        label1.setIcon(image1);
        label1.setBounds(b1a,b1b,b1c,b1d);
        label1.setBackground(Color.red);
        label1.setOpaque(true);
        label1.addMouseListener(this);
        label1.setText("1");
        label1.setHorizontalAlignment(JTextField.CENTER);

        label2 = new JLabel();
        image2 = new ImageIcon("ert2.png");
        label2.setIcon(image2);
        label2.setBounds(b2a,b2b,b2c,b2d);
        label2.setBackground(Color.blue);
        label2.setOpaque(true);
        label2.addMouseListener(this);
        label2.setText("2");
        label2.setHorizontalAlignment(JTextField.CENTER);

        label3 = new JLabel();
        image3 = new ImageIcon("ert3.png");
        label3.setIcon(image3);
        label3.setBounds(b3a,b3b,b3c,b3d);
        label3.setBackground(Color.green);
        label3.setOpaque(true);
        label3.addMouseListener(this);
        label3.setText("3");
        label3.setHorizontalAlignment(JTextField.CENTER);

        label4 = new JLabel();
        image4 = new ImageIcon("ert4.png");
        label4.setIcon(image4);
        label4.setBounds(b4a,b4b,b4c,b4d);
        label4.setBackground(Color.yellow);
        label4.setOpaque(true);
        label4.addMouseListener(this);
        label4.setText("4");
        label4.setHorizontalAlignment(JTextField.CENTER);

        label5 = new JLabel();
        image5 = new ImageIcon("ert5.png");
        label5.setIcon(image5);
        label5.setBounds(b5a,b5b,b5c,b5d);
        label5.setBackground(Color.orange);
        label5.setOpaque(true);
        label5.addMouseListener(this);
        label5.setText("5");
        label5.setHorizontalAlignment(JTextField.CENTER);

        label6 = new JLabel();
        image6 = new ImageIcon("ert6.png");
        label6.setIcon(image6);
        label6.setBounds(b6a,b6b,b6c,b6d);
        label6.setBackground(Color.magenta);
        label6.setOpaque(true);
        label6.addMouseListener(this);
        label6.setText("6");
        label6.setHorizontalAlignment(JTextField.CENTER);

        label7 = new JLabel();
        image7 = new ImageIcon("ert7.png");
        label7.setIcon(image7);
        label7.setBounds(b7a,b7b,b7c,b7d);
        label7.setBackground(Color.blue);
        label7.setOpaque(true);
        label7.addMouseListener(this);
        label7.setText("7");
        label7.setHorizontalAlignment(JTextField.CENTER);

        label8 = new JLabel();
        image8 = new ImageIcon("ert8.png");
        label8.setIcon(image8);
        label8.setBounds(b8a, b8b, b8c, b8d);
        label8.setBackground(Color.pink);
        label8.setOpaque(true);
        label8.addMouseListener(this);
        label8.setText("8");
        label8.setHorizontalAlignment(JTextField.CENTER);

        label9 = new JLabel();
        image9 = new ImageIcon("ert9.png");
        label9.setIcon(image9);
        label9.setBounds(b9a, b9b, b9c, b9d);
        label9.setBackground(Color.orange);
        label9.setOpaque(true);
        label9.addMouseListener(this);
        label9.setText("9");
        label9.setHorizontalAlignment(JTextField.CENTER);

        extraLabel = new JLabel();
        extraLabel.setBackground(Color.white);
        extraLabel.setBounds(264, 0, 200, 300);
        extraLabel.setOpaque(true);

        set1 = new JTextField();
        set1.setBounds(264, 0, 50, 40);
        this.add(set1);

        set2 = new JTextField();
        set2.setBounds(264, 40, 50, 40);
        this.add(set2);

        set3 = new JTextField();
        set3.setBounds(264, 80, 50, 40);
        this.add(set3);

        set4 = new JTextField();
        set4.setBounds(264, 120, 50, 40);
        this.add(set4);

        set5 = new JTextField();
        set5.setBounds(314, 0, 50, 40);
        this.add(set5);

        set6 = new JTextField();
        set6.setBounds(314, 40, 50, 40);
        this.add(set6);

        set7 = new JTextField();
        set7.setBounds(314, 80, 50, 40);
        this.add(set7);

        set8 = new JTextField();
        set8.setBounds(314, 120, 50, 40);
        this.add(set8);
        
        redlight= new JLabel();
        redlight.setBounds(264,160,50,40);
        redlight.setBackground(Color.red);
        redlight.setOpaque(true);
        this.add(redlight);

        greenlight= new JLabel();
        greenlight.setBounds(314,160,50,40);
        greenlight.setBackground(Color.red);
        greenlight.setOpaque(true);
        this.add(greenlight);

        butt = new JButton("Swap");
        butt.setBounds(0, 300, 264, 50);
        butt.addActionListener(this);

        this.add(label1);
        this.add(label2);
        this.add(label3);
        this.add(label4);
        this.add(label5);
        this.add(label6);
        this.add(label7);
        this.add(label8);
        this.add(label9);
        this.add(extraLabel);
        this.add(butt);

        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==butt){
            if (a==1 &&b==2){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b2a; b1b=b2b; b1c = b2c; b1d=b2d;
                b2a=aa; b2b=bb; b2c=cc; b2d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label2.setBounds(b2a,b2b,b2c,b2d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if(a==b){
                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b2a; b1b=b2b; b1c = b2c; b1d=b2d;
                b2a=aa; b2b=bb; b2c=cc; b2d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label2.setBounds(b2a,b2b,b2c,b2d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b3a; b1b=b3b; b1c = b3c; b1d=b3d;
                b3a=aa; b3b=bb; b3c=cc; b3d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label3.setBounds(b3a,b3b,b3c,b3d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b3a; b1b=b3b; b1c = b3c; b1d=b3d;
                b3a=aa; b3b=bb; b3c=cc; b3d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label3.setBounds(b3a,b3b,b3c,b3d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b4a; b1b=b4b; b1c = b4c; b1d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b4a; b1b=b4b; b1c = b4c; b1d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b5a; b1b=b5b; b1c = b5c; b1d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b5a; b1b=b5b; b1c = b5c; b1d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b6a; b1b=b6b; b1c = b6c; b1d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b6a; b1b=b6b; b1c = b6c; b1d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b7a; b1b=b7b; b1c = b7c; b1d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b7a; b1b=b7b; b1c = b7c; b1d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b8a; b1b=b8b; b1c = b8c; b1d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b8a; b1b=b8b; b1c = b8c; b1d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==1 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b9a; b1b=b9b; b1c = b9c; b1d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==1){
                int aa;int bb; int cc; int dd;
                aa=b1a; bb = b1b; cc = b1c; dd = b1d;
                b1a=b9a; b1b=b9b; b1c = b9c; b1d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label1.setBounds(b1a,b1b,b1c,b1d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b3a; b2b=b3b; b2c = b3c; b2d=b3d;
                b3a=aa; b3b=bb; b3c=cc; b3d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label3.setBounds(b3a,b3b,b3c,b3d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b3a; b2b=b3b; b2c = b3c; b2d=b3d;
                b3a=aa; b3b=bb; b3c=cc; b3d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label3.setBounds(b3a,b3b,b3c,b3d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b4a; b2b=b4b; b2c = b4c; b2d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b4a; b2b=b4b; b2c = b4c; b2d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b5a; b2b=b5b; b2c = b5c; b2d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b5a; b2b=b5b; b2c = b5c; b2d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b6a; b2b=b6b; b2c = b6c; b2d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b6a; b2b=b6b; b2c = b6c; b2d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b7a; b2b=b7b; b2c = b7c; b2d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b7a; b2b=b7b; b2c = b7c; b2d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b8a; b2b=b8b; b2c = b8c; b2d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==2){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b8a; b2b=b8b; b2c = b8c; b2d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==2 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b2a; bb = b2b; cc = b2c; dd = b2d;
                b2a=b9a; b2b=b9b; b2c = b9c; b2d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label2.setBounds(b2a,b2b,b2c,b2d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b4a; b3b=b4b; b3c = b4c; b3d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b4a; b3b=b4b; b3c = b4c; b3d=b4d;
                b4a=aa; b4b=bb; b4c=cc; b4d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label4.setBounds(b4a,b4b,b4c,b4d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b5a; b3b=b5b; b3c = b5c; b3d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b5a; b3b=b5b; b3c = b5c; b3d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b6a; b3b=b6b; b3c = b6c; b3d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b6a; b3b=b6b; b3c = b6c; b3d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b7a; b3b=b7b; b3c = b7c; b3d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b7a; b3b=b7b; b3c = b7c; b3d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b8a; b3b=b8b; b3c = b8c; b3d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b8a; b3b=b8b; b3c = b8c; b3d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==3 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b9a; b3b=b9b; b3c = b9c; b3d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==3){
                int aa;int bb; int cc; int dd;
                aa=b3a; bb = b3b; cc = b3c; dd = b3d;
                b3a=b9a; b3b=b9b; b3c = b9c; b3d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label3.setBounds(b3a,b3b,b3c,b3d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b5a; b4b=b5b; b4c = b5c; b4d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b5a; b4b=b5b; b4c = b5c; b4d=b5d;
                b5a=aa; b5b=bb; b5c=cc; b5d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label5.setBounds(b5a,b5b,b5c,b5d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b6a; b4b=b6b; b4c = b6c; b4d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b6a; b4b=b6b; b4c = b6c; b4d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b7a; b4b=b7b; b4c = b7c; b4d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b7a; b4b=b7b; b4c = b7c; b4d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b8a; b4b=b8b; b4c = b8c; b4d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b8a; b4b=b8b; b4c = b8c; b4d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==4 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b9a; b4b=b9b; b4c = b9c; b4d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==4){
                int aa;int bb; int cc; int dd;
                aa=b4a; bb = b4b; cc = b4c; dd = b4d;
                b4a=b9a; b4b=b9b; b4c = b9c; b4d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label4.setBounds(b4a,b4b,b4c,b4d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b6a; b5b=b6b; b5c = b6c; b5d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b6a; b5b=b6b; b5c = b6c; b5d=b6d;
                b6a=aa; b6b=bb; b6c=cc; b6d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label6.setBounds(b6a,b6b,b6c,b6d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b7a; b5b=b7b; b5c = b7c; b5d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b7a; b5b=b7b; b5c = b7c; b5d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b8a; b5b=b8b; b5c = b8c; b5d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b8a; b5b=b8b; b5c = b8c; b5d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==5 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b9a; b5b=b9b; b5c = b9c; b5d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==5){
                int aa;int bb; int cc; int dd;
                aa=b5a; bb = b5b; cc = b5c; dd = b5d;
                b5a=b9a; b5b=b9b; b5c = b9c; b5d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label5.setBounds(b5a,b5b,b5c,b5d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b7a; b6b=b7b; b6c = b7c; b6d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b7a; b6b=b7b; b6c = b7c; b6d=b7d;
                b7a=aa; b7b=bb; b7c=cc; b7d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label7.setBounds(b7a,b7b,b7c,b7d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b8a; b6b=b8b; b6c = b8c; b6d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b8a; b6b=b8b; b6c = b8c; b6d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==6 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b9a; b6b=b9b; b6c = b9c; b6d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==6){
                int aa;int bb; int cc; int dd;
                aa=b6a; bb = b6b; cc = b6c; dd = b6d;
                b6a=b9a; b6b=b9b; b6c = b9c; b6d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label6.setBounds(b6a,b6b,b6c,b6d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set6.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b7a; bb = b7b; cc = b7c; dd = b7d;
                b7a=b8a; b7b=b8b; b7c = b8c; b7d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label7.setBounds(b7a,b7b,b7c,b7d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set8.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==7){
                int aa;int bb; int cc; int dd;
                aa=b7a; bb = b7b; cc = b7c; dd = b7d;
                b7a=b8a; b7b=b8b; b7c = b8c; b7d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label7.setBounds(b7a,b7b,b7c,b7d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set8.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==7 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b7a; bb = b7b; cc = b7c; dd = b7d;
                b7a=b9a; b7b=b9b; b7c = b9c; b7d=b9d;
                b9a=aa; b9b=bb; b9c=cc; b9d = dd;

                label7.setBounds(b7a,b7b,b7c,b7d);
                label9.setBounds(b9a,b9b,b9c,b9d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set8.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==8 && b==9){
                int aa;int bb; int cc; int dd;
                aa=b9a; bb = b9b; cc = b9c; dd = b9d;
                b9a=b8a; b9b=b8b; b9c = b8c; b9d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label9.setBounds(b9a,b9b,b9c,b9d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set8.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            else if (a==9 && b==8){
                int aa;int bb; int cc; int dd;
                aa=b9a; bb = b9b; cc = b9c; dd = b9d;
                b9a=b8a; b9b=b8b; b9c = b8c; b9d=b8d;
                b8a=aa; b8b=bb; b8c=cc; b8d = dd;

                label9.setBounds(b9a,b9b,b9c,b9d);
                label8.setBounds(b8a,b8b,b8c,b8d);

                set1.setEditable(true);
                set2.setEditable(true);
                set3.setEditable(true);
                set4.setEditable(true);
                set5.setEditable(true);
                set8.setEditable(true);
                set7.setEditable(true);
                set8.setEditable(true);
            }
            greenlight.setBackground(Color.red);
            redlight.setBackground(Color.red);

            if (b1a==0 && b1b==0 && b1c==88 && b1d==100 && b2a==88 && b2b==0 && b2c==88 && b2d==100 && b3a==176 && b3b==0 && b3c==88 && b3d==100 && b4a==0 && b4b==100 && b4c==88 && b4d==100 && b5a==88 && b5b==100 && b5c==88 && b5d==100 && b6a==176 && b6b==100 && b6c==88 && b6d==100 && b7a==0 && b7b==200 && b7c==88 && b7d==100 && b8a==88 && b8b==200 && b8c==88 && b8d==100 && b9a==176 && b9b==200 && b9c==88 && b9d==100){
                System.out.println("bolaga");
                JOptionPane.showMessageDialog(null, "Bolaga! nabuo mona mundo ko, hahahahaha");
                System.exit(0);
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Apple");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Grape");
        if(e.getSource()==label1){
            if(set1.isEditable()==true){
                set1.setText(b1a+"");
                set2.setText(b1b+"");
                set3.setText(b1c+"");
                set4.setText(b1d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a = 1;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b1a+"");
                set6.setText(b1b+"");
                set7.setText(b1c+"");
                set8.setText(b1d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=1;
                greenlight.setBackground(Color.green);


            }
        }
        else if(e.getSource()==label2){
            if(set1.isEditable()==true){
                set1.setText(b2a+"");
                set2.setText(b2b+"");
                set3.setText(b2c+"");
                set4.setText(b2d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=2;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b2a+"");
                set6.setText(b2b+"");
                set7.setText(b2c+"");
                set8.setText(b2d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=2;
                greenlight.setBackground(Color.green);

            }

        }
        else if(e.getSource()==label3){
            if(set1.isEditable()==true){
                set1.setText(b3a+"");
                set2.setText(b3b+"");
                set3.setText(b3c+"");
                set4.setText(b3d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=3;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b3a+"");
                set6.setText(b3b+"");
                set7.setText(b3c+"");
                set8.setText(b3d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=3;
                greenlight.setBackground(Color.green);

            }

        }
        else if(e.getSource()==label4){
            if(set1.isEditable()==true){
                set1.setText(b4a+"");
                set2.setText(b4b+"");
                set3.setText(b4c+"");
                set4.setText(b4d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=4;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b4a+"");
                set6.setText(b4b+"");
                set7.setText(b4c+"");
                set8.setText(b4d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=4;
                greenlight.setBackground(Color.green);

            }
        }
        else if(e.getSource()==label5){
            if(set1.isEditable()==true){
                set1.setText(b5a+"");
                set2.setText(b5b+"");
                set3.setText(b5c+"");
                set4.setText(b5d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=5;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b5a+"");
                set6.setText(b5b+"");
                set7.setText(b5c+"");
                set8.setText(b5d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=5;
                greenlight.setBackground(Color.green);

            }
        }
        else if(e.getSource()==label6){
            if(set1.isEditable()==true){
                set1.setText(b6a+"");
                set2.setText(b6b+"");
                set3.setText(b6c+"");
                set4.setText(b6d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=6;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b6a+"");
                set6.setText(b6b+"");
                set7.setText(b6c+"");
                set8.setText(b6d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=6;
                greenlight.setBackground(Color.green);

            }
        }
        else if(e.getSource()==label7){
            if(set1.isEditable()==true){
                set1.setText(b7a+"");
                set2.setText(b7b+"");
                set3.setText(b7c+"");
                set4.setText(b7d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=7;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b7a+"");
                set6.setText(b7b+"");
                set7.setText(b7c+"");
                set8.setText(b7d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=7;
                greenlight.setBackground(Color.green);

            }

        }
        else if(e.getSource()==label8){
            if(set1.isEditable()==true){
                set1.setText(b8a+"");
                set2.setText(b8b+"");
                set3.setText(b8c+"");
                set4.setText(b8d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=8;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b8a+"");
                set6.setText(b8b+"");
                set7.setText(b8c+"");
                set8.setText(b8d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=8;
                greenlight.setBackground(Color.green);

            }
        }
        else if(e.getSource()==label9){
            if(set1.isEditable()==true){
                set1.setText(b9a+"");
                set2.setText(b9b+"");
                set3.setText(b9c+"");
                set4.setText(b9d+"");

                set1.setEditable(false);
                set2.setEditable(false);
                set3.setEditable(false);
                set4.setEditable(false);

                a=9;
                redlight.setBackground(Color.green);

            }
            else if(set1.isEditable()==false){
                set5.setText(b9a+"");
                set6.setText(b9b+"");
                set7.setText(b9c+"");
                set8.setText(b9d+"");

                set5.setEditable(false);
                set6.setEditable(false);
                set7.setEditable(false);
                set8.setEditable(false);

                b=9;
                greenlight.setBackground(Color.green);

            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Ror");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Ming ming");
    }

}