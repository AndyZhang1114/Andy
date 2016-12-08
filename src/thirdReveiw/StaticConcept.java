package thirdReveiw;

class T{
	
	int instanceVar = 32; 
	/*
	 内存空间：只有创建对象后，实例变量才会被分配空间。每创建一个实例，java虚拟机就会为实例变量分配一次内存，实例变量位于堆区中。
	 实例变量：每创建一个对象，就被初始化一次，例如初始值为32，每次创建对象时执行++，值变为33，但是下次创建新的对象时，又被初始化为你最初给定的值32
	 属       性：属于具体的对象， 每个对象都有属于自己的实例变量；
	 生命周期：随对象而生，随对象而灭；
	 */
	
	static int staticVar = 0; 
	/*
	 内存空间：java虚拟机在加载类的过程中为静态变量分配内存，静态变量位于方法区，被类的所有实例共享;静态变量在内存中是唯一的，可以统计数字，例如统计一共创建了多少个对象。 
	  静态变量：因为是唯一的，所以每次++后，数字都会递增。
	 属       性：属于类，不属于对象；
	 生命周期：随类而生，随类而灭；
	 */
	
	T(){
		System.out.println("instanceVar = " + (++instanceVar));
		System.out.println("staticVar = " + (++staticVar));
		System.out.println();
	}
	
	//静态方法， 可以直接通过类名调用， 语法：（class_name.mehtod_name）
	static void staticPrint() {
		System.out.println("You can use static method withou any object");
	}
	
	//非静态方法,或者说是实例方法，必须创建对象后，通过对象调用，语法：object_name.method_name;
	void instancePrint() {
		System.out.println("You must instance an object, then you can use a non-static method");
		
	}
	
	
}

class F{
		
		private int num;
		
		F(){
			num = 0;
		}
	
		//非静态方法,或者说是实例方法，必须创建对象后，通过对象调用，语法：object_name.method_name;
		int count(int i) {
			return i;
		}
		//静态方法， 可以直接通过类名调用， 语法：（class_name.mehtod_name）
		static int countInStackMethod(int i) {
			return i;
		}
	
}
public class StaticConcept {

	public static void main(String[] args) {
		
		T.staticPrint(); // 静态方法
		
		//T.instancePrint(); //Error 
			
		T t1 = new T();
		
		T t2 = new T();
		
		T t3 = new T();
		
		T t4 = new T();
		
		// 通过对象访问的实例变量，是属于这个对象自己的实例变量，例如 t1的实例变量++后，变为34
		System.out.println("After ++, instanceVar of t1 is " + (++t1.instanceVar));
		
		// 但是t2的实例变量，并没有变化,尽管变量名字是一样的，都为instanceVar。
		System.out.println("InstanceVar of t2 is" + (t2.instanceVar));
		
		// 使用静态变量，统计创建对象的数量
		System.out.println("\nYou have instnced " + T.staticVar + " objects");
		
		//static
		long sumInStaticMethod = 0;
		
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			sumInStaticMethod += F.countInStackMethod(i);
		}
		long end1 = System.currentTimeMillis();
		long useTimeInStaticMethod = end1 - start1;
		System.out.println(sumInStaticMethod);
		System.out.println("Using static method need time: " + useTimeInStaticMethod);
		
		long sumInNonStaticMethod = 0;
		long start2 = System.currentTimeMillis();
		
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			F f = new F();
			sumInNonStaticMethod += f.count(i);
		}
		long end2 = System.currentTimeMillis();
		long useTimeInNonStaticMethod = end2 - start2;
		System.out.println(sumInNonStaticMethod);
		System.out.println("Using non static method need time: " + useTimeInNonStaticMethod);
		
		//Long sum = 0L;
		long sum = 0l;
		long start3 = System.currentTimeMillis();
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long end3 = System.currentTimeMillis();
		long useTime = end3 - start3;
		System.out.println(sum);
		System.out.println("Using non static method need time: " + useTime);
		
		
	}
}
