/*
CS210 Assignment TP2 "Team5TP02" 08/NOV/19
TEAM MEMBERS:
Christopher Marvelle, Aaron Davidson, Alex Faull, Huantong Jenny Ji, Quynh (Julie) Duong, and Youssef Ben Taleb.
OBJECTIVE:
Create a program that responds to a user query about the popularity of a name in a given year, with that name's frequency in 
that year; note that the name may be both a female and a male name, so you may need to output information for both. 
*/

// IMPORT SECTION
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
  
public class Team5TP02 extends JFrame 
                        implements ActionListener { 
   // Declare components for GUI
   private JTextField nameField,yearField,totalCountField,fCountField,mCountField; // all JTextFields are now accessable throughout the class  
   JButton runButton,clrButton; // declare the buttons
   JLabel enterNameLabel,enterYearLabel,totalNamesLabel,totalMNamesLabel,totalFNamesLabel;// declare the JLabel
   // create a JFrame called f to act as a GUI  
   JFrame f = new JFrame("Team 5 Project #2");// String affects the windows title
   
   public Team5TP02(){      
      // JTextArea for stating program objective.
      JTextArea textArea = new JTextArea ("OBJECTIVE:\nCreate a program that checks the popularity of a name in a year.");
      textArea.setBounds(20 , 20, 400, 50);
      textArea.setEditable(false);// disables TextArea
      textArea.setBackground(null);// sets the background to match the window
      
      // Labels - setBounds key (X position, y position, x size, y size) 
      // **NOTE: x size for labels will affect character limit**
      int labelYpos = 70;
      enterNameLabel = new JLabel("Enter a name:");
      enterNameLabel.setBounds(50, labelYpos, 150, 20);
      enterYearLabel = new JLabel("Enter Year of Birth (1880-2018):");
      enterYearLabel.setBounds(50, labelYpos + 30, 250, 20);
      totalMNamesLabel = new JLabel("Total registered males found:");
      totalMNamesLabel.setBounds(50, labelYpos + 60, 250, 20);
      totalFNamesLabel = new JLabel("Total registered females found:");
      totalFNamesLabel.setBounds(50, labelYpos + 90, 250, 20);
      totalNamesLabel = new JLabel("Total names found:");
      totalNamesLabel.setBounds(50, labelYpos + 120, 150, 20);
      // END OF LABELS
      
      // Fields - setBounds key (X position, y position, x size, y size)       
      // input field for name to search  
      nameField = new JTextField("");  
      nameField.setBounds(300, labelYpos, 100, 20);
      // input field for the year
      yearField = new JTextField("");  
      yearField.setBounds(300, labelYpos + 30, 100, 20);
      // output field with input disabled 
      mCountField=new JTextField();  
      mCountField.setBounds(300, labelYpos + 60, 100, 20);  
      mCountField.setEditable(false);
      // output field with input disabled 
      fCountField=new JTextField();  
      fCountField.setBounds(300, labelYpos + 90, 100, 20);  
      fCountField.setEditable(false); 
      // output field with input disabled 
      totalCountField=new JTextField();  
      totalCountField.setBounds(300, labelYpos + 120, 100, 20);  
      totalCountField.setEditable(false); 
      // END OF FIELDS
      
      int ButtonX = 225;
      // Buttons - setBounds key (X position, y position, x size, y size) - keep the button size and y pos shared
      runButton=new JButton("Run");  
      runButton.setBounds( ButtonX, 230, 80, 40);  
      clrButton=new JButton("Clear");  
      clrButton.setBounds( ButtonX + 90, 230, 80, 40);
      // Assigns the actions of the buttons to actionPerfromed()  
      runButton.addActionListener(this);  
      clrButton.addActionListener(this);
      
      // JFrame settings
      // .add will add the previously created components to the Jframe, making them visible in the GUI  
      f.add(nameField);f.add(yearField);f.add(totalCountField);f.add(runButton);f.add(clrButton);
      f.add(enterNameLabel);f.add(enterYearLabel);f.add(totalNamesLabel);f.add(textArea);
      f.add(fCountField);f.add(mCountField);f.add(totalFNamesLabel);f.add(totalMNamesLabel);  
      f.setSize(425, 320); // Sets the default window size
      f.setResizable(false); // Prevents USER manipulation of size
      f.setLayout(null);      
      f.setLocationRelativeTo(null);// sets the starting location of the window to be centered
      f.setVisible(true);// Makes the Jframe Visible
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminates the program when window is closed. 
   }//end Team5TP02 
              
   public void actionPerformed(ActionEvent e) { 
      // if the runButton is clicked then:       
      if(e.getSource() == runButton){
         // collect the inputs from the text fields
         if(yearField.getText().matches("") || nameField.getText().matches("")){
           //do nothing if test is blamk. prevents wasted computations
         // Verify that the year textfield holds valid information. if not then generate a warning
         }else if (!yearField.getText().matches("[0-9]+")
                   || Integer.parseInt(yearField.getText()) > 2018 
                   || Integer.parseInt(yearField.getText()) < 1880) {
            
            JOptionPane.showMessageDialog(f,// assign to frame
                                          "Please enter a year between 1880 and 2018.", // what will the message be
                                          "Invalid Input", // title of the dialog window
                                          JOptionPane.WARNING_MESSAGE); // declare the type of warning
         }else{
            // take the text from the YOB text field and parse it to a integer
            int year = Integer.parseInt(yearField.getText());
            String name = nameField.getText();
            // Process the data
            nameSearchCatch(year, name);
         }// end of if/else
      // when the clear button is clicked, clear all of the fields    
      }else if(e.getSource() == clrButton){         
         totalCountField.setText(null);mCountField.setText(null);fCountField.setText(null);  
         nameField.setText(null);yearField.setText(null); 
      }//end if/else  
   }//end actionPerfromed 
     
   public void nameSearchCatch(int year, String name) {
      // In place of the "throws", try to run and if it fails then catch the issue.
      try{
         // assign the appropriate file to a Scanner called dataBase and then start processing.
         Scanner dataBase = new Scanner( new File("yob"+year+".txt") );
         int nameCounter = 0;
         int sexFCounter = 0;
         int sexMCounter = 0;
         String male = "M";
         String female = "F";
         do{
         // while the DB has a line, keep looping
         // take each line as is and convert to an array using comas to divide elements
            String[] nameData = dataBase.nextLine().split(","); // sample line: Anna,F,2604
         // if the name matches REGARDLESS OF CASE, begin to colect data
            if (name.equalsIgnoreCase( nameData[0] )) {
               if (female.equalsIgnoreCase(nameData[1])) { 
                  sexFCounter = Integer.parseInt(nameData[2]); // Integer.parseInt() "translates" the string into an Integer
                  nameCounter += sexFCounter;
               }else if ((male.equalsIgnoreCase(nameData[1]))) {
                  sexMCounter = Integer.parseInt(nameData[2]);
                  nameCounter += sexMCounter;
               }
            }
         }while(dataBase.hasNextLine());
      //when the loop is completed, convert the integers back into strings before displaying them in their repective fields
         mCountField.setText(Integer.toString(sexFCounter));
         fCountField.setText(Integer.toString(sexMCounter));
         totalCountField.setText(Integer.toString(nameCounter));                      
      }//end of try
      catch(FileNotFoundException e) { 
         System.out.println("Exception caught in Catch block"); 
      }// end of catch
   }// end of nameSearchCatch   
   
   public static void main(String[] args) {  
      new Team5TP02();  
   }// end main 
}//end program