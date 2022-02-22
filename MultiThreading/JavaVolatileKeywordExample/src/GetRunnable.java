public class GetRunnable implements Runnable{
    AddandGet addandGet = null;
    GetRunnable(AddandGet addandGet)
    {
        this.addandGet = addandGet;
    }
    @Override
    public void run() {
        addandGet.get();
    }
}
