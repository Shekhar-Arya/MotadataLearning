package com.Client1;

import javax.jms.*;

public class Client1GetRunnable implements Runnable{

    MessageConsumer consumer = null;
    Client1GetRunnable(MessageConsumer consumer)
    {
        this.consumer = consumer;
    }

    @Override
    public void run() {

        while (true)
        {
            try {

                TextMessage message = (TextMessage) consumer.receive();
                System.out.println("From Client 2 : "+message.getText());

            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
