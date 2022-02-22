package com.Client1;


import org.apache.activemq.*;
import javax.jms.*;
import java.util.Scanner;

public class Client1SendRunnable implements Runnable{

    MessageProducer messageProducer = null;
    QueueSession session = null;
    Client1SendRunnable(MessageProducer messageProducer, QueueSession session)
    {
        this.messageProducer = messageProducer;
        this.session = session;
    }

    @Override
    public void run() {

        Scanner s = new Scanner(System.in);

        while (true)
        {
            try {
                messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

                System.out.println("Please enter message to send");
                TextMessage message = session.createTextMessage(s.nextLine());

                if(message.getText().equals("close"))
                {
                    session.close();
                    break;
                }
                messageProducer.send(message);


            } catch (JMSException e) {
                e.printStackTrace();
            }
        }

    }
}
