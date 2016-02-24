/*


public interface Observer {
	public void update(String str);
}
public class ConcreteObserver1 implements Observer {
	public void update(String str){
		System.out.println("手机客户端--->"+str);
	}
}
public class ConcreteObserver2 implements Observer {
	public void update(String str){b
		System.out.println("PC客户端--->"+str);
	}
}


public interface Subject {
	public void addWatcher(Observer watcher);
	public void removeWatcher(Observer watcher);
	public void notifyWatchers(String str);
}
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



*/
public class _main {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver1();
		Observer observer2 = new ConcreteObserver2();
		subject.addWatcher(observer1);
		subject.addWatcher(observer2);
		
		subject.notifyWatchers("有新消息！");
	}
}
