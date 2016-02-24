public class ConcreteObserver2 implements Observer {
	public void update(String str){
		System.out.println("PC客户端--->"+str);
	}
}