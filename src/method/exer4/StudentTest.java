package method.exer4;

public class StudentTest {
    public static void main(String[] args) {

        //创建Student[]
        Student[] students = new Student[20];

        //使用循环，给数组赋值
        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int)(Math.random() * 6 + 1);
            students[i].score = (int)(Math.random() * 101);
        }
        //打印3年纪学生的信息
        StudentUtil util = new StudentUtil();
        util.printStudentsWithState(students,3);


        //排序前
        util.printStudents(students);

        System.out.println("****************************");

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
//        util.sortStudents(students);
        util.sortStudents(students,"asc");

        //排序后
        util.printStudents(students);

    }
}
