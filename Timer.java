public class Timer extends Thread
{
	private boolean alive;
	private AppModel app_model;

	public Timer(AppModel am)
	{
		super();
		this.setName("timer");
		this.alive = true;
		this.app_model = am;
	}

	public void run()
	{
		while (this.alive) {
			try {
				this.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			if (this.alive) {
				this.app_model.incrCounter();
			}
		}
	}

	public void kill()
	{
		this.alive = false;
	}
}