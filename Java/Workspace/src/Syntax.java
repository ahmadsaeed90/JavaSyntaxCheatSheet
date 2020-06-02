import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class Syntax {
	public static void main(String[] args) {

		// Integer
		Integer i = 0;
		i = Integer.parseInt("123");
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;

		// Mathematical operations
		var ab = Math.abs(-1);
		var min = Math.min(1, 2);
		var max = Math.max(20, 25);

		// String
		var str = "test";
		int len = str.length();
		char c = str.charAt(0);
		var substr = str.substring(1, 3); // NOTE: second argument is ending index, not length. ending index excluded
		var substr2 = str.substring(4);
		String[] tokens = str.split(",");
		int index1 = str.indexOf('t');
		int index2 = str.indexOf("es");
		int index3 = str.lastIndexOf("c");
		char[] chars = str.toCharArray(); // for loop can be used on char array, not string

		String newStr = str.replace("t", "abc"); // replaces all substrings
		String newStr2 = str.replaceFirst("t", "abc"); // replace only first substring
		var res = str.replaceAll("\\s+", ""); // replaceAll takes regex

		// Character
		char ch = 'a';
		char lowered = Character.toLowerCase(ch);
		char uppered = Character.toUpperCase(ch);
		boolean isWhiteSpace = Character.isWhitespace(ch);
		boolean isDigit = Character.isDigit(ch);
		boolean isLetter = Character.isLetter(ch);

		// List
		var list = new ArrayList<String>();
		list.add("a");
		list.add(1, "b");
		list.addAll(new ArrayList<String>());
		list.remove(0); // remove by index
		list.remove("a"); // remove by value
		list.removeIf(x -> x.startsWith("a"));
		list.clear();
		boolean found = list.contains("a");
		String s = list.get(0); // get by index
		list.set(1, "cd");
		int size = list.size();
		int max = Collections.max(list);

		// Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(1, "cde"); // duplicate key overrides previous value
		String val = map.get(1);
		String va = map.getOrDefault(1, "default");
		String removed = map.remove(1);

		// Stack
		var stack = new Stack<Integer>();
		stack.push(2);
		stack.pop();
		var top = stack.peek();
		size = stack.size();
		boolean isEmpty = stack.isEmpty();

		// Queue
		var queue = new LinkedList<Integer>();
		queue.add(2);
		int num = queue.remove(); // throws eception if queue empty
		Integer queueTop = queue.poll(); // same as remove but returns null if queue empty
		int siz = queue.size();
		var elem = queue.peek();
		var lastElem = queue.peekLast(); // get last element without removing

		// Priority Queue (heap)
		var pq = new PriorityQueue<Integer>(10); // min heap by default
		pq.add(1);
		pq.add(2);
		pq.remove(); // returns the element at root (minimum depending on comparator)
		pq.peek(); // returns element at the root
		pq.size();
		var maxPq = new PriorityQueue<Integer>(Collections.reverseOrder()); // max heap

		// Set
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.contains(1);
		set.remove(2);
		set.toArray(new Integer[set.size()]);
	}
}
