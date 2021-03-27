package org.ft.jvm.deadlock;

public class StaticA {

    static {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("org.ft.jvm.deadlock.StaticB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("StaticA init success");
    }

}
