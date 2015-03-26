import java.awt.BorderLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JPanel panel_names = new JPanel();
	private JLabel[] content_names;
	private JLabel content_name;
	private WContent[] contents;
	private JPanel panel_content = new JPanel();
	
	// status controls
	private int current_index = -1;
	private JButton button_back = new JButton("< Back");
	private JLabel label_status = new JLabel("[status]");
	private JButton button_next = new JButton("Next >");
	
	public MainWindow(WContent[] wcontents)
	{
		InitComponents();
		this.contents = wcontents;
		content_names = new JLabel[wcontents.length];
		for (int count=0;count<wcontents.length;count++)
		{
			content_names[count] = new JLabel(wcontents[count].Name);
			//panel_names.add(content_names[count]);
			content_names[count].setHorizontalAlignment(SwingConstants.LEFT);
		}
		content_name = new JLabel("");
		content_name.setHorizontalAlignment(SwingConstants.LEFT);
		content_name.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		panel_names.add(content_name);
		
		do_next();
	}
	
	public MainWindow()
	{
		InitComponents();
	}

	private void InitComponents()
	{
		this.setTitle("BigInterface");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		panel_names.setBorder(null);
		
		contentPane.add(panel_names, BorderLayout.NORTH);
		panel_names.setLayout(new BorderLayout(0, 0));
		panel_names.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
		
		JPanel panel_status = new JPanel();
		contentPane.add(panel_status, BorderLayout.SOUTH);
		panel_status.setLayout(new BorderLayout(0, 0));
		panel_status.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
		
		button_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_back();
			}
		});
		button_back.setMargin(new Insets(0,-10,0,-10));
		panel_status.add(button_back, BorderLayout.WEST);
		button_back.setEnabled(false);
		
		label_status.setHorizontalAlignment(SwingConstants.CENTER);
		panel_status.add(label_status, BorderLayout.CENTER);
		button_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_next();
			}
		});
		button_next.setMargin(new Insets(0,-10,0,-10));
		panel_status.add(button_next, BorderLayout.EAST);
		
		contentPane.add(panel_content, BorderLayout.CENTER);
		panel_content.setLayout(new BorderLayout(0, 0));
		panel_content.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
	}
	
	public void do_next()
	{
		if (current_index + 1 < contents.length)
		{
			current_index++;
			this.panel_content.removeAll();
			this.panel_content.add(contents[current_index]);
			this.set_current_content_name();
		}
	}
	public void do_back()
	{
		if (current_index - 1 > -1)
		{
			current_index--;
			this.panel_content.removeAll();
			this.panel_content.add(contents[current_index]);
			this.set_current_content_name();
		}
	}
	private void set_current_content_name()
	{
//		for (int counter=0;counter<content_names.length;counter++)
//		{
//			java.awt.Font f = content_names[counter].getFont();
//			if (current_index == counter)
//			{
//				content_names[counter].setFont(f.deriveFont(f.getStyle() | java.awt.Font.BOLD));
//			}
//			else
//			{
//				content_names[counter].setFont(f.deriveFont(f.getStyle() & ~java.awt.Font.BOLD));
//			}
//		}
		this.content_name.setText(contents[current_index].Name);
		this.label_status.setText((current_index + 1) + "/" + contents.length);
		if (current_index + 1 < contents.length)
			this.button_next.setEnabled(true);
		else
			this.button_next.setEnabled(false);
		if (current_index - 1 > -1)
			this.button_back.setEnabled(true);
		else
			this.button_back.setEnabled(false);
		this.panel_content.repaint();
	}
}
