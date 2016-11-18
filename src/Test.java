import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		fun();

	}

	public static void fun() {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		List<String> list1 = new ArrayList<String>();

		list1.add("b");
		list1.add("d");
		
		System.out.println(list);
		System.out.println(list1);
		System.out.println("=========开始=========");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			Iterator<String> it1 = list1.iterator();
			while(it1.hasNext()){
				String s1 = it1.next();
				if (s.equals(s1.toUpperCase())) {
					it.remove();
					it1.remove();
				}
			}
		}
		System.out.println("========结束=========");
		System.out.println(list);
		System.out.println(list1);

	}

	public static void fun1() {

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		System.out.println(list);
		System.out.println(list1);
		for (String s : list) {

			for (String s1 : list1) {
				if (s.equals(s1.toUpperCase())) {
					list.remove(s);
					list1.remove(s1);
				}
			}
		}

		System.out.println("=================");
		System.out.println(list);
		System.out.println(list1);

	}

}
