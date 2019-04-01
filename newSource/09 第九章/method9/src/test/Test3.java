package test;

import java.util.concurrent.ForkJoinPool;

import myrunnable.MyRunnable2;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable = new MyRunnable2();
		ForkJoinPool pool = new ForkJoinPool();
		pool.execute(myRunnable);
		Thread.sleep(1000);
		pool.shutdownNow();// ����һ���յ�List
		pool.execute(myRunnable);
		System.out.println("main end!");
		Thread.sleep(Integer.MAX_VALUE);

		// shutdown:
		// ÿ��������������ֱ��������
		// �عرպ���������������ִ�в��׳�RejectedExecutionException�쳣��

		// shutdownNow���isInterrupted() ==true�ж�:
		// ����ֹͣ��ǰ����ִ�е�����
		// �عرպ���������������ִ�в��׳�RejectedExecutionException�쳣

		// shutdownNowδ���isInterrupted() ==true�ж�:
		// ÿ��������������ֱ������
		// �عرպ���������������ִ�в��׳�RejectedExecutionException�쳣
	}
}
