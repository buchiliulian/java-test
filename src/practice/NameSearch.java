package practice;

public class NameSearch {
    public static void main(String[] args) {



        String[] arr = {"Mike", "Tom", "Lisa", "David", "John"};

        if (search(arr, "David") == 1) {
            System.out.println("用户名David存在");
        } else {
            System.out.println("用户名David不存在");
        }

    }



    public static int search(String[] arr, String text) {
        int i = 0;
        for (String s : arr) {
            if (s == text) {
                i = 1;
                break;
            }
        }
        return i;
    }
}
