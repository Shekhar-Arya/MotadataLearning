import com.github.brainlag.nsq.NSQConfig;
import com.github.brainlag.nsq.NSQConsumer;
import com.github.brainlag.nsq.lookup.DefaultNSQLookup;
import com.github.brainlag.nsq.lookup.NSQLookup;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;

import javax.net.ssl.SSLException;
import java.io.File;

public class Consumer {
    public static void main(String[] args) throws SSLException {
        NSQLookup lookup = new DefaultNSQLookup();
        lookup.addLookupAddress("localhost",4161);

        NSQConfig config = new NSQConfig();
        File serverKeyFile = new File(Consumer.class.getResource("/server.pem").getFile());
        File clientKeyFile = new File(Consumer.class.getResource("/client.key").getFile());
        File clientCertFile = new File(Consumer.class.getResource("/client.pem").getFile());
        SslContext ctx = SslContextBuilder.forClient().sslProvider(SslProvider.OPENSSL).trustManager(serverKeyFile)
                .keyManager(clientCertFile, clientKeyFile).build();
        config.setSslContext(ctx);

        NSQConsumer consumer = new NSQConsumer(lookup,"SecureExample","Consumer",(message)->{
            System.out.println("Recieved : "+ new String(message.getMessage()));
            message.finished();
        },config);
        consumer.start();

    }
}
