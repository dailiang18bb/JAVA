# HackerRank_JAVA
note what I learned from doing the JAVA exercise on HackerRank

# Primitive Data Types
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html


# Static Variables and Variables
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html

# Static initialization blocks and initialization blocks
https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html

    //execute very first and only once
    Static initialization blocks: Static{}
    
    //execute after Static{} and execute every time you call the class
    initialization blocks       : {}        
    
# Static Variables and variables
动态变量在子程序中，每次调用都会从它的初始值开始调用，而不管他在函数中经历了什么变化；静态变量会从变化后的值继续改变。

# Exception 
	static boolean flag = true;
	static int B, H;
	static {
		Scanner in = new Scanner(System.in);
		B = in.nextInt();
		H = in.nextInt();
		in.close();
		try {
			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		} catch (Exception e) {
			System.out.println(e);
			//System.exit(0);
		}
	}
