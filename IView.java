public interface IView
{
	public abstract void update(Model m, Object[] args);
	public abstract void setController(Controller c);
}