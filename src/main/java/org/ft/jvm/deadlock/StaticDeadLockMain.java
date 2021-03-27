package org.ft.jvm.deadlock;


public class StaticDeadLockMain extends Thread {


    private char flag;

    public StaticDeadLockMain(char flag) {
        this.flag = flag;
        this.setName("Thread:" + flag);
    }

    @Override
    public void run() {
        try {
            Class.forName("org.ft.jvm.deadlock.Static" + flag);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " over");
    }

    public static void main(Object[] args) {
        StaticDeadLockMain loadA = new StaticDeadLockMain('A');
        loadA.start();
        StaticDeadLockMain loadB = new StaticDeadLockMain('B');
        loadB.start();
    }
}
