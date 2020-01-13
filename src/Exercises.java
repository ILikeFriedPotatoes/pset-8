public class Exercises {
	
	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		} else if(a.length < 1 || b.length < 1) {
			return false;
		} else if(a[0] == b[0]) {
			return true;
		} else if(a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}
		
		// write your code here
	
	public String[] endsMeet(String[] values, int n) {
		String[] empty = new String[0];
		if(values == null) {
			return empty;
		} else if(values.length < n) {
			return empty;
		} else if(n < 0) {
			return empty;
		}
		String[] a = new String[(2 * n)];
		for(int i = 0; i < n; i ++) {
			a[i] = values[i];
			a[a.length - i] = values[values.length - i];
		}
		return a;
	}
	
	public int difference(int[] numbers) {
		if(numbers == null) {
			return 1/0;
		} else if(numbers.length < 1) {
			return 1/0;
		}
		int maximum = numbers[0];
		int mininum = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			maximum = (numbers[i] > maximum) ? numbers[i] : maximum;
			mininum = (numbers[i] < mininum) ? numbers[i] : mininum;
		}
		return maximum - mininum;
	}
}
