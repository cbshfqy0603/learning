package test11;

public class Test1 {
    public static void main(String[] args) {
        /*
        定义一个长度为3的数组，数组存储1-3名学生对象作为原始数据，学生对象的学号，姓名各不相同
        学生的属性：学号，姓名，年龄
        要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        要求2：添加完毕后，遍历所有学生的信息
        要求3：通过id删除学生信息
              如果存在，则删除，如果不存在，则提示删除失败
        要求4：删除完毕后，遍历所有学生的信息
        要求5：查询数组id为"heima002"的学生，如果存在，则将他的年龄+1岁
         */
        //创建一个数组用于存储学生信息
        Student[] arr = new Student[3];
        //定义1~3名学生对象
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 18);
        Student stu3 = new Student(3, "王五", 18);
        //把已经定义的学生对象存储到数组之中
        arr[0] = stu1;
        arr[1] = stu2;
        //arr[2] = stu3;
        //再次定义一个学生对象
        Student stu4 = new Student(4, "李四", 19);
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断
        //要求2：添加完毕后，遍历所有学生的信息
        //唯一性判断：
        //学生id已经存在---不需要进行添加操作
        //学生id不存在---需要进行添加操作
        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //进行唯一性判断 id重复无需进行添加
            System.out.println("学号重复，请重新修改学号后在进行添加操作");
        } else {
            //添加操作：
            //（1）数组已经存满---定义一个新数组
            //（2）数组没有存满---直接添加即可
            int count = getCount(arr);
            if (count == arr.length) {
                //数组存满
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                //数组并没有存满
                //{stu1, stu2, null} 此时count == 2 而null的索引正好就是count
                arr[count] = stu4;
                printArr(arr);
            }
        }
    }
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                System.out.println("学号为：" + stu.getId() + " " +
                        "姓名为：" + stu.getName() + " " + "年龄为：" + stu.getAge());
            }
        }
    }
    //创建长度为(arr.length + 1)的新数组
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int getCount(Student[] arr) {
        //创建计数器用于存储数组中元素的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                count++;
            }
        }
        return count;
    }
    //我要干什么 --- 唯一性判断
    //为了干成这件事，我需要什么 --- 数组 id
    //调用处是否需要返回结果 --- 需要
    public static boolean contains(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return true;
                }
            }
        }
        return false;
    }
}
