import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.naming.NamingException;

public class Receiver {

    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String queueName = "Message_Queue";

    public static void main(String[] args) throws NamingException, JMSException {

        // Queue queue = (Queue) context.lookup("MessageQueue");
        QueueConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);

        QueueConnection connection = connectionFactory.createQueueConnection();
        connection.start();

        QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue("Message_Queue");
        MessageConsumer receiver = session.createConsumer(destination);

        TextMessage message = (TextMessage) receiver.receive();

        System.out.println("Message Received : "+message.getText());

        session.close();
        connection.close();


    }
}
