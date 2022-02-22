package com.company;

public class Lock {
    private boolean isLocked = false;

    public void lock(){
        synchronized(this){
            while(isLocked){
                try{
                    this.wait();
                } catch(InterruptedException e){
                    //do nothing, keep waiting
                }
            }
        }

        synchronized(this){
            isLocked = true;
        }
    }

    public synchronized void unlock(){
        isLocked = false;
        this.notify();
    }

    // Here above code can leads to the slipped conditions because the cange of the condition is done is another
    // Synchronized block so there is chance that two threads enter the block and checks the condition at same time

    // To solve above situation you need to change the isLocked in same synchronization block
    // As below:
    /*public void lock(){
        synchronized(this){
            while(isLocked){
                try{
                    this.wait();
                } catch(InterruptedException e){
                    //do nothing, keep waiting
                }
            }
            isLocked = true;
        }
    }
    */
}
