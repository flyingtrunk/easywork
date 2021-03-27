package org.ft.jvm.deadlock;

public class StaticB {

    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("org.ft.jvm.deadlock.StaticA");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("StaticB init success");
    }

}
