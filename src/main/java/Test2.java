import java.util.function.BiPredicate;

/**
 * 方法引用：恶心
 *
 * 三种使用情况：
 * 1. 对象::实例方法名 （非静态方法）
 * 2. 类::静态方法名
 * 3. 类::实例方法名
 *
 */
public class Test2 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        //1.对象::实例方法名
        //消费型接口：
        /*Consumer<String> con = x -> System.out.println("明哥又去" + x +"洗澡了");
        con.accept("长沙");*/
        /*
        Consumer : 方法 ： void accept(T t);
        方法体中用的方法： void println(String x)
        如果你满足上面的要求：前面的函数式接口的  参数 和 返回值
         和
         具体的方法体实现中的 方法的 参数和返回值  如果 一致  那么可以使用  方法引用
         */
       /* PrintStream ps = System.out;
        Consumer<String> con2 = ps::println;
        con2.accept("明哥洗澡去了。。。。。。");*/

       //2.类::静态方法名
        /*Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        System.out.println(com.compare(12, 80));*/
        /*
        int compare(T o1, T o2);
        int compare(int x, int y)
         */
       /* Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12, 80));*/
       ///3. 类::实例方法名
        //使用这个方法引用的前提：x作为方法的调用者，y作为方法的实际参数
        BiPredicate<String,String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("abc", "abc"));
        BiPredicate<String,String> bp2 = String::equals;
        System.out.println(bp2.test("def", "def"));
    }
}
