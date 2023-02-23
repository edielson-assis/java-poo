package application;

import java.util.Scanner;

import entities.Course;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Course course = new Course();

        System.out.print("How many students for course A? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            course.addA(a); 
        }

        System.out.print("How many students for course B? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int b = sc.nextInt();
            course.addB(b); 
        }
        
        System.out.print("How many students for course C? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            course.addC(c); 
        }

        System.out.println(course);

        sc.close();
    }
}