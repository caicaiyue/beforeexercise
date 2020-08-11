package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.xml.crypto.Data;

//这个类用来练习写生成2018-10-1至2018-10-20之间的日期
public class genericdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Data date = randomDate("2018-10-01 ","2018-10-15")
		Date date = testRondomDate("2018-10-10","2018-11-10");
		System.out.println(changeformat(date));
		Date date2 = addDate(date);
		System.out.println(changeformat(date2));
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}

	//在beginDate 和 endDate之间一个随机日期返回。
	public static Date testRondomDate(String beginDate,String endDate) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date start = format.parse(beginDate);
			Date end = format.parse(endDate);
			if(start.getTime()>=end.getTime()){
				return null;
			}
			
			long date = random(start.getTime(),end.getTime());
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
				
	}

	public static long random(long begin, long end) {
		// TODO Auto-generated method stub
		long rtn = begin +(long)(Math.random()*(end-begin));
		if(rtn == begin || rtn == end){
			return (random(begin,end));
		}
		
		return rtn;
	}

	//把date的日期加上随机数（最大是1，最小是5），比如dae是2018-10-01号返回的是 2018-10-15
	public static Date addDate(Date date){
		long d1 = date.getTime();
		long add = (long)(Math.random()*5+1);
		System.out.println(add);
		long time = d1+add*24*60*60*1000;
		return new Date(time);
		
	}
	
	//把date转化为 yyyy-mm-dd格式
	public static String changeformat(Date d){
		String s = new SimpleDateFormat("yyyy-MM-dd").format(d);
		return s;
	}
	
	
}
