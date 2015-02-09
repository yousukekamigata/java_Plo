package java������H��3;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Main76 {

	public static void main(String[] args) throws Exception {
		Class clazz=RefSample.class;

		Constructor<?>cons=clazz.getConstructor(int.class);
		RefSample rs=(RefSample) cons.newInstance(256);

		Field f=clazz.getField("pub");
		f.set(rs, 2);
		System.out.println(f.get(rs));

		Method m=clazz.getMethod("hello",String.class,int.class);
		m.invoke(rs,"reflection!",128);

		boolean pubc=Modifier.isPublic(clazz.getModifiers());
		boolean finm=Modifier.isFinal(m.getModifiers());

	}

}
