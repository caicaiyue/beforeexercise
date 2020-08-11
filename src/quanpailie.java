import java.util.LinkedList;

public class quanpailie {
	private static void allPermutation(char[] c, LinkedList<String> listStr, int start){

	    if(start == c.length-1)
	        listStr.add(String.valueOf(c));//System.out.println(String.valueOf(c));
	    else{
	        for(int i = start; i <= c.length-1; i++)
	        {
	            //ֻ�е�û���ص����ַ� �Ž���
	            if(!isSwap(c, start, i))
	            {
	                swap(c, i, start);//�൱��: �̶��� i ���ַ�
	                allPermutation(c, listStr, start+1);//������������µ���������
	                swap(c, start, i);//��λ
	            }
	        }
	    }
	}

	private static void swap(char[] c, int i, int j){
	    char tmp;
	    tmp = c[i];
	    c[i] = c[j];
	    c[j] = tmp;
	}

	//[start,end) ���Ƿ����� c[end] ��ͬ���ַ�
	private static boolean isSwap(char[] c, int start, int end)
	{
	    for(int i = start; i < end; i++)
	    {
	        if(c[i] == c[end])
	            return true;
	    }
	    return false;
	}

	public static void allPermutation(String str){
	    if(str == null || str.length() == 0)
	        return;
	    //�������е�ȫ����
	    LinkedList<String> listStr = new LinkedList<String>();

	    allPermutation(str.toCharArray(), listStr, 0);

	    System.out.println(listStr);//��ӡȫ����
	}
	public static void main(String[] args) {
	    allPermutation("1232");
	}
}
