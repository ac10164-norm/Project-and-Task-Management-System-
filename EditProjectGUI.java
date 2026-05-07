import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.border.*;

public class EditProjectGUI extends JFrame {
    
    private JPanel contentPane;

    public EditProjectGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        JTextField t1 = new JTextField();
			t1.setBounds(240, 20, 130, 26);
			contentPane.add(t1);
			t1.setColumns(10);
			
			JTextField t2 = new JTextField();
			t2.setBounds(240, 68, 130, 26);
			contentPane.add(t2);
			t2.setColumns(10);

			JTextField t3 = new JTextField();
			t1.setBounds(240, 116, 130, 26);
			contentPane.add(t3);
			t1.setColumns(10);
			
			JButton b1 = new JButton("Save");
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String input1 = t1.getText();
					String input2 = t2.getText();
					String input3 = t3.getText();
					edit(input1, input2, input3);
				}
			});
			b1.setBounds(51, 172, 117, 29);
			contentPane.add(b1);

			JButton b2 = new JButton("Add/Edit Tasks");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			b2.setBounds(145, 172, 117, 29);
			contentPane.add(b2);
			
			JButton b3 = new JButton("Cancel");
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			b3.setBounds(240, 172, 117, 29);
			contentPane.add(b3);
			
			JLabel title = new JLabel("Title");
			title.setBounds(137, 25, 61, 16);
			contentPane.add(title);
			
			JLabel deadline = new JLabel("Deadline");
			deadline.setBounds(137, 73, 61, 16);
			contentPane.add(deadline);

			JLabel description = new JLabel("Description");
			title.setBounds(137, 121, 61, 16);
			contentPane.add(description);
    }

    void edit(String input1, String input2, String input3) {
        
    }
}


