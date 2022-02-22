package com.Client2;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class Client2 {
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static String receiverQueueName = "Client2";
    private static String senderQueueName = "Client1";

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

        new Thread(new Client2GetRunnable(consumer)).start();
        new Thread(new Client2SendRunnable(messageProducer,session)).start();


    }
}
