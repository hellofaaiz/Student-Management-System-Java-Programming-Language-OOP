
package student.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfbloodgroup, tffname, tfaddress, tfphone, tfpostcode, tfemail, tfreligion, tfnationality;
    JLabel lblstudentId;
    JButton add, back;
    String studentId;
    
    UpdateStudent(String studentId) {
        this.studentId = studentId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Update Student Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        add(lblname);
        
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
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);
        
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
        
        tfbloodgroup = new JTextField();
        tfbloodgroup.setBounds(600, 300, 150, 30);
        add(tfbloodgroup);
        
        JLabel labelnationality = new JLabel("Nationality");
        labelnationality.setBounds(50, 350, 150, 30);
        labelnationality.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(200, 350, 150, 30);
        add(tfnationality);
        
        JLabel labelpostcode = new JLabel("Post Code");
        labelpostcode.setBounds(400, 350, 150, 30);
        labelpostcode.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelpostcode);
        
        JLabel lblpostcode = new JLabel();
        lblpostcode.setBounds(600, 350, 150, 30);
        add(lblpostcode);
        
        JLabel labelstudentId = new JLabel("Student id");
        labelstudentId.setBounds(50, 400, 150, 30);
        labelstudentId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelstudentId);
        
        lblstudentId = new JLabel();
        lblstudentId.setBounds(200, 400, 150, 30);
        lblstudentId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblstudentId);
        
        try {
            Conn c = new Conn();
            String query = "select * from student where studentId = '"+studentId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfreligion.setText(rs.getString("religion"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfbloodgroup.setText(rs.getString("bloodgroup"));
                lblpostcode.setText(rs.getString("postcode"));
                lblstudentId.setText(rs.getString("studentId"));
                tfnationality.setText(rs.getString("nationality"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("Update Details");
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
            String fname = tffname.getText();
            String religion = tfreligion.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String bloodgroup = tfbloodgroup.getText();
            String nationality = tfnationality.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update student set fname = '"+fname+"', religion = '"+religion+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', bloodgroup = '"+bloodgroup+"', nationality = '"+nationality+"' where studentId = '"+studentId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateStudent("");
    }
}