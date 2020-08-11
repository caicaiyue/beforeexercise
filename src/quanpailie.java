import java.util.LinkedList;

public class quanpailie {
	private static void allPermutation(char[] c, LinkedList<String> listStr, int start){

	    if(start == c.length-1)
	        listStr.add(String.valueOf(c));//System.out.println(String.valueOf(c));
	    else{
	        for(int i = start; i <= c.length-1; i++)
	        {
	            //只有当没有重叠的字符 才交换
	            if(!isSwap(c, start, i))
	            {
	                swap(c, i, start);//相当于: 固定第 i 个字符
	                allPermutation(c, listStr, start+1);//求出这种情形下的所有排列
	                swap(c, start, i);//复位
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

	//[start,end) 中是否有与 c[end] 相同的字符
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
	    //保存所有的全排列
	    LinkedList<String> listStr = new LinkedList<String>();

	    allPermutation(str.toCharArray(), listStr, 0);

	    System.out.println(listStr);//打印全排列
	}
	public static void main(String[] args) {
	    allPermutation("1232");
	}
}
