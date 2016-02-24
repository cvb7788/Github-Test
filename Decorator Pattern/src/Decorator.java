public class Decorator implements Component{
    private Component component;
    
    public Decorator(Component c){
        this.component = c;//存储了上一个版本的component
    }

    public void f() {
        component.f();
    }
    
}