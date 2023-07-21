package student.management.system;
	

	import java.awt.*;
	import javax.swing.*;
	import com.toedter.calendar.JDateChooser;
	import java.util.*;
	import java.awt.event.*;
	

	public class AddStudent extends JFrame implements ActionListener{
	    
	    Random ran = new Random();
	    int number = ran.nextInt(999999);
	    
	    JTextField tfname, tffname, tfaddress, tfphone, tfpostcode, tfemail, tfreligion, tfnationality;
	    JDateChooser dcdob;
	    JComboBox cbbloodgroup;
	    JLabel lblstudentId;
	    JButton add, back;
	    
	    AddStudent() {
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JLabel heading = new JLabel("Add Student Details");
	        heading.setBounds(320, 30, 500, 50);
	        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
	        add(heading);
	        
	        JLabel labelname = new JLabel("Name");
	        labelname.setBounds(50, 150, 150, 30);
	        labelname.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelname);
	        
	        tfname = new JTextField();
	        tfname.setBounds(200, 150, 150, 30);
	        add(tfname);
	        
	        JLabel labelfname = new JLabel("Father's Name");
	        labelfname.setBounds(400, 150, 150, 30);
	        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelfname);
	        
	        tffname = new JTextField();
	        tffname.setBounds(600, 150, 150, 30);
	        add(tffname);
	        
	        JLabel labeldob = new JLabel("Date of Birth");
	        labeldob.setBounds(50, 200, 150, 30);
	        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeldob);
	        
	        dcdob = new JDateChooser();
	        dcdob.setBounds(200, 200, 150, 30);
	        add(dcdob);
	        
	        JLabel labelreligion = new JLabel("Religion");
	        labelreligion.setBounds(400, 200, 150, 30);
	        labelreligion.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelreligion);
	        
	        tfreligion = new JTextField();
	        tfreligion.setBounds(600, 200, 150, 30);
	        add(tfreligion);
	        
	        JLabel labeladdress = new JLabel("Address");
	        labeladdress.setBounds(50, 250, 150, 30);
	        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labeladdress);
	        
	        tfaddress = new JTextField();
	        tfaddress.setBounds(200, 250, 150, 30);
	        add(tfaddress);
	        
	        JLabel labelphone = new JLabel("Phone");
	        labelphone.setBounds(400, 250, 150, 30);
	        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelphone);
	        
	        tfphone = new JTextField();
	        tfphone.setBounds(600, 250, 150, 30);
	        add(tfphone);
	        
	        JLabel labelemail = new JLabel("Email");
	        labelemail.setBounds(50, 300, 150, 30);
	        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelemail);
	        
	        tfemail = new JTextField();
	        tfemail.setBounds(200, 300, 150, 30);
	        add(tfemail);
	        
	        JLabel labelbloodgroup = new JLabel("Blood Group");
	        labelbloodgroup.setBounds(400, 300, 150, 30);
	        labelbloodgroup.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelbloodgroup);
	        
	        String courses[] = {"A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-"};
	        cbbloodgroup = new JComboBox(courses);
	        cbbloodgroup.setBackground(Color.WHITE);
	        cbbloodgroup.setBounds(600, 300, 150, 30);
	        add(cbbloodgroup);
	        
	        JLabel labelnationality = new JLabel("Nationality");
	        labelnationality.setBounds(50, 350, 150, 30);
	        labelnationality.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelnationality);
	        
	        tfnationality = new JTextField();
	        tfnationality.setBounds(200, 350, 150, 30);
	        add(tfnationality);
	        
	        JLabel labelaadhar = new JLabel("Post Code");
	        labelaadhar.setBounds(400, 350, 150, 30);
	        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelaadhar);
	        
	        tfpostcode = new JTextField();
	        tfpostcode.setBounds(600, 350, 150, 30);
	        add(tfpostcode);
	        
	        JLabel labelempId = new JLabel("Student id");
	        labelempId.setBounds(50, 400, 150, 30);
	        labelempId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(labelempId);
	        
	        lblstudentId = new JLabel("" + number);
	        lblstudentId.setBounds(200, 400, 150, 30);
	        lblstudentId.setFont(new Font("serif", Font.PLAIN, 20));
	        add(lblstudentId);
	        
	        add = new JButton("Add Details");
	        add.setBounds(250, 550, 150, 40);
	        add.addActionListener(this);
	        add.setBackground(Color.BLACK);
	        add.setForeground(Color.WHITE);
	        add(add);
	        
	        back = new JButton("Back");
	        back.setBounds(450, 550, 150, 40);
	        back.addActionListener(this);
	        back.setBackground(Color.BLACK);
	        back.setForeground(Color.WHITE);
	        add(back);
	        
	        setSize(900, 700);
	        setLocation(300, 50);
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == add) {
	            String name = tfname.getText();
	            String fname = tffname.getText();
	            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
	            String religion = tfreligion.getText();
	            String address = tfaddress.getText();
	            String phone = tfphone.getText();
	            String email = tfemail.getText();
	            String bloodgroup = (String) cbbloodgroup.getSelectedItem();
	            String nationality = tfnationality.getText();
	            String postcode = tfpostcode.getText();
	            String studentId = lblstudentId.getText();
	            
	            try {
	                Conn conn = new Conn();
	                String query = "insert into student values('"+name+"', '"+fname+"', '"+dob+"', '"+religion+"', '"+address+"', '"+phone+"', '"+email+"', '"+bloodgroup+"', '"+nationality+"', '"+postcode+"', '"+studentId+"')";
	                conn.s.executeUpdate(query);
	                JOptionPane.showMessageDialog(null, "Details added successfully");
	                setVisible(false);
	                new Home();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        } else {
	            setVisible(false);
	            new Home();
	        }
	    }
	

	    public static void main(String[] args) {
	        new AddStudent();
	    }
	}
