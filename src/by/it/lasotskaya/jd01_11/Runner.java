package by.it.lasotskaya.jd01_11;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
    List<String> mylist=new ListB<>();
    List<String> arlist=new ArrayList<>();

        mylist.add("First"); arlist.add("First");
        mylist.add("Two");   arlist.add("Two");
        mylist.add("Four");  arlist.add("Four");
        arlist.set(2,"NewString");
        System.out.println("mylist:"+mylist+"\narlist:"+arlist);
        mylist.add(2,"Three");  arlist.add(2,"Three");
        mylist.add(0,"Start");  arlist.add(0,"Start");
        System.out.println("mylist:"+mylist+"\narlist:"+arlist);
        mylist.remove("Start");  arlist.remove("Start");
        mylist.remove(3);  arlist.remove(3);
        System.out.println("mylist:"+mylist+"\narlist:"+arlist);
        System.out.println("mylist:"+mylist.get(0)+"\narlist:"+arlist.get(0));


}}
