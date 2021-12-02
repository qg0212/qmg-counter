import javax.swing.UIManager;
import javax.swing.SwingUtilities;

public class Program
{
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
					startApplication(args);
				}
				catch (Exception e) {
					e.printStackTrace();
					System.exit(0);
				}
			}
		});
	}

	private static void startApplication(String[] args)
	{
		IView iv = new SwingView();
	}
}