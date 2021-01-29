import javax.swing.*; //this is to get the swing

import java.awt.event.*; //this enables the events

import java.awt.*; //this is for the swing 

import java.util.ArrayList;// this to to create a list

import java.util.ListIterator;// this allows the computer to read my display my lists
//---------------------------------------------------------------------------------------------------
//         Yashveer Sekhon - Period 5
//                      AP CSA
//---------------------------------------------------------------------------------------------------

public class Main
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame ("Yashveer Sekhon's Swing App");
    System.out.println("Yashveer Sekhon - Swing App");

    frame1.setDefaultCloseOperation
    (JFrame.EXIT_ON_CLOSE);

    frame1.setSize(500,500);// sets shows big the screen is
    frame1.setVisible(true);// if true the screen will show up

    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));// this is were the buttons will 

    //-----------------Label 1-----------------
    JLabel label1 = new JLabel("Welcome!");
    JTextField textfield1 = new JTextField("Type to change", 20);

    //-----------------Label 2-----------------
    JLabel label2 = new JLabel("Hi");
    JTextField textfield2 = new JTextField("Type to change", 20);


    ////-----------------Array List//-----------------
    ArrayList<String> titans = new ArrayList<>();
    titans.add("Titans - Godzilla");
    titans.add("Titans - Kong");
    titans.add("Titans - Mothra");
    titans.add("Titans - Mecha Godzilla");
    titans.add("Titans - Rodan");
    titans.add("Titans - MUTO");


    //-----------------Button 1-----------------
    JButton button1 = new JButton("Submit Text Field 1");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        String s = e.getActionCommand(); 
        if (s.equals("Submit Text Field 1")) 
        { 
          label1.setText(textfield1.getText()); 
          textfield1.setText("  ");
        }
      }    
    });

    //-----------------Button 2-----------------
    JButton button2 = new JButton ("Titans List");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        System.out.println("\nThis is a list of the titans in Godzilla vs Kong ");
        for(int i = 0; i < titans.size(); i++) //to print out the array list
        {
          System.out.println(titans.get(i));
        }
      }
    });

    //-----------------Button 3-----------------
    JButton button3 = new JButton("Submit Text Field 2");

    button3.addActionListener(new ActionListener()
    {
      public void actionPerformed
      (ActionEvent e)
      {
        String s = e.getActionCommand(); 
        if (s.equals("Submit Text Field 2")) 
        { 
          label2.setText(textfield2.getText()); 
          textfield2.setText("  ");
        }
      }    
    });

    panel1.add(button1);    //adds button1 to screen

    panel1.add(button2);    //adds button2 to screen

    panel1.add(button3);    //adds button3 to screen

    panel1.add(label1);     //adds label1 to screen

    panel1.add(label2);     //adds label2 to screen

    panel1.add(textfield1); //adds textfield1 to screen

    panel1.add(textfield2); //adds textfield2 to screen

    //-----------------Panel 2-----------------
    JPanel panel2 = new JPanel (new BorderLayout(55,55));

    //-----------------Image 1-----------------
    ImageIcon titansImg = new ImageIcon ("Godzilla.jpg", "King of Monsters");
    JLabel titansLabelPic = new JLabel (titansImg);
    panel2.add(titansLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, panel2);

  }//end main method
}//end class Main