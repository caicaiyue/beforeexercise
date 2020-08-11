package headfirstmode;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(WeekDay.MON);
		for(WeekDay c:WeekDay.values()){
			int value = WeekDay.getValue(c);
			StringBuffer sb = new StringBuffer();
			sb.append(c+":"+value+",nextday is£º");
			sb.append(WeekDay.getNextDay(c));
			System.out.println(sb);
			//System.out.println();
		}
		
		
		
	}

}
