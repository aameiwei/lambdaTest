/**
 * 1.Lambda表达式  ----- Java万事万物皆对象 ？？？  语法糖 真香
 */
public interface TestInterface01 {
    void testMethod();
}

class MyClass implements TestInterface01{
    @Override
    public void testMethod() {
        System.out.println("我重新实现了testMethod方法。耶！");
    }
}

class Demo{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //创建接口对应的实现类的对象：
        /*TestInterface t = new MyClass();
        t.testMethod();*/
        /*TestInterface t = new TestInterface() {
            @Override
            public void testMethod() {
                System.out.println("我重写了testMethod方法，匿名内部类中的实现");
            }
        };
        t.testMethod();*/

        TestInterface01 t = () -> System.out.println("这个是Lambda表达式的实现方式");
        t.testMethod();

        /*
        总结：
        1.Lambda表达式是一个新的语法结构
        2.语法层面简洁了
        3.先睹为快 -》Lambda表达式的本质就是：接口的实现类的具体的对象
        4.应用场合：复用性没有那么强的时候
        5.语法：
        -> 箭头操作符  Lambda操作符
        ->左侧：  Lambda的形参列表 ---等效于  对应的接口的那个抽象方法的 形参列表
        ->右侧： 其实就是抽象方法的方法体
         */
    }
}
