package test;

public class PlayGround_004 {
	
	private static abstract class RootClass{
		void report(){
			System.out.println("print from rootClass");
		}
		
		abstract void run();
	}
	
	private static abstract class NewsReport extends RootClass {
		
		@Override
		void report() {
			super.report();
			System.out.println("new method include super method");
		}
	}

	
	
	public static void main(String args[]) {
		
		NewsReport TodayNews = new NewsReport() {
			@Override
			void report() {
				// TODO Auto-generated method stub
				super.report();
				System.out.println("Only me method");
			}
			
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("abstract method ");
			}
		};
		TodayNews.report();
		TodayNews.run();
		
		System.out.println("..................................");
		
		RootClass bookReport = new RootClass() {
			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("abstract method ");
				
			}
		};
		bookReport.report();
		bookReport.run();
	}
}
