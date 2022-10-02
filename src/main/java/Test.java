import java.util.function.Consumer;

/**
 * 
 * 内置四个基础函数式接口
 * 1.消费型接口：
 * Consumer<T> - void accept(T t)
 * 2.供给型接口：
 *  Supplier<T> - T get()
 *  3.函数型结构：
 *  Function<T,R> - R apply(T t)
 *  4.断言型接口  断定型接口
 * Predicate<T> - boolean test(T t)
 */
public class Test {
    public static void bath(double money, Consumer<Double> sm){
        sm.accept(money);
    }

    //这是main方法，程序的入口
    public static void main(String[] args) {
        /*bath(2990, new Consumer<Double>() {
            public void accept(Double money) {
                System.out.println("我去洗澡了，来了个波西米亚套餐,花了" + money + "元");
            }
        });*/
        bath(2990,x -> System.out.println("我去洗澡了，来了个波西米亚套餐,花了" + x + "元"));

    }
}

//消费：
/*interface SpendMoney{
    void buy(double money);
}*/
