import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;

public class Consumer1 {
    public static void main(String[] args) {

        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("localhost",4161);

        NSQConsumer consumer = new NSQConsumer(lookup,"Example1","Consumer1",(message)->{
            System.out.println("Received : "+ new String(message.getMessage()));
            message.finished();
        });
        consumer.start();

    }
}
