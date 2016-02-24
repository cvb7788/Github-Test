/*


public interface Component {
    public void f();
}
public class ConcreteComponent implements Component {
	public void f() {
		System.out.println("我是人");
	}
}


public class Decorator implements Component{
    private Component component;
    
    public Decorator(Component c){
        this.component = c;//存储了上一个版本的component
    }

    public void f() {
        component.f();
    }
    
}
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component c) {
        super(c);//存储了上一个版本的component
    }
    public void f() {
    	super.f();//其实是上一个版本的component.f();
		System.out.println("A添加的代码");
    }
}
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component c) {
        super(c);//存储了上一个版本的component
    }
    public void f() {
    	super.f();//其实是上一个版本的component.f();
		System.out.println("B添加的代码");
    }
}


*/
public class _main {
	public static void main(String[] args) {
		Component component=new ConcreteComponent();
		component=new ConcreteDecoratorA(component);//这时候,最左边的component存储了上一个版本的component
		component=new ConcreteDecoratorB(component);//这时候,最左边的component存储了上一个版本的component
		component=new ConcreteDecoratorA(component);//这时候,最左边的component存储了上一个版本的component
		component.f();
	}
}
