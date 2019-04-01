package extthread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

	private CountDownLatch comingTag;// ���еȴ������˶�Ա����
	private CountDownLatch waitTag;// �ȴ�����˵׼����ʼ
	private CountDownLatch waitRunTag;// �ȴ�����
	private CountDownLatch beginTag;// ����
	private CountDownLatch endTag;// �����˶�Ա�����յ�

	public MyThread(CountDownLatch comingTag, CountDownLatch waitTag,
			CountDownLatch waitRunTag, CountDownLatch beginTag,
			CountDownLatch endTag) {
		super();
		this.comingTag = comingTag;
		this.waitTag = waitTag;
		this.waitRunTag = waitRunTag;
		this.beginTag = beginTag;
		this.endTag = endTag;
	}

	@Override
	public void run() {
		try {
			System.out.println("�˶�Աʹ�ò�ͬ��ͨ���߲�ͬ�ٶȵ������ܵ㣬������ͷ�ߣ�");
			Thread.sleep((int) (Math.random() * 10000));
			System.out.println(Thread.currentThread().getName() + "�����ܵ��ˣ�");
			comingTag.countDown();
			System.out.println("�ȴ�����˵׼����");
			waitTag.await();
			System.out.println("���͸�λ��׼���������ƣ�");
			Thread.sleep((int) (Math.random() * 10000));
			waitRunTag.countDown();
			beginTag.await();
			System.out.println(Thread.currentThread().getName()
					+ " ����Ա���� ��������������ʱ��ȷ��");
			Thread.sleep((int) (Math.random() * 10000));
			endTag.countDown();
			System.out.println(Thread.currentThread().getName() + " ����Ա�����յ�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
