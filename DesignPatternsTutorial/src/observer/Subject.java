package observer;
/******
 * Keeps tracks of the observers and broadcasts update messages
 * to the observers
 * 
 * @author Som
 *
 */
public interface Subject {
	public void register(Observable o);
	public void unRegister(Observable o);
	public void broadcast();
}
