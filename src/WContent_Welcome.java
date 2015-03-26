import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;


public class WContent_Welcome extends WContent
{	
	public WContent_Welcome()
	{
		this.Name = "Welcome!";
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Component strut_1 = Box.createVerticalStrut(50);
		add(strut_1);
		
		JLabel label_title = new JLabel("Welcome to BigInterface");
		label_title.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_title.setHorizontalAlignment(SwingConstants.CENTER);
		label_title.setFont(new Font("Times New Roman", Font.BOLD, 25));
		add(label_title);
		
		Component strut_2 = Box.createVerticalStrut(30);
		add(strut_2);
		
		JLabel label_desc = new JLabel("[desc]");
		label_desc.setAlignmentX(Component.CENTER_ALIGNMENT);
		label_desc.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_desc);
	}
	
	
}
