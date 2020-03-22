package volodymyr;

import java.lang.reflect.Field;

public class Application {

	public static void main(String[] args) {
		
		getMyCustomAnnotation(Person.class);
		
	}
	
	public static void getMyCustomAnnotation(Class<?> customClass) {
		
		Field[] fields = customClass.getDeclaredFields();
		
		for(int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			
			if(field.getAnnotation(MyCustomAnnotation.class) instanceof MyCustomAnnotation) {
				System.out.println(field.getType()+ " " +field.getName()+ " => ");
				System.out.println("annotation type = "+ field.getAnnotation(MyCustomAnnotation.class).annotationType());
				System.out.println("annotation value = "+ field.getAnnotation(MyCustomAnnotation.class).value());
			}
		}
	}

}
