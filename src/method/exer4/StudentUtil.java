package method.exer4;

public class StudentUtil {
    /*
    * 打印指定年级的学生信息
    * */
    public void printStudentsWithState(Student[] students, int state){
        for (int i = 0; i < students.length; i++){
            if(students[i].state == state){
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    /*
    * 遍历指定学生数组
    * */
    public void printStudents(Student[] students){
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].show());
        }
    }

    /*
    * 使用冒泡排序，按学生成绩排序
    * "asc" 升序 "desc" 降序
    * */
    public void sortStudents(Student[] students){
        for (int i = 0; i < students.length-1; i++){
            for (int j = 0; j < students.length - 1 - i; j++){
                if(students[j].score > students[j+1].score){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
    public void sortStudents(Student[] students,String sortMethod){
        if("asc".equals(sortMethod)){
            for (int i = 0; i < students.length-1; i++){
                for (int j = 0; j < students.length - 1 - i; j++){
                    if(students[j].score > students[j+1].score){
                        swap(students,i,j);
                    }
                }
            }
        }else if("desc".equals(sortMethod)){
            for (int i = 0; i < students.length-1; i++){
                for (int j = 0; j < students.length - 1 - i; j++){
                    if(students[j].score < students[j+1].score){
                        swap(students,i,j);
                    }
                }
            }
        }else {
            System.out.println("你输入的排序方式有误！");
        }

    }

    public void swap(Student[] students,int i,int j){
        Student temp = students[j];
        students[j] = students[j+1];
        students[j+1] = temp;

    }

}
