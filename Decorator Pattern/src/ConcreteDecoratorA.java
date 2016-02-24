public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component c) {
        super(c);//存储了上一个版本的component
    }
    public void f() {
    	super.f();//其实是上一个版本的component.f();
		System.out.println("A添加的代码");
    }
}