package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = GeneratbeginDate("2018-10-01","2018-11-20");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(d));
		Date d1 = CreateendDate(d,10);
		System.out.println(format.format(d1));
	}

	public static Date GeneratbeginDate(String begin,String end){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date begindate = format.parse(begin);
			Date enddate = format.parse(end);
			long lb = begindate.getTime();
			long le = enddate.getTime();
				if(lb>=le){
					return null;
				}
			Date newdate = RandomDate(lb,le);
			return newdate;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public static Date RandomDate(long lb, long le) {
		// TODO Auto-generated method stub
		long r = lb+(long)((Math.random())*(le-lb));
			if(r==lb||r==le){
				RandomDate(lb,le);
			}
		Date d = new Date(r);
		return d;
	}
	
	public static Date CreateendDate(Date d, int i) {
		// TODO Auto-generated method stub
		long lb = d.getTime();
		long le = lb+(long)((Math.random())*i*24*60*60*1000);
		 	if(le==lb){
		 		CreateendDate(d, i);
		 	}
		 Date end = new Date(le);
		return end;
	}

}
