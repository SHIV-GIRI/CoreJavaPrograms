package Arrray_Programs;
import java.util.Scanner;

public class StackDemo {
    static int top=-1,size=5;
    static int stack[] = new int [size];
    static void menu() {
		String result = " Stack Operatin \n";
		result += " 1.Push Operatin \n";
		result += " 2.Pop Operatin \n";
		result += " 3.Disply Operatin \n";
		result += " 4.Exit\n";
		System.out.println(result);
	} // menu method is closing
	
    static  boolean isfull() {
        boolean b= false;
        if (top==size-1) {
            b=true;
        }
        return b;
    }
    static  boolean isempty() {
        boolean b= false;
        if (top==-1) {
            b=true;
        }
        return b;
    }
    static void push(int element) {
        if (!isfull()) {
            stack[++top]=element;
            System.out.println("you have Enter Number is added");
        }
        else {
            System.out.println("stack is full");
        }
    }  
    static void pop() {
        if (!isempty()) {
            System.out.println("deleted element is="+stack[top]);
            top--;
        }
        else {
            System.out.println("stack is empty");
        }
    }
    static void display( ) {
        if (!isempty()) {
            System.out.println("stack element are as follows");
            for (int i = 0; i < top; i++) {
                System.out.println(stack[i]);   
            } 
        }
    }
    static void exit() {
        System.out.println(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter any number");
                push(sc.nextInt());   
                break;
            case 2:
                pop();
                break;
            case 3:
                display();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("invalid number");
            }// switch closing 	
		}  // while closing
	
	}// main method is closing

} // class closing
