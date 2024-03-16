package controller;

public class ThreadId extends Thread{
    @Override
    public void run() {
        int threadId = (int) this.getId();
        System.out.println("TID: #" + threadId);
    }

}
