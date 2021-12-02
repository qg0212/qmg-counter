import java.util.ArrayList;

public class Model
{
	private ArrayList<IView> list;

	public Model()
	{
		this.list = new ArrayList<IView>();
	}

	public void addObserver(IView obs)
	{
		this.list.add(obs);
	}
	public void removeObserver(int k)
	{
		this.list.remove(k);
	}
	public void removeObserver(IView obs)
	{
		this.list.remove(obs);
	}
	public void removeObservers()
	{
		this.list.clear();
	}

	protected void notify(Object[] args)
	{
		for (IView observer : this.list) {
			observer.update(this, args);
		}
	}
}