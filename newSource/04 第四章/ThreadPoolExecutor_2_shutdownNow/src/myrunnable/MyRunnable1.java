package myrunnable;

public class MyRunnable1 implements Runnable {
	public void run() {
		try {
			for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
				String newString = new String();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();
				Math.random();

				if (Thread.currentThread().isInterrupted() == true) {
					System.out.println("����û����ɣ����ж��ˣ�");
					throw new InterruptedException();
				}
			}
			System.out.println("����ɹ���ɣ�");
		} catch (InterruptedException e) {
			System.out.println("����catch�ж�������");
			e.printStackTrace();
		}
	}
}
