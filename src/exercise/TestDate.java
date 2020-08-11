package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = CreateBeginDate("2018-11-20","2018-12-10");
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.format(d));
		Date d2 = CreateEndDate(d,5);
		System.out.println(f.format(d2));
	}

	public static Date CreateBeginDate(String begindate,String enddate){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date begin = format.parse(begindate);
			Date end = format.parse(enddate);	
			if(begin.getTime()>=end.getTime()){
				return null;
			}
			long date = getrandom(begin,end);
			return new Date(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static long getrandom(Date start,Date end){
		long ls = start.getTime();
		long le = end.getTime();
		long r = ls+(long)(Math.random()*(le-ls));
		if(r == ls||r == le){
			return(getrandom(start,end));
		}
		return r;
		
	}
	
	
	public static Date CreateEndDate(Date d, int i) {
		// TODO Auto-generated method stub
		long ls = d.getTime();
		long le = ls +(long)((Math.random()*i)*24*60*60*1000);
		if(le==ls){
			return (CreateEndDate(d,i));
		}
		Date endday = new Date(le);
		return endday;
	}

}
