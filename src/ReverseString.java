/*	1. Write a java code for the reverse of a string.
	2. Use methods from string class like 
  ends with, indexOf, lastIndexOf,CharAt,split, trim*/
public class ReverseString {

	public static void main(String[] args) {
		String name = "neethu abc ";
		System.out.println("reversing string " + name + " is: ");
		System.out.println(name.length());
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println(name.endsWith("u"));
		System.out.println(name.indexOf('t'));
		System.out.println(name.lastIndexOf('e'));
		System.out.println(name.charAt(5));
		String[] datas = name.split(" ");
		for (String data:datas ) {
			System.out.println(data);
		}
		System.out.println(name.trim());
	}

}
