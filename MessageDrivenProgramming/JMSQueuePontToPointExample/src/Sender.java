import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.jms.Queue;

public class Sender {

    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String queueName = "Message_Queue";
    public static void main(String[] args) throws JMSException {

        System.out.println("String url for sender is "+ url);


        QueueConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        QueueConnection connection =connectionFactory.createQueueConnection();

        connection.start();
        QueueSession session = connection.createQueueSession(false,Session.DUPS_OK_ACKNOWLEDGE);

        // Create Topic or Queue
        Destination destination = session.createQueue("Message_Queue");
        MessageProducer sender = session.createProducer(destination);
        sender.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

        TextMessage message = session.createTextMessage("Hello From Sender");

        sender.send(message);
        System.out.println("Message sent : "+message.getText());

        session.close();
        connection.close();
    }
}
