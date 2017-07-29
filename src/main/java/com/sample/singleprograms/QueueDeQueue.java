package com.sample.singleprograms;

import org.postgresql.core.ConnectionFactory;

import java.sql.Connection;
import java.util.Hashtable;
import java.util.Queue;

import javax.naming.Context;
import javax.naming.InitialContext;

/*public class QueueDeQueue {
	public static void main(String[] args) {
		try {
			Hashtable env = new Hashtable();
			env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
			env.put(Context.PROVIDER_URL, "jnp://localhost:1099");
			env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");

			Context ctx = new InitialContext(env);

			ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup("ConnectionFactory");

			Queue queue = (javax.jms.Queue) ctx.lookup("/queue/DLQ");

			Connection connection = connectionFactory.createConnection();

			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			MessageProducer messageProducer = session.createProducer(queue);

			TextMessage textMessage = session.createTextMessage();

			textMessage.setText("Hello World");

			System.out.println("Sending Message: " + textMessage.getText());

			messageProducer.send(textMessage);

			MessageConsumer messageConsumer = session.createConsumer(queue);

			connection.start();

			Message msg = messageConsumer.receive();

			if (msg instanceof TextMessage) {
				TextMessage txtMsg = (TextMessage) msg;
				System.out.println("Read Message: " + txtMsg.getText());
			}

			session.close();
			connection.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}*/
