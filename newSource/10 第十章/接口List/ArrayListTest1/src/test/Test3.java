package test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List insertList = new ArrayList();
		insertList.add("a");
		insertList.add("b");
		insertList.add("c");

		ArrayList list = new ArrayList();
		list.add("���й�1");
		list.add("���й�2");
		list.addAll(insertList);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
