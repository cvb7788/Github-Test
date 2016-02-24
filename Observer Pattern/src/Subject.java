public interface Subject {
	public void addWatcher(Observer watcher);
	public void removeWatcher(Observer watcher);
	public void notifyWatchers(String str);
}