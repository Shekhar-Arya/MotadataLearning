package com.company;
public class Lock{
    protected Object monitorObject = new Object();
    protected boolean isLocked = false;

    public void lock() throws InterruptedException{
        synchronized(this){
            while(isLocked){
                synchronized(this.monitorObject){
                    this.monitorObject.wait();
                }
            }
            isLocked = true;
        }
    }

    public void unlock(){
        synchronized(this){
            this.isLocked = false;
            synchronized(this.monitorObject){
                this.monitorObject.notify();
            }
        }
    }

    // As we can see above lock() first synchonizes on this monitor object and then  synchronizes on moniterObject.
    // if isLocked is false then there is no problem but if it is true then it will enter into second synchronized block
    // and will wait for notify signal

    // now to get notify signal the thread that locked the lock needsto call unlock
    // but thread will not be allowed to enter into the synchronized(this) of unlock because it is locked by different object.

    /*Notice how the lock() method first synchronizes on "this", then synchronizes on the monitorObject member.
    If isLocked is false there is no problem. The thread does not call monitorObject.wait().
     If isLocked is true however, the thread calling lock() is parked waiting in the monitorObject.wait() call.

    The problem with this is, that the call to monitorObject.wait() only releases the synchronization monitor on the monitorObject member,
    and not the synchronization monitor associated with "this". In other words, the thread that was just parked waiting
    is still holding the synchronization lock on "this".

    When the thread that locked the Lock in the first place tries to unlock it by calling unlock() it will be blocked trying
    to enter the synchronized(this) block in the unlock() method. It will remain blocked until the thread waiting in lock() leaves the synchronized(this) block. But
    the thread waiting in the lock() method will not leave that block until the isLocked is set to false,
    and a monitorObject.notify() is executed, as it happens in unlock()*/

    //In short
    /*Thread 1 locks A and B, then releases B and waits for a signal from Thread 2. Thread 2 needs both A and B to send
     Thread 1 the signal. So, one thread is waiting for a signal, and another for a lock to be released.
     */
}
