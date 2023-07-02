package BankMangementSystem.src;

import java.awt.Color;
import java.awt.Font;
// import java.util.Random;
// import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener {
    /**
     * 
     * 
     */
    
    JTextField pan,aadhar;
   JButton next;
   
   JRadioButton syes,sno,eyes,eno;
   JComboBox<String> religion,category,occupation,education,income;
   String formno;
    SignupTwo(String formno){
        this.formno= formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);// setBunds only works when "setLayout(null);"
        add(additionalDetails);

        JLabel religionName = new JLabel("Religion:");
        religionName.setFont(new Font("Raleway",Font.BOLD,20));
        religionName.setBounds(100, 140, 100, 30);// setBunds only works when "setLayout(null);"
        add(religionName);
        String valReligon[] = {"Hindu","Muslim", "Sikh","Christian","Other"};
         religion = new JComboBox<>(valReligon);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        
        
        JLabel categoryName = new JLabel("Category:");
        categoryName.setFont(new Font("Raleway",Font.BOLD,20));
        categoryName.setBounds(100, 190, 150, 30);// setBunds only works when "setLayout(null);"
        add(categoryName);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
         category =new JComboBox<>(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway",Font.BOLD,20));
        incomeLabel.setBounds(100, 240, 150, 30);// setBunds only works when "setLayout(null);"
        add(incomeLabel);

        String incomecategory[] = {"null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income =new JComboBox<>(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);



        JLabel educationLabel = new JLabel("Educational:");
        educationLabel.setFont(new Font("Raleway",Font.BOLD,20));
        educationLabel.setBounds(100, 290, 150, 30);// setBunds only works when "setLayout(null);"
        add(educationLabel);
        

        

     

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway",Font.BOLD,20));
        qualificationLabel.setBounds(100, 315, 150, 30);// setBunds only works when "setLayout(null);"
        add(qualificationLabel);
               
        String educationValues[] = {"Non Graduation","Grauate","Post Graduation","Doctrate","Others"};
         education =new JComboBox<>(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        



        JLabel occuptionLabel = new JLabel("Occuption:");
        occuptionLabel.setFont(new Font("Raleway",Font.BOLD,20));
        occuptionLabel.setBounds(100, 390, 150, 30);// setBunds only works when "setLayout(null);"
        add(occuptionLabel);


        String occupationValues[] = {"Salaried","Self Employed","Bussiness","Student","Retired","Others"};
        occupation =new JComboBox<>(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);




        JLabel panLabel = new JLabel("PAN Number:");
        panLabel.setFont(new Font("Raleway",Font.BOLD,20));
        panLabel.setBounds(100, 440, 150, 30);// setBunds only works when "setLayout(null);"
        add(panLabel);


        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel aadharLabel = new JLabel("Aadhar Number:");
        aadharLabel.setFont(new Font("Raleway",Font.BOLD,20));
        aadharLabel.setBounds(100, 490, 150, 30);// setBunds only works when "setLayout(null);"
        add(aadharLabel);
        
         aadhar = new JTextField();
         aadhar.setFont(new Font("Raleway",Font.BOLD,14));
         aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);



        JLabel citizenLabel = new JLabel("Senior Citizen:");
        citizenLabel.setFont(new Font("Raleway",Font.BOLD,20));
        citizenLabel.setBounds(100, 540, 150, 30);// setBunds only works when "setLayout(null);"
        add(citizenLabel);
        

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
 
         sno = new JRadioButton("NO");
         sno.setBounds(450, 540, 100, 30);
         sno.setBackground(Color.WHITE);
        add(sno);

         
 
       ButtonGroup maritalgroup = new ButtonGroup();
       maritalgroup.add(syes);
       maritalgroup.add(sno);
       

        JLabel accountLabel = new JLabel("Existing Account:");
        accountLabel.setFont(new Font("Raleway",Font.BOLD,20));
        accountLabel.setBounds(100, 590, 150, 30);// setBunds only works when "setLayout(null);"
        add(accountLabel);


        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
 
         eno = new JRadioButton("NO");
         eno.setBounds(450, 590, 100, 30);
         eno.setBackground(Color.WHITE);
        add(eno);

         
 
       ButtonGroup emaritalgroup = new ButtonGroup();
       emaritalgroup.add(eyes);
       emaritalgroup.add(eno);
       
       
         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
  
  String formno = "" ;// random is long. in database only string value are inserted
  String sreligion = (String)religion.getSelectedItem();
  String scategory = (String)category.getSelectedItem();
  String sincome =  (String)income.getSelectedItem();
  String seducation = (String)education.getSelectedItem();
  String soccupation = (String)occupation.getSelectedItem();
 String seniorcitizen = null;
 if(syes.isSelected()){
    seniorcitizen  = "Yes";
 }else if(sno.isSelected()){
    seniorcitizen = "NO";
 }

String existingaccount = null;
if(eyes.isSelected()){
    existingaccount = "Yes";
}else if(eno.isSelected()){
    existingaccount= "NO";
}

String span= pan.getText();
String  saadhar = aadhar.getText();



try{

  Conn c = new Conn();
  String  query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
  c.s.executeUpdate(query);
  System.out.println("run2");
  //Signup3 Object
}

catch (Exception e){
System.out.println(e);

}
}

    public static void main(String[] args) {
      new  SignupTwo("");
    }
}
