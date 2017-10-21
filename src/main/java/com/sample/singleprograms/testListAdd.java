import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class testListAdd {

	public static void main(String args[]) {

		System.out.println("Hi");

		System.out.println("Getting values..");

		List<Object> list1 = new ArrayList<Object>();
		String t1 = "test1";
		String t2 = "test2";
		String t3 = "test3";
		String t4 = "test4";
		String t5 = "test5";

		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		list1.add(t4);
		list1.add(t5);

		System.out.println("List = " + list1);

		HashMap hashMapObj = new HashMap();

		System.out.println("HM = " + hashMapObj.isEmpty());

		hashMapObj.put(t5, t5);
		System.out.println("HM = " + hashMapObj.keySet());

		/*
		 * SampleList s = new SampleList();
		 * 
		 * hashMapObj = s.getAllResults();
		 * 
		 * System.out.println("heer = " +list1 .get(0));
		 * 
		 * System.out.println("heer = " +l2 .get(0));
		 */}

}
