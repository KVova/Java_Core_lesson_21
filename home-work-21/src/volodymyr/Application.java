package volodymyr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.AnnotatedElement;
import java.text.Format.Field;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {

		List<String> myCustomAnnotationList = getAnnotation(Person.class);

		for (String str : myCustomAnnotationList) {
			System.out.println(str);
		}

		writeToFile(myCustomAnnotationList, new File("myCustomAnnotation.txt"));

	}

	public static List<String> getAnnotation(Class<?> customClass) {

		List<String> annotationValue = new ArrayList<String>();

		java.lang.reflect.Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			java.lang.reflect.Field field = fields[i];

			if (((AnnotatedElement) field).getAnnotation(MyCustomAnnotation.class) instanceof MyCustomAnnotation) {
				annotationValue.add(((java.lang.reflect.Field) field).getType() + " " + field.getName() + " -> "
						+ ((AnnotatedElement) field).getAnnotation(MyCustomAnnotation.class).value());
			}
		}

		return annotationValue;

	}

	public static void writeToFile(List<String> list, File file) throws Exception {
		OutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(list);
		oos.close();
		os.close();
	}

}
