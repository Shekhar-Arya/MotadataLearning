public class AddandGet
{
    int value = 0;
    int addCount = 0;
    int getCount = 0;
    volatile boolean hasValue = false; // Here these variable is directly fetched and updated in main memory

    public void add(int data)
    {
        this.value = data;
        addCount++;
        this.hasValue = true;   // As the volatile variable is used in last for setting value so instruction above it are not executed after this instruction
                                // And also all above are fetthced directly from main memory and update in main memory
    }

    public void get()
    {
        while (!hasValue)   // Here as the volatile variable is used in first while getting value it gaurantee that all below varibale are not executed before it.
                            // And also variables below are directly fethced from main memory.
        {
        }
        getCount++;
        hasValue = false;
        System.out.println("This is value "+value);

    }
}
