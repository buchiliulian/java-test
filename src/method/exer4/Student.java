package method.exer4;

public class Student {

    int number;
    int state;
    int score;

    //声明方法，显示学生的属性信息
    public String show(){
        return "number : " + number + ",state : " + state
                + ",score " + score;
    }
}
