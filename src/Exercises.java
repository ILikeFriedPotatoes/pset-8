import java.lang.*;

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
	
	public double biggest(double[] numbers) {
		if(numbers == null) {
			return 1/0;
		} else if (numbers.length < 3 || numbers.length % 2 == 0) {
			return 1/0;
		}
		double first = numbers[0];
		double middle = numbers[(int) Math.floor(numbers.length / 2)];
		double last = numbers[numbers.length - 1];
		double maximum = (first > middle && first > last) ? first :
		(middle > last) ? middle :
		last;
		return maximum;
	}
	
	public String[] middle(String[] words) {
		String[] empty = new String[0];
		boolean containsNull = false;
		for(int i = 0; i < words.length; i ++) {
			containsNull = (words[i] == null) ? true : false;
			if(containsNull) {
				break;
			}
		}
		if(words == null) {
			return empty;
		} else if(containsNull) {
			return empty;
		} else if (words.length < 3 || words.length % 2 == 0) {
			return empty;
		}
		String first = words[(int) Math.floor(words.length / 2) - 1];
		String middle = words[(int) Math.floor(words.length / 2)];
		String last = words[(int) Math.floor(words.length / 2) + 1];
		String[] returnArray = new String[3];
		returnArray[0] = first;
		returnArray[0] = middle;
		returnArray[0] = last;
		return returnArray;
	}
}
