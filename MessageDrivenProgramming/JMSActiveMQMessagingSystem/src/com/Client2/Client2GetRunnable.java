package com.Client2;

import javax.jms.*;

public class Client2GetRunnable implements Runnable{

    MessageConsumer consumer = null;
    Client2GetRunnable(MessageConsumer consumer)
    {
        this.consumer = consumer;
    }

    @Override
    public void run() {


        while (true)
        {
            try {

                TextMessage message = (TextMessage) consumer.receive();
                System.out.println("From Client 1 : "+message.getText());

            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
