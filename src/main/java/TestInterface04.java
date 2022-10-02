/**
 * 语法结构3：两个或者两个以上的参数，有返回值
 */
@FunctionalInterface
public interface TestInterface04 {
    int testMethod(int num1,int num2);
}

class Demo03{
    //这是main方法，程序的入口
    public static void main(String[] args) {
        /*TestInterface03 t = (x, y) -> {
            System.out.println("两个或者两个以上的参数，有返回值" + x + "---" + y);
            return 666;
        };*/
        TestInterface04 t = (x,y) -> 666;

        System.out.println(t.testMethod(10, 20));
        /*
        1.多个参数的话，()不可以省略
        2.方法体中有多个逻辑的话，{}也不可以省略
        3.如果方法体中只有一句话，并且这句话是返回值那句的话，{}可以省略，return关键字也可以省略的

        总结：能省则省

        Lambda表达式使用的那个接口 ，有个特点：里面只有一个抽象方法 ----》函数式接口
        通过注解：@FunctionalInterface  来限定函数式接口

         */
    }
}
