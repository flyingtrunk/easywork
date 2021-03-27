package org.ft.jvm.classload;


public class PrintStringClassLoader {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
    }

}
