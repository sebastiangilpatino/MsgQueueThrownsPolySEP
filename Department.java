package SEP3;

public abstract class Department {
	private StringQueue queue = new StringQueue();

	public StringQueue getQueue() {
		return queue;
	}

	public abstract String getName();

	public void addMessage(String msg) {

	}

	public String nextMesage() throws EmptyQueueException {
		return queue.dequeue();
	}

}
