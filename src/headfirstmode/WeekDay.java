package headfirstmode;

public enum WeekDay {
	MON(1),TUE(2),WED(3),THU(4),FRI(5),SAT(6),SUN(0);
	
	private int value;
	
	WeekDay(int value){
		this.value = value;
	}
	
	public static WeekDay getWeekDay(int value ){
		for(WeekDay c:WeekDay.values()){
			if(c.value==value){
				return c;
			}
		}
		
		return null;
	}
	
	
	public static WeekDay getNextDay(WeekDay nowDay){
		int nextDayValue = nowDay.value;
		if(++nextDayValue==7){
			nextDayValue = 0;
		}
		
		return getWeekDay(nextDayValue);
	}
	
	public static int getValue(WeekDay day){
		return day.value;
	}
}
