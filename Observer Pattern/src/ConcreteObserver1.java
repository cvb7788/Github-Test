public class ConcreteObserver1 implements Observer {
	public void update(String str){
		System.out.println("手机客户端--->"+str);
	}
}