package com.Client1;

import com.Client2.Client2GetRunnable;
import com.Client2.Client2SendRunnable;
import org.apache.activemq.*;
import javax.jms.*;

public class Client1 {
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String receiverQueueName = "Client1";
    private static String senderQueueName = "Client2";

    public static void main(String[] args) throws JMSException {

        QueueConnectionFactory queueConnectionFactory = new ActiveMQConnectionFactory(url);
        QueueConnection connection = queueConnectionFactory.createQueueConnection();
        connection.start();

        QueueSession session = connection.createQueueSession(false, Session.DUPS_OK_ACKNOWLEDGE);

        Destination receiveQueue = null;
        Destination senderQueue = null;
        MessageConsumer consumer = null;
        MessageProducer messageProducer= null;
        try {
            receiveQueue = session.createQueue(receiverQueueName);
            senderQueue = session.createQueue(senderQueueName);
            consumer = session.createConsumer(receiveQueue);
            messageProducer = session.createProducer(senderQueue);
        } catch (JMSException e) {
            e.printStackTrace();
        }

        new Thread(new Client1GetRunnable(consumer)).start();
        new Thread(new Client1SendRunnable(messageProducer,session)).start();

    }
}
