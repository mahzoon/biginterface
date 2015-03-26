
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class WContent_Format extends WContent
{
	private JTextField textfield_format = new JTextField();;
	private JTextField textfield_dataset = new JTextField();
	private FileChooser browser;
	
	public WContent_Format()
	{
		this.Name = "Format";
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		Component vstrut_1 = Box.createVerticalStrut(20);
		add(vstrut_1);
		
		JPanel panel_dataset = new JPanel();
		panel_dataset.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(panel_dataset);
		panel_dataset.setLayout(new BoxLayout(panel_dataset, BoxLayout.X_AXIS));
		
		JLabel label_dataset = new JLabel("Dataset Location:");
		panel_dataset.add(label_dataset);
		
		Component hstrut_1 = Box.createHorizontalStrut(10);
		panel_dataset.add(hstrut_1);
		
		Component hglue_1 = Box.createHorizontalGlue();
		panel_dataset.add(hglue_1);
		
		textfield_dataset.setColumns(10);
		//textfield_dataset.setMaximumSize(new Dimension(400, 23));
		textfield_dataset.setMinimumSize(new Dimension(100, 23));
		panel_dataset.add(textfield_dataset);
		
		Component hstrut_2 = Box.createHorizontalStrut(5);
		panel_dataset.add(hstrut_2);
		
		JButton button_browse = new JButton("Browse");
		button_browse.setPreferredSize(new Dimension(80, 23));
		button_browse.setMaximumSize(new Dimension(80, 23));
		button_browse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_browse_dataset();
			}
		});
		panel_dataset.add(button_browse);
		
		Component vstrut_2 = Box.createVerticalStrut(20);
		add(vstrut_2);
		
		JPanel panel_format = new JPanel();
		panel_format.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(panel_format);
		panel_format.setLayout(new BoxLayout(panel_format, BoxLayout.X_AXIS));
		
		JLabel label_format = new JLabel("Record Format:");
		panel_format.add(label_format);
		
		Component hstrut_3 = Box.createHorizontalStrut(20);
		panel_format.add(hstrut_3);
		
		Component hglue_2 = Box.createHorizontalGlue();
		panel_format.add(hglue_2);
		
		textfield_format.setColumns(10);
		//textfield_format.setPreferredSize(new Dimension(200, 23));
		textfield_format.setMinimumSize(new Dimension(100, 23));
		panel_format.add(textfield_format);
		
		Component hstrut_4 = Box.createHorizontalStrut(5);
		panel_format.add(hstrut_4);
		
		JButton button_apply = new JButton("Apply");
		button_apply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_apply_format();
			}
		});
		button_apply.setPreferredSize(new Dimension(80, 23));
		button_apply.setMaximumSize(new Dimension(80, 23));
		panel_format.add(button_apply);
		
		Component vstrut_3 = Box.createVerticalStrut(10);
		add(vstrut_3);
		
		JPanel panel_sample = new JPanel();
		panel_sample.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(panel_sample);
		panel_sample.setLayout(new BoxLayout(panel_sample, BoxLayout.Y_AXIS));
		
		JLabel label_sample = new JLabel("The first record looks like this:");
		panel_sample.add(label_sample);
		label_sample.setAlignmentX(Component.LEFT_ALIGNMENT);
		label_sample.setHorizontalAlignment(SwingConstants.LEFT);
		
		Component vstrut_4 = Box.createVerticalStrut(10);
		panel_sample.add(vstrut_4);
		
		JLabel lblbrowseForA = new JLabel("[Browse for a dataset and then press apply]");
		panel_sample.add(lblbrowseForA);
		lblbrowseForA.setAlignmentX(Component.LEFT_ALIGNMENT);
		lblbrowseForA.setHorizontalAlignment(SwingConstants.LEFT);
		
		Component vstrut_5 = Box.createVerticalStrut(170);
		add(vstrut_5);
		
		browser = new FileChooser();
		browser.result = this.textfield_dataset;
	}
	
	private void do_browse_dataset()
	{
		this.browser.setVisible(true);
	}
	
	private void do_apply_format()
	{
		
	}
}
