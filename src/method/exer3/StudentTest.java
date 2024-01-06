package method.exer3;

public class StudentTest {
    public static void main(String[] args) {

        //创建Student[]
        Student[] students = new Student[20];

        //使用循环，给数组赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }
        //打印3年纪学生的信息
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == 3) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }

        //排序前
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }

        System.out.println("****************************");
        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        //排序后
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }

    }
}
