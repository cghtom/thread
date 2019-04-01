package test.run;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("��ӡ�ˣ�begin "
						+ Thread.currentThread().getName());
				System.out.println("��ӡ�ˣ�      end "
						+ Thread.currentThread().getName());
			}
		};

		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 2, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("�̳߳��е��߳���A��" + executor.getPoolSize());
		System.out.println("���������߳�����Ϊ��" + executor.prestartAllCoreThreads());
		System.out.println("�̳߳��е��߳���B��" + executor.getPoolSize());
	}

}
