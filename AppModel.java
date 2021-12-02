public class AppModel extends Model
{
	private int counter;
	private boolean counting;
	private Timer timer;

	public AppModel()
	{
		this.counter = 0;
		this.counting = false;
		this.timer = null;
	}

	public void incrCounter()
	{
		if (this.counting) {
			this.counter++;
			this.notifyObservers();
		}
	}

	public void stopCounting()
	{
		this.counting = false;
		this.timer.kill();
		this.timer = null;
	}
	public void startCounting()
	{
		this.counting = false;
		this.timer = new Timer(this);
		this.timer.start();
	}

	private void notifyObservers()
	{
		Object[] args = {
			this.counting,
			this.counter
		};
		this.notify(args);
	}
}