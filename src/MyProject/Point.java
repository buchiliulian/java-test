package MyProject;

public class Point {
    private int x;
    private int y;
    public Point(){}
    public Point(int x,int y){this.x=x;this.y=y;}
    public String toString(){
        return "x="+x+",y="+y;
    }
    public static void main(String[] args){
        Point p = new Point(10,20);
        System.out.println(p);

    }
}

