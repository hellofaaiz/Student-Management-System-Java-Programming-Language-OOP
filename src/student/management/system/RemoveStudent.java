package student.management.system;
	

	import javax.swing.*;
	import java.awt.*;
	import java.sql.*;
	import java.awt.event.*;
	

	public class RemoveStudent extends JFrame implements ActionListener {
	    
	    Choice cStudentId;
	    JButton delete, back;
	    
	    RemoveStudent() {
	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        
	        JLabel labelstudentId = new JLabel("Student Id");
	        labelstudentId.setBounds(50, 50, 100, 30);
	        add(labelstudentId);
	        
	        cStudentId = new Choice();
	        cStudentId.setBounds(200, 50, 150, 30);
	        add(cStudentId);
	        
	        try {
	            Conn c = new Conn();
	            String query = "select * from student";
	            ResultSet rs = c.s.executeQuery(query);
	            while(rs.next()) {
	                cStudentId.add(rs.getString("studentId"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        JLabel labelname = new JLabel("Name");
	        labelname.setBounds(50, 100, 100, 30);
	        add(labelname);
	        
	        JLabel lblname = new JLabel();
	        lblname.setBounds(200, 100, 100, 30);
	        add(lblname);
	        
	        JLabel labelphone = new JLabel("Phone");
	        labelphone.setBounds(50, 150, 100, 30);
	        add(labelphone);
	        
	        JLabel lblphone = new JLabel();
	        lblphone.setBounds(200, 150, 100, 30);
	        add(lblphone);
	        
	        JLabel labelemail = new JLabel("Email");
	        labelemail.setBounds(50, 200, 100, 30);
	        add(labelemail);
	        
	        JLabel lblemail = new JLabel();
	        lblemail.setBounds(200, 200, 100, 30);
	        add(lblemail);
	        
	        try {
	            Conn c = new Conn();
	            String query = "select * from student where studentId = '"+cStudentId.getSelectedItem()+"'";
	            ResultSet rs = c.s.executeQuery(query);
	            while(rs.next()) {
	                lblname.setText(rs.getString("name"));
	                lblphone.setText(rs.getString("phone"));
	                lblemail.setText(rs.getString("email"));
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        cStudentId.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent ie) {
	                try {
	                    Conn c = new Conn();
	                    String query = "select * from student where studentId = '"+cStudentId.getSelectedItem()+"'";
	                    ResultSet rs = c.s.executeQuery(query);
	                    while(rs.next()) {
	                        lblname.setText(rs.getString("name"));
	                        lblphone.setText(rs.getString("phone"));
	                        lblemail.setText(rs.getString("email"));
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        
	        delete = new JButton("Delete");
	        delete.setBounds(80, 300, 100,30);
	        delete.setBackground(Color.BLACK);
	        delete.setForeground(Color.WHITE);
	        delete.addActionListener(this);
	        add(delete);
	        
	        back = new JButton("Back");
	        back.setBounds(220, 300, 100,30);
	        back.setBackground(Color.BLACK);
	        back.setForeground(Color.WHITE);
	        back.addActionListener(this);
	        add(back);
	        
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(350, 0, 600, 400);
	        add(image);
	        
	        setSize(1000, 400);
	        setLocation(300, 150);
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent ae) {
	        if (ae.getSource() == delete) {
	            try {
	                Conn c = new Conn();
	                String query = "delete from student where studentId = '"+cStudentId.getSelectedItem()+"'";
	                c.s.executeUpdate(query);
	                JOptionPane.showMessageDialog(null, "Student Information Deleted Sucessfully");
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
	        new RemoveStudent();
	    }
	}
