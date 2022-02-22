import com.github.brainlag.nsq.NSQConfig;
import com.github.brainlag.nsq.NSQProducer;
import com.github.brainlag.nsq.exceptions.NSQException;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.concurrent.TimeoutException;

public class Producer {
    public static void main(String[] args) throws SSLException, NSQException, TimeoutException {
        NSQProducer producer = new NSQProducer();
        producer.addAddress("localhost",4150);
        NSQConfig config = new NSQConfig();
        File serverKeyFile = new File(Producer.class.getResource("/server.pem").getFile());
        File clientKeyFile = new File(Producer.class.getResource("/client.key").getFile());
        File clientCertFile = new File(Producer.class.getResource("/client.pem").getFile());
        SslContext ctx = SslContextBuilder.forClient().sslProvider(SslProvider.OPENSSL).trustManager(serverKeyFile)
                .keyManager(clientCertFile, clientKeyFile).build();
        config.setSslContext(ctx);

        producer.setConfig(config);
        producer.start();
        producer.produce("SecureExample","Secure Message".getBytes());
    }
}
