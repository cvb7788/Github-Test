import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	private List<Observer> list = new ArrayList<Observer>();
	public void addWatcher(Observer watcher) {
		list.add(watcher);
	}
	public void removeWatcher(Observer watcher) {
		list.remove(watcher);
	}
	public void notifyWatchers(String str) {
		for(Observer watcher:list){
			watcher.update(str);
		}
	}
}