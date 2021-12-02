import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controller implements ActionListener
{
	private AppModel app_model;

	public void setAppModel(AppModel am)
	{
		this.app_model = am;
	}

	public Controller()
	{
		this.app_model = null;
	}

	public void actionPerformed(ActionEvent evt)
	{
		JButton button = (JButton)evt.getSource();
		String name = button.getName();
		if (name.equals("start")) {
			this.app_model.startCounting();
		}
		else {
			if (name.equals("stop")) {
				this.app_model.stopCounting();
			}
		}
	}
}