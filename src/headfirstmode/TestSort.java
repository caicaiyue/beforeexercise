package headfirstmode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestSort {
	public static void sort(Object[] a){
		Object aux[] = (Object[])a.clone();
		mergeSort(aux,a,0,a.length,0);
	}

	private static void mergeSort(Object src[], Object dest[], int low, int high, int off) {
		// TODO Auto-generated method stub
		for(int i=low;i<high;i++){
			for(int j=i;j>low&&((Comparable)dest[j-1]).compareTo((Comparable)dest[j])>0;j--){
				swap(dest,j,j-1);
			}
		}
	}

	private static void swap(Object[] dest, int j, int i) {
		// TODO Auto-generated method stub
		Object temp = dest[j];
		dest[j] = dest[i];
		dest[i] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] array = {5,1,6,2,3,8,4};
		//sort(array);
		//System.out.println(Arrays.toString(array));
		try {
			Class<?>[] c = new Class[] { Class.forName("java.lang.Object") };
			Method m1;
			m1 = Class.forName("java.lang.Object").getMethod("equals",c);
			System.out.println(m1.getName());
			System.out.println(c[0].getName());
			Boolean b = true;
			m1.invoke(b);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
	
	public boolean equals(Object obj){
		Boolean b = (Boolean) obj;
		return b.booleanValue();
	}

}
