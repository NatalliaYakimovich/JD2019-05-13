package by.it.yakimovich.jd01_04;

import by.it.yakimovich.jd01_03.Helper;
import by.it.yakimovich.jd01_03.InOut;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
       printMulTable();
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        buildOneDimArray(line);

    }
        private static void printMulTable(){

            for (int i = 2; i <10 ; i++) {
                for (int j = 2; j <10 ; j++) {
                    System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
                }
                            }
        }
    private static void buildOneDimArray(String line){
        double[] array= InOut.getArray(line);
        double first=array[0];
        double last=array[array.length-1];
        InOut.printArray(array,"V",5);
        Helper.sort(array);
        InOut.printArray(array,"V",4);

        for (int i = 0; i < array.length; i++) {
            if( array[i]==first){
                System.out.println("Index of first element="+i);
                break;

                    }

    }
        for (int i = 0; i < array.length; i++) {
            if( array[i]==last){
                System.out.println("Index of last element="+i);
                break;
    }}
}}
