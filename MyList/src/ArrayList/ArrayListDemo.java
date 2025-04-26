package ArrayList;

import java.util.ArrayList;
//复习 String的常用方法：length(), charAt(), equals(), equalsIgnoreCase(), substring(), replace()
//复习 StringBuilder的常用方法：append(), reverse(), length()
//复习 StringJoiner的常用方法：add()
//对比 ArrayList的常用方法：add(), remove(), set(), get() and size()
//集合和数组对比；
//（1）长度：数组长度固定，集合的长度可变
//（2）存储类型：数组可以存储基本数据类型和引用数据类型 集合可以存引用数据类型 假如要存储基本数据类型只能通过包装类来存储
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个集合对象
        //泛型：限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        //JDK7后写法：
        //ArrayList<String> list = new ArrayList<>();
        //此时我们创建的是ArrayList的对象，而ArrayList是java写好的一个类
        //这个类在底层中做了一些处理
        //打印对象不是打印的地址值而是集合中存储的数据
        //展示的时候会拿[]把所有数据进行包裹
        //ArrayList成员方法
        //增：boolean add(E e) 添加元素，返回值表示是否添加成功
        //删：boolean remove(E e) 删除指定元素，返回值表示是否删除成功
        //删：E remove(int index) 删除指定索引的元素，返回被删除的元素
        //改：E set(int index, E e) 修改指定索引的元素,返回之前的元素
        //查：E get(int index) 获取指定索引的元素
        //查：int size() 集合的长度，也就是集合中元素的个数
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]
        //增 add()
        boolean result1 = list.add("aaa");
        System.out.println(result1);
//        boolean result2 = list.add("");
//        System.out.println(result2);
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        System.out.println(list);
        //删 remove()
        //1.boolean remove(E e)
        boolean result3 = list.remove("sss");//false
        System.out.println(result3);
        boolean result4 = list.remove("aaa");//ture
        System.out.println(result4);
        System.out.println(list);//[bbb, ccc, aaa]
        //2.E remove(int index)
        String str = list.remove(1);
        System.out.println(list);
        list.add("ddd");
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);//[bbb, aaa, ddd, aaa, bbb]
        //改 set()
        String str1 = list.set(0, "aaa");
        System.out.println(str1);//bbb
        String str2 = list.set(1, "bbb");
        System.out.println(str2);//aaa
        System.out.println(list);
        //查 get() size()
        String str3 = list.get(2);
        System.out.println(str3);
        System.out.println("---------------");
        //arr.fori
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            String str4 = list.get(i);
            System.out.println(str4);
        }
    }
}
