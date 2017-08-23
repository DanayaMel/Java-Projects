import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class ProjectGUI extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
		public static final int WIDTH = 400;
		public static final int HEIGHT = 150;
		
		private static JTextField tfString;
		private static JTextField fileName;
		private static JTextField tfInt;
		private JLabel jlStatus;
		private JLabel jlStatus2;
		private JButton myButton;
		private JButton myButton2;
		private JButton myButton3;
		private JButton myButton4;
		private JButton myButton5;
		private JButton myButton6;
		private JButton myButton7;
		 
		public ProjectGUI(){
			setSize(700, 250);
			Container container = getContentPane();
			
			JPanel myPanel = new JPanel();
			myPanel.setLayout(new GridLayout(6,3));

			fileName = new JTextField ("Enter file name here.");
			tfString = new JTextField ("Enter numbers in list, seperated by a comma.");
			tfInt = new JTextField ("Enter value to multiply by.");
			jlStatus = new JLabel ("the status");
			jlStatus2 = new JLabel ("waiting to print array...");
			myButton = new JButton("MultiplyValues.");
			myButton2 = new JButton("MergeSort.");
			myButton3 = new JButton("BubbleSort.");
			myButton4 = new JButton("SequentialSearch.");
			myButton5 = new JButton("BinarySearch.");
			myButton6 = new JButton("Clear All Entries.");
			myButton7 = new JButton("Clear everything in file.");
			myButton.addActionListener(this);
			myButton2.addActionListener(this);
			myButton3.addActionListener(this);
			myButton4.addActionListener(this);
			myButton5.addActionListener(this);
			myButton6.addActionListener(this);
			myButton7.addActionListener(this);
			jlStatus.setText("Waiting for command.");
			jlStatus2.setText("gonna print dat array now");
			   
			myPanel.add(jlStatus);
			myPanel.add(jlStatus2);
			myPanel.add(tfString);
			myPanel.add(tfInt);
			myPanel.add(fileName);
			myPanel.add(myButton);
			myPanel.add(myButton);
			myPanel.add(myButton2);
			myPanel.add(myButton3);
			myPanel.add(myButton4);
			myPanel.add(myButton5);
			myPanel.add(myButton6);
			myPanel.add(myButton7);
			container.add(myPanel);	
			
		}
		
	public static void main(String[] args) {
		
		//String fileNameb = fileName.getText();
		JOptionPane.showInputDialog("Please enter your file's name here. \n (This is the file you will be saving/writing to.)");
		
		String [] buttons = { "Cancel", "Yes", "No" };

	    int rc = JOptionPane.showOptionDialog(null, "Are you sure you do not want to enter a file name? \n(program will create 'default' file.)", "Confirmation",
	        JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[2]);

	    System.out.println(rc);
	    
		
		
		
		
		ProjectGUI gui = new ProjectGUI();
		gui.setVisible(true);
		gui.setLocation(500,250);
	}
	
	/*
	public void textArrOption(JTextField tfString) throws BadInputException {
		String textArr = tfString.getText();
	    
	    while (textArr.equals(int.class)){
	        switch(textArr){
	        
	        case "q": System.out.println("Invalid input...");
	                  return;
	        default: System.out.println("Invalid input...");
	                 throw new InvalidInputException();
	        }
	    }
	}*/
	/*
	public static void textCleanUp(JTextField tString) throws BadInputException{
		String textArr = tfString.getText();
		int [] intArr = project.convertsStrArrToIntArr(textArr);
		
		String tfNum = tfInt.getText();
		int num = Integer.parseInt(tfNum);
		
		try
		{
			for (int i=0; i < intArr.length; i++) {
		        intArr[i] = Integer.toString(textArr[i]);
		    }
		}catch(BadInputException object)
		{
		//--------- What will happen when error generate.
		}
		
	}
	*/
	
	
	public static void stringChecker(JTextField tfString, JTextField tfNum){
		int okay = 0;
		try {
		    okay = Integer.parseInt(tfNum.getText());
		    String black = tfString.getText().trim();
		    int [] white = project.convertsStrArrToIntArr(black);

		} catch (NumberFormatException e) {
		    // One of the integer fields failed to parse. Do something to alert the user.
		}
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String actCmd = e.getActionCommand().trim();
		switch(actCmd){
		case "MultiplyValues.":
			jlStatus.setText("Yay! You Clicked!");
			
			
			String blah = project.converter(tfString, tfInt);
			jlStatus2.setText(blah);
			
			
			String fileName2 = fileName.getText();
			technicalStuff.appendTextToFile(fileName2, blah, tfString, tfInt, 0);
			jlStatus.setText("writing is done!");
			break;
			
		case "MergeSort.":
			jlStatus.setText("Yay! You Clicked!");
			
			String blahMS = project.converter2(tfString);
			
			jlStatus2.setText(blahMS);

			
			String fileName3 = fileName.getText();
			technicalStuff.appendTextToFile(fileName3, blahMS, tfString, tfInt, 2);
			jlStatus.setText("writing is done!");
			break;

		case "BubbleSort.":
			jlStatus.setText("Yay! You Clicked!");
			
			String blahBS = project.converter2b(tfString);
			
			jlStatus2.setText(blahBS);
			
			
			String fileName4 = fileName.getText();
			technicalStuff.appendTextToFile(fileName4, blahBS, tfString, tfInt, 2);
			jlStatus.setText("writing is done!");
			
			break;
		
		case "SequentialSearch.":
			jlStatus.setText("Yay! You Clicked!");
			
			String blahSS = project.converter3(tfString, tfInt, -2);
			jlStatus2.setText(blahSS);
			
			
			String fileName5 = fileName.getText();
			technicalStuff.appendTextToFile(fileName5, blahSS, tfString, tfInt, 1);
			jlStatus.setText("writing is done!");
		
			break;
			
		case "BinarySearch.":
			jlStatus.setText("Yay! You Clicked!");
			
			String blahBSch = project.converter4(tfString, tfInt);
			jlStatus2.setText(blahBSch);
			
			
			String fileName6 = fileName.getText();
			technicalStuff.appendTextToFile(fileName6, blahBSch, tfString, tfInt, 1);
			jlStatus.setText("writing is done!");
			
			break; 

		case "Clear All Entries.":
			jlStatus.setText("Yay! You Clicked!");
			
			tfString.setText("");
			tfInt.setText("");
			fileName.setText("");
			
			break; 
		case "Clear everything in file.":
			jlStatus.setText("Yay! You Clicked!");
			
			
			String fileName7 = fileName.getText();
			technicalStuff.clearAllEntries(fileName7);

			
			break; 
			/*
			default:
				add exception for empty input
				add exception for letter
				add exception for foreign input
				add exception for one number
				would you like to try something else? goodbye.
				would you like me to remove bad input?
				would you like me to sort?
				bs - sorting array then print results.
				
			*/
		}
}}