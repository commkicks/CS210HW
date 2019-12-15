//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW07GUI extends JPanel {
   // generate the GUI
   public HW07GUI(){
      JFrame guiFrame = new JFrame();
   //make sure the program exits when the frame closes
      guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      guiFrame.setTitle("HW 07 excercises");
      guiFrame.setSize(700,400);
   //This will center the JFrame in the middle of the screen
      guiFrame.setLocationRelativeTo(null);
   //Options for the JComboBox
      String[] exerciseOptions = {"Exercise 1","Exercise 2","Exercise 6","Exercise 14","Exercise 18"};
   //The first JPanel contains a Combobox that will allow the user to select the excercise to run
      final JPanel comboPanel = new JPanel();
      JLabel comboLbl = new JLabel("Exercise options:");
      JComboBox exercise = new JComboBox(exerciseOptions);
      comboPanel.add(comboLbl);//adds the label for user clarity
      comboPanel.add(exercise);//adds the drop list
   // buttons
      JButton runBut = new JButton("Run");
      JButton clrBut = new JButton("Clear");

 
   // listen for Run button click
      runBut.addActionListener(
         new ActionListener(){
            //when the run button is clicked run the selected method
            public void actionPerformed(ActionEvent event){
               String value = (String)exercise.getSelectedItem();
               
            }
         });//end of listener for run button
   // listen for clear button click
      clrBut.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent event){
               //clear the "terminal area"
               
            }
         });//end of listener for run button
      guiFrame.add(comboPanel, BorderLayout.NORTH);
      guiFrame.add(runBut);
      guiFrame.add(clrBut);
      guiFrame.pack();
      guiFrame.setVisible(true);
   }
   //start the main methd
   public static void main(String[] args){ 
      new HW07GUI(); 
   }//end of main
}