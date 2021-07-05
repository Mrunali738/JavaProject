package frameworkCollection;

import java.util.HashSet;
public class SetTest {
public static void main(String[] args) {
		
	HashSet<Integer> nums = new HashSet<Integer>();
	nums.add(4);
	nums.add(7);
	nums.add(9);
	System.out.println(nums);
	for(int i : nums) {
		System.out.println(i);
	}
		for(int i=1; i<=10; i++) {   // Show which numbers between 1 and 10 are in the set
	if(nums.contains(i)) {
		System.out.println(i + " Was found in Set");
	}
	else {
		System.out.println(i + " Was not found in Set");
	}
		}

	}

}
