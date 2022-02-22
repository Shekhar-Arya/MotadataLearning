public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Java Volatile key word is used to fetch the value directly from main memory and update the value directly into main memory
        // Because of this we can solve the problem of Visibility gaurantee and get latest and updated value all the time
        // It also helps us in problem of instruction reordering
        // while setting value it gaurantee that instruction above all volatile instructions should be executed before only
        // and while getting value it gaurantee that instruction below valoatile instructions should be executed after only
        // and even if variables above and below are not volatile they are still directly read from main memory and still updated directly into main memory.

        // volatile keyword used in AddAndGet Class.

        AddandGet addandGet = new AddandGet();
        for (int i = 1; i < 100; i++) {
            Thread thread1 = new Thread(new AddRunnable(i ,addandGet));
            thread1.start();
            thread1.join();
            Thread thread2 =  new Thread(new GetRunnable(addandGet));
            thread2.start();
            thread2.join();
        }
        System.out.println("Add count is "+addandGet.addCount);
        System.out.println("Get count is "+addandGet.getCount);

    }
}
