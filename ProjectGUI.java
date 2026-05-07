import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ProjectGUI extends JFrame {
    
    private JPanel contentPane;

    public ProjectGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

        JTextField t1 = new JTextField();
		t1.setBounds(240, 40, 130, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JTextField t2 = new JTextField();
		t2.setBounds(240, 88, 130, 26);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton b1 = new JButton("Save");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
			}
		});
		b1.setBounds(51, 172, 117, 29);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Cancel");
		b2.setBounds(240, 172, 117, 29);
		contentPane.add(b2);
		
		JLabel title = new JLabel("Title");
		title.setBounds(82, 45, 146, 16);
		contentPane.add(title);
		
		JLabel deadline = new JLabel("Deadline");
		deadline.setBounds(137, 93, 61, 16);
		contentPane.add(deadline);
    }
    
    void save() {
        //call project manager create project
    }
}