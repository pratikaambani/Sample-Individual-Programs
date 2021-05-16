package thread.concurrent;

import java.util.PriorityQueue;

/**
 * A scenario where I have message object with attributes id and version. I
 * need to insert a message objects with latest version into the database. My
 * system has these messages on a queue for procesing. Suggest an implementation
 * for the same.
 * 
 * @author Pratik Ambani
 * 
 */
public class PriorityQueueTest {

	public static void main(String... args) {
		PriorityQueue<Message> pq = new PriorityQueue<Message>(5);
		pq.add(new Message(1, 200));
		pq.add(new Message(1, 19));
		pq.add(new Message(1, 215));
		pq.add(new Message(1, 100));

		for (int i = 0; i < pq.size() ; i++) {
			System.out.println(pq.poll());
		}
	}
}

// user defined object must be comparable if you put in priority queue
// other wise you will get java.lang.Comparable
class Message implements Comparable<Message> {
	int id;
	int version;

	public Message(int id1, int version1) {
		this.id = id1;
		this.version = version1;
	}

	@Override
	public int compareTo(Message o) {
		return o.version - this.version;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", version=" + version + "]";
	}

}