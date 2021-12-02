import java.awt.*;
import javax.swing.*;

public class SwingView extends JFrame implements IView
{
	private JLabel a, b, c, d;
	private JButton control;

	public SwingView()
	{
		super();
		this.build();
	}

	private void build()
	{
		this.setTitle("Counter");
		this.setSize(480, 240);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(this.buildContentPane());
		this.setVisible(true);
	}
	private JPanel buildContentPane()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		this.control = new JButton();
		this.control.setText("START");
		this.control.setName("control");
		this.control.setPreferredSize(new Dimension(0, 32));
		panel.add(this.control, BorderLayout.SOUTH);

		JPanel center = new JPanel();
		center.setLayout(new GridLayout(1, 5));
		panel.add(center, BorderLayout.CENTER);

		Font font = new Font("Arial", Font.BOLD, 96);

		this.a = new JLabel();
		this.a.setText("0");
		this.a.setFont(font);
		this.a.setHorizontalAlignment(JLabel.CENTER);
		center.add(this.a);

		this.b = new JLabel();
		this.b.setText("0");
		this.b.setFont(font);
		this.b.setHorizontalAlignment(JLabel.CENTER);
		center.add(this.b);

		JLabel double_dot = new JLabel();
		double_dot.setText(":");
		double_dot.setFont(font);
		double_dot.setHorizontalAlignment(JLabel.CENTER);
		center.add(double_dot);

		this.c = new JLabel();
		this.c.setText("0");
		this.c.setFont(font);
		this.c.setHorizontalAlignment(JLabel.CENTER);
		center.add(this.c);

		this.d = new JLabel();
		this.d.setText("0");
		this.d.setFont(font);
		this.d.setHorizontalAlignment(JLabel.CENTER);
		center.add(this.d);

		return panel;
	}

	public void update(Model m, Object[] args)
	{
		try {
			int n = (Integer)args[0];
			this.update(n);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void update(int count)
	{
		int minutes = count / 60;
		int secondes = count % 60;
		this.a.setText(""+(minutes/10));
		this.b.setText(""+(minutes%10));
		this.c.setText(""+(secondes/10));
		this.d.setText(""+(secondes%10));
	}
}