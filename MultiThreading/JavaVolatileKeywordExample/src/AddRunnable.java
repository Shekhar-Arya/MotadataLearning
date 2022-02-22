public class AddRunnable implements Runnable{
    int data;
    AddandGet addandGet  =null;
    AddRunnable(int data, AddandGet addandGet)
    {

        this.data = data;
        this.addandGet = addandGet;
    }
    @Override
    public void run() {
        addandGet.add(data);
    }
}
