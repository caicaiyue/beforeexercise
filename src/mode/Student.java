package mode;

import java.util.Date;

public class Student {
	//�������������췽��������������-  
    //��Ĭ�ϵĹ��췽����  
	public String name;
	protected int age;
	char sex;
	private String phoneNum;
	
	
    Student(String str){ 
    	name = str;
        System.out.println("(Ĭ��)�Ĺ��췽�� s = " + str);  
    }  
      
    //�޲ι��췽��  
    public Student(){  
        System.out.println("�����˹��С��޲ι��췽��ִ���ˡ�����");  
    }  
      
    //��һ�������Ĺ��췽��  
    public Student(char name){  
        System.out.println("������" + name);  
    }  
      
    //�ж�������Ĺ��췽��  
    public Student(String name ,int age){  
        System.out.println("������"+name+"���䣺"+ age);//���ִ��Ч�������⣬�Ժ�����  
    }  
      
    //�ܱ����Ĺ��췽��  
    protected Student(boolean n){  
        System.out.println("�ܱ����Ĺ��췽�� n = " + n);  
    }  
      
    //˽�й��췽��  
    private Student(int age){  
        System.out.println("˽�еĹ��췽��   ���䣺"+ age);  
    }  
    
    public String toString(){
    	return "Student[name=" +name +",age=" +age+",sex=" +sex+",phoneNumber"+phoneNum+"]";
    }
		
    	
   // }
    
    public void show1(String s){  
        System.out.println("�����ˣ����еģ�String������show1(): s = " + s);  
        this.name = s;
    }  
    protected void show2(){  
        System.out.println("�����ˣ��ܱ����ģ��޲ε�show2()");  
    }  
    void show3(){  
        System.out.println("�����ˣ�Ĭ�ϵģ��޲ε�show3()");  
    }  
    private String show4(int age){  
        System.out.println("�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = " + age); 
        this.age=age;
        return "abcd";  
    }  
}