package Arrray_Programs;

public class Array_Program_using_Int_Sum_Method {
	    static int[][] sum(int a[][], int b[][]){
	        int c[][]= new int[2][2];
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                 c[i][j]=a[i][j] + b[i][j];   
	            }
	        }
	        return c;    
	    } //// sum method closing
	    static int[][] subtraction(int a[][], int b[][]){
	        int d[][]= new int[2][2];
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < b.length; j++) {
	                 d[i][j]=a[i][j]- b[i][j];
	            }
	        }
	        return d;    
	    } // subtraction method closing
	    public static void main(String[] args) {
	        int a[][]= {{2,9},{4,9}};
	        int b[][]= {{2,6},{4,7}};
	        int sumResult[][] = sum(a,b);
	        int subResult[][] = subtraction(a,b);
	        for (int i = 0; i < sumResult.length; i++) {
	            for (int j = 0; j < sumResult.length; j++) {
	                System.out.print(sumResult[i][j] +" ");
	            } // for closing 
	            System.out.println();   
	        } // for closing
	        int subtractionResult[][]=subtraction(a,b);
	        for (int i = 0; i < subtractionResult.length; i++) {
	            for (int j = 0; j < subtractionResult.length; j++) {
	                System.out.print(subtractionResult[i][j] +" ");
	            } // for closing 
	            System.out.println();
	        } // for closing
	    } // main closing
	    } // class closing