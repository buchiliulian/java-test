package practice.PTA_11_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入文件路径及文件名：");
        String fileName = scanner.nextLine();
        scanner.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print("您成功打开了一个文件");
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("无法打开文件：" + fileName);
        }
    }
}
