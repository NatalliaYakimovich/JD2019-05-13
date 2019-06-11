package by.it.orlov.jd01_09;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String expression;
        Parser parser = new Parser();
        Printer printer = new Printer();
        while (!((expression=sc.nextLine()).equals("end"))){
            Var result = parser.calc(expression);
            printer.print(result);
        }
    }
}
