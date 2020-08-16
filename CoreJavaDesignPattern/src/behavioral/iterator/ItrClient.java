package behavioral.iterator;

public class ItrClient {

	public static void main(String[] args) {
		ItrObject itrObj = new ItrObject();
		itrObj.add("one");
		itrObj.add("two");
		itrObj.add("three");
		for (String s : itrObj.items) {
			System.out.println(s);
		}
		Iterator itr = itrObj.iterator();
		while (itr.hasNext()) {
			System.out.println("From iterator:" + itr.next());
		}
		System.out.println("using get method:" + itrObj.get(2));
		
	}

}
