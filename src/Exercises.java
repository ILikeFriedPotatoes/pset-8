public class Exercises {

	/*
	 * Given two arrays of ints, a and b, return true if the arrays have either the
	 * same first element or the same last element. The arrays must meet the
	 * following specifications, otherwise you should return false.
	 * a and b must not be null
	 * a and b must have a length of at least 1
	 */

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length < 1 || b == null || b.length < 1) {
			return false;
		}
		if(b.length < 0) {
			return false;
		}
		if(a[0] == b[0]) {
			return true;
		} else if(a[a.length - 1] == b[b.length - 1]) {
			return true;
		}
		return false;
	}

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
			a[a.length - i - 1] = values[values.length - i - 1];
		}
		return a;
	}

	public int difference(int[] numbers) {
		if(numbers == null) {
			return -1;
		} else if(numbers.length < 1) {
			return -1;
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
			return -1;
		} else if (numbers.length < 3 || numbers.length % 2 == 0) {
			return -1;
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
		if(words == null) {
			return empty;
		}
		for(int i = 0; i < words.length; i ++) {
			boolean containsNull = false;
			containsNull = (words[i] == null) ? true : false;
			if(containsNull) {
				return empty;
			}
		}
		if (words.length < 3 || words.length % 2 == 0) {
			return empty;
		}
		String first = words[((int) Math.floor(words.length / 2)) - 1];
		String middle = words[(int) Math.floor(words.length / 2)];
		String last = words[(int) Math.floor(words.length / 2) + 1];
		String[] returnArray = new String[3];
		returnArray[0] = first;
		returnArray[1] = middle;
		returnArray[2] = last;
		return returnArray;
	}

	public boolean increasing(int numbers[] ) {
		if(numbers == null) {
			return false;
		} else if (numbers.length < 1) {
			return false;
		}
		for(int i = 0; i < numbers.length - 2; i++) {
			double first = numbers[i];
			double middle = numbers[i + 1];
			double last = numbers[i + 2];
			if(first > middle && middle > last) {
				return true;
			}
		}
		return false;
	}

	public boolean everywhere(int values[], int x) {
		if(values == null) {
			return false;
		} else if (values.length < 1) {
			return false;
		}
		for(int i = 1; i < values.length - 1; i ++) {
			if(values[i] != x) {
				if(values [i - 1] != x && values [i + 1] != x) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean consecutive(int numbers[]) {
		if(numbers == null) {
			return false;
		} else if (numbers.length < 3) {
			return false;
		}
		for(int i = 0; i < numbers.length - 2; i ++) {
			if(numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0 && numbers[i + 2] % 2 == 0) {
				return true;
			}
			if(numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1 && numbers[i + 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}

	public boolean balance(int numbers[]) {
		if(numbers == null) {
			return false;
		} else if (numbers.length < 2) {
			return false;
		}
		for(int i = 0; i < numbers.length; i ++) {
			int sumLeft = 0;
			int sumRight = 0;
			for(int j = 0; j < i; j ++) {
				sumLeft += numbers[j];
			}
			for(int j = i; j < numbers.length; j ++) {
				sumRight += numbers[j];
			}
			if(sumLeft == sumRight) {
				return true;
			}
		}
		return false;
	}

	public int clumps(String values[]) {
		if(values == null) {
			return -1;
		}
		int clumpNum = 0;
		for(int i = 0; i < values.length; i ++) {
			boolean containsNull = false;
			containsNull = (values[i] == null) ? true : false;
			if(containsNull) {
				return -1;
			}
		}
		for(int i = 0; i < values.length - 1; i ++) {
			if(i == 0) {
				if(values[i].equals(values[i + 1])) {
					clumpNum ++;
				}
			} else if(values[i].equals(values[i + 1]) && !(values[i].equals(values[i - 1]))) {
				clumpNum ++;
			}
		}
		return clumpNum;
	}
}
