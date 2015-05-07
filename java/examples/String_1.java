import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

public class String_1 {

	public static void change(String s) {
		s = "bbbb";
	}

	public static void changeByReflection(String s) throws Exception{
		Field valFeild = s.getClass().getDeclaredField("value");
		
		valFeild.setAccessible(true);
		
		char[] val = (char[]) valFeild.get(s);
		int len = val.length;
		
		for (int i = 0; i < len; i++) {
			val[i] = 'c';
		}
	}

	public static void main(String[] args) {
		String s = "aaaa";
		change(s);
		System.out.println(s);
		
		try {
			changeByReflection(s);
		} catch (Exception e) {
			
		}
		System.out.println(s);
	}

}
