

/**  Here are two recursive methods to reverse the characters in a string.  */
public class ReverseString {

    /**  what I was attempting to write on the whiteboard today. */
    public static void recurReverseStr_displayOnly(int i, String str) {

		if (i >= str.length())
			return;
		else {
			recurReverseStr_displayOnly(i + 1, str);
			System.out.print(str.charAt(i));
		}
    }

    /**  what Sachin actually requested. */
    public static String recurReverseStr_returnResult(String str) {
	
		if (str.length() <= 1)
			return str;
	
		return recurReverseStr_returnResult(str.substring(1)) + str.charAt(0);
    }


    public static void main(String[] args) {

		String str = "Stuart C. Robinson";

		System.out.println(recurReverseStr_returnResult(str));

		recurReverseStr_displayOnly(0, str);
    }

}
