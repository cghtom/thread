package test;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���й�1");
		list.add("���й�2");
		list.add(1, "���ǵڶ�λ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
