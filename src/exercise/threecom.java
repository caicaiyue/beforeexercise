package exercise;

public class threecom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] back = new boolean[7][7];
		createcom(back);
		finetrue(back);
	}
	
	public static void createcom(boolean[][] back){
		int column = back[0].length;
		int line = back.length;
		
		for(int i=0;i<back.length;i++){
			for(int j=0;j<back[i].length;j++){
				back[i][j]=false;
			}
		}
		
		int comAcolumn = (int)(Math.random()*10);
		int comAline = (int)(Math.random()*10);
		
		while(comAcolumn>column-1||comAline>line-1){
			comAcolumn = (int)(Math.random()*10);
			comAline = (int)(Math.random()*10);
		}
		
		
		for(int i=0;i<3;i++){
				back[comAline][comAcolumn]=true;
				comAline++;
			if(comAline>line-1){
				comAline = comAline-3;
			}
		}
		
		
	}
	
	
	public static void finetrue(boolean[][] back){
		int amount = 0;
		for(int i=0;i<back.length;i++){
			for(int j=0;j<back[i].length;j++){
				if(back[i][j]==true){
					System.out.println(i+" "+j);
				}
				
			}
		}
		System.out.println(amount);
	}

}
