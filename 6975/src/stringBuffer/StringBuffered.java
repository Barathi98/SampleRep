package stringBuffer;
//simple hello world program using string buffer is synchronized it can't do the multiple task
class StringBuffered {
	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Hello world");
		s.append(" Java programming");
		s.lastIndexOf("is object oriented");//to print this line it has to wait for the above line to execute
		System.out.println(s);
	}

}
