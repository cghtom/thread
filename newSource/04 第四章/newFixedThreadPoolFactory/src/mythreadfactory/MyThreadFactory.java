package mythreadfactory;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {

	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("���Ƴ��е��̶߳��������" + Math.random());
		return thread;
	}
}
