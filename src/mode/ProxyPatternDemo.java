package mode;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("test_10mb.jpg");
		 
	      // ͼ�񽫴Ӵ��̼���
	     image.display(); 
	      System.out.println("");
	      // ͼ����Ҫ�Ӵ��̼���
	      image.display();  
	}

}
