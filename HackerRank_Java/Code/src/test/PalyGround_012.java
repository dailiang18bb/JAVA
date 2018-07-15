package test;

import java.util.ArrayList;

public class PalyGround_012 {
	public static void main(String[] args) {
		build();
	}
	
	public static ArrayList<Integer> build() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(7);
		
		// xx
		for(int i=1 ; i< 10; i++) {
			arrayList.add(i+i*10);
		}
		
		//xxx
		for(int i = 1; i<10; i++){
			for(int j = 0; j<10;j++) {
				arrayList.add(i*100 + j *10 + i);
			}
		}
		
		//xxxx
		for(int i= 1;i<10;i++) {
			for(int j= 0;j<10;j++) {
				arrayList.add(i*1000 + j *100 +j*10 + i);
			}
		}
		
		// xxxxx
		for(int i= 1;i<10;i++) {
			for(int j= 0;j<10;j++) {
				for(int k = 0;k<10;k++)
				arrayList.add(i*10000 + j *1000 +k*100 + j*10 + i);
			}
		}
		
		// xxxxxx
		for(int i= 1;i<10;i++) {
			for(int j= 0;j<10;j++) {
				for(int k = 0;k<10;k++)
				arrayList.add(i*100000 + j *10000 +k*1000 + k*100 + j*10 + i);
			}
		}
		
		// xxxxxxx
		for(int i= 1;i<10;i++) {
			for(int j= 0;j<10;j++) {
				for(int k = 0;k<10;k++)
					for(int y = 0; y<10; y++) {
						arrayList.add(i*1000000 + j *100000 +k*10000 + y*1000 + k*100 + j*10 + i);
					}
			}
		}
		
		// xxxxxxxx
		for(int i= 1;i<10;i++) {
			for(int j= 0;j<10;j++) {
				for(int k = 0;k<10;k++)
					for(int y = 0; y<10; y++) {
						arrayList.add(i*10000000 + j *1000000 +k*100000 + y*10000 + y*1000 + k*100 + j*10 + i);
					}
			}
		}
		
		// xxxxxxxx
				for(int i= 1;i<10;i++) {
					for(int j= 0;j<10;j++) {
						for(int k = 0;k<10;k++)
							for(int y = 0; y<10; y++) {
								for(int q = 0; q<10; q++)
								arrayList.add(i*100000000 + j *10000000 +k*1000000 + y*100000+ q*10000 + y*1000 + k*100 + j*10 + i);
							}
					}
				}
		
		arrayList.sort(null);
		
		//print
		for(int x:arrayList) {
			System.out.println(x);
		}
		
		return arrayList;
	}

}
