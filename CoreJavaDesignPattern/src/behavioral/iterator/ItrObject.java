package behavioral.iterator;

public class ItrObject {
	int index;
	String[] items = new String[5];

	public MyIterator iterator() {
		index = 0;
		return new MyIterator();
	}

	public void add(String s) {
		items[index] = s;
		index++;
	}

	public String get(int i) {
		return items[i];
	}

	public class MyIterator implements Iterator {
		public boolean hasNext() {
			boolean result = false;
			if (index < items.length) {
				result = true;
			}
			return result;
		}

		public String next() {
			return items[index++];
		}
	}

}
