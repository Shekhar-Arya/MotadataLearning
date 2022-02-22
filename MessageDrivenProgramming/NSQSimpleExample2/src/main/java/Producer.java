import com.github.brainlag.nsq.NSQConfig;
import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.exceptions.NSQException;
import com.google.common.collect.Lists;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Producer {
    public static void main(String[] args) throws NSQException, TimeoutException {
        NSQProducer producer = new NSQProducer();
      /*  NSQConfig config = new NSQConfig();
        config.setCompression(NSQConfig.Compression.DEFLATE);
        config.setDeflateLevel(4);
        producer.setConfig(config);
      */

        producer.addAddress("localhost",4150);
        Scanner s = new Scanner(System.in);


        List<byte[]> messages = Lists.newArrayList();
        for (int i = 0; i < 50; i++) {
            messages.add("Hello".getBytes());
        }
        producer.start();
        String input = "Connection....";
        producer.produce("Example1",input.getBytes());
        while (!input.equals("close"))
        {
            input = s.nextLine();
            producer.produce("Example1",input.getBytes());
        }
//        producer.produceMulti("Example1", messages);
        producer.shutdown();
    }
}
