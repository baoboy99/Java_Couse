package dnhthanh.hueic.edu.vn;

public class DaoXau {
	public static String thuchien(String s) {
		String ns = new String();
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo xâu.
		char[] a = s.toCharArray();
		char[] b = new char[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[a.length-i-1];
		}
		ns = new String(b);
		return ns;
	}
}
