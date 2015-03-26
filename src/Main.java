import java.awt.EventQueue;



public class Main
{
	public static void main(String[] args)
	{
		WContent[] contents = new WContent[2];
		
		WContent_Welcome w1 = new WContent_Welcome();
		contents[0] = w1;
		WContent_Format w2 = new WContent_Format();
		contents[1] = w2;
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow(contents);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
