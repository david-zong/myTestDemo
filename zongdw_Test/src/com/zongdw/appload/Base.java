package com.zongdw.appload;

public class Base {
	private String baseName = "base";

	public Base() {
		callName();
	}

	public void callName() {
		System.out.println("base:" + baseName);
	}

	static class Sub extends Base {
		private String baseName = "sub";

		public void callName() {
			System.out.println("sub:" + baseName);
		}
	}

	public static void main(String[] args) {
		Base base = new Sub();
	}
}

/**
 *求这段程序的输出。
【良言一句：同志们，别小看了这部分代码，接下来慢慢解析从类加载器开到最后的输出这么个漫长的过程JVM他是怎么处理的】
1、我们还是先从类加载开始说起。当这个类被编译通知后，会在相应的目录下生成两个.class 文件。一个是　Base.class,另外一个就是Base$Sub.class。这个时候类加载器将这两个.class  文件加载到内存
2、静态代码块优先执行，因此先执行Sub  类中的代码，Sub类中没有静态代码块
【注意-1】先后顺序，是先子在--->在父类，【注意-2】字段的值是放在构造器中，按代码顺序执行进行初始化操作
3、一切初始化（字节码文件该加载的都加载完成）完毕，进入main方法--看到这里的童鞋们，千万别眨眼，关键的地方上演了--左边Base b，在这里的代码中，等于就是说了一句废话，直接可跳跃，从 new Sub()开始，这个时候会调用Sub类的隐式构造函数。这个隐式构造函数是JVM无偿拱手让给你的。还原Sub  类中的构造函数的本质如下：
 public Sub(){
　　super();//始终在构造函数中的第一行，为什么呢？这是因为在一些软件的升级中，要兼容老版本的一些功能，父类即原先的一些初始化信息也要保证被执行到，再执行当前
　　baseName = "sub";
}
4、好了，这个时候执行super()这行代码也就是跑到父类中去执行了，这个我们要到父类中的构造方法中来瞧瞧。public Base(){callName();}，同样，我们需要需要还原这段代码的本质：
public Base(){
　　baseName = "base";//4.1 java里面没有字段的重写，只有方法名的重写，因此这个时候先给父类的字段baseName 分配好内存空间再给baseName 字段进行的赋值　　　
　　callName();//4.2 callName（）方法的调用。这里有一个执行细节需要大家注意：当在父类中方法的执行时，执行的原则是：子类有重写，执行子类，子类没有重写，则在执行父类）。这个时候调用的就是子类的callName 方法了，
}
5、子类的callName方法执行，打印输出的是子类的baseName 字段的值，而这个时候子类的构造函数中字段的赋值还未执行，因此这个时候输出的null
6、父类的构造函数执行完毕，这个时候又回到子类当中，从super()的下一行继续执行，这个时候才进行该字段baseName 分配好存储空间，随后赋其值。

 *
 */
