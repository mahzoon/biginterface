import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class FileChooser extends JFrame {

	private JPanel contentPane;
	private JFileChooser browser;
	public JTextField result;

	public FileChooser()
	{
		this.setTitle("Select The File:");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		browser = new JFileChooser();
		browser.setApproveButtonText("Open");
		browser.rescanCurrentDirectory();
		browser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_dataset(evt);
            }
        });
		contentPane.add(browser);
	}
	
	private void select_dataset(java.awt.event.ActionEvent evt)
	{
		String FilePath;
        if (evt.getActionCommand().equals("ApproveSelection"))
        {
            FilePath = browser.getSelectedFile().getPath();
            this.result.setText(FilePath);
        }
        this.setVisible(false);
	}

}
