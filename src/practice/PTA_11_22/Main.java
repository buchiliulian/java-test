package practice.PTA_11_22;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //创建ArrayList集合对象list
        ArrayList<Student> list = new ArrayList<Student>();

        //lis集合中添加具有重复元素的数据
        list.add(new Student("张三",23));
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("李四",24));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("王五",25));
        list.add(new Student("王五",25));
        list.add(new Student("王五",25));

        //调用自定义getSingle()方法，去除重复元素，并存储再newList集合中
        ArrayList<Student> newList = getSingle(list);

        //打印newList对象
        System.out.println(newList);
        //输出：[Student [name=张三, age=23], Student [name=李四, age=24], Student [name=王五, age=25]]
    }

    private static ArrayList<Student> getSingle(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<Student>();    //1，创建新集合
        Iterator<Student> it = list.iterator();        //2，根据传入的集合获取迭代器

        while(it.hasNext()) {
            Student stu = it.next();
            if(!newList.contains(stu)) {
                newList.add(stu);
            }

        }
        return newList;
    }

}

class Student{
    //私有化成员变量
    private String name;
    private int age;

    //空参构造方法
    public Student() {
        super();
    }

    //有参构造方法
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    //setXxx()、getXxx()方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString()方法
    @Override
    public String toString() {

        return "Student [name=" + name + ",age=" + age + "]";

    }

    //重写equals()方法
    @Override
    public boolean equals(Object obj) {
        Student stu = (Student)obj;
        return this.name.equals(stu.getName()) && this.age == stu.getAge();
    }
}