package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.xml.crypto.Data;

//�����������ϰд����2018-10-1��2018-10-20֮�������
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

	//��beginDate �� endDate֮��һ��������ڷ��ء�
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

	//��date�����ڼ���������������1����С��5��������dae��2018-10-01�ŷ��ص��� 2018-10-15
	public static Date addDate(Date date){
		long d1 = date.getTime();
		long add = (long)(Math.random()*5+1);
		System.out.println(add);
		long time = d1+add*24*60*60*1000;
		return new Date(time);
		
	}
	
	//��dateת��Ϊ yyyy-mm-dd��ʽ
	public static String changeformat(Date d){
		String s = new SimpleDateFormat("yyyy-MM-dd").format(d);
		return s;
	}
	
	
}
