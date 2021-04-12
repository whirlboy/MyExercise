package com.yzc.gof.DecoratorPattern;


import com.yzc.gof.DecoratorPattern.myDecorator.FolderA;
import com.yzc.gof.DecoratorPattern.myDecorator.FolderB;
import com.yzc.gof.DecoratorPattern.myDecorator.FolderDecorator;

/**
 * <p>装饰者模式测试</p>
 */
public class DecoratorTest {

	public static void main(String[] args){
		
		/**
		 * 扩展在Windows系统中的文件创建和删除功能
		 */
		FolderA folderA = new FolderA();
		FolderDecorator folderDecoratorA = new FolderDecorator(folderA);
		folderDecoratorA.mkDir();
		folderDecoratorA.rmdir();
		
		System.out.println("============= 分割线 =============");
		
		/**
		 * 扩展在Linux系统中的文件创建和删除功能
		 */
		FolderB folderB = new FolderB();
		FolderDecorator folderDecoratorB = new FolderDecorator(folderB);
		folderDecoratorB.mkDir();
		folderDecoratorB.rmdir();
		
		/**
		 * 好处：动态扩展类的功能，原始类无需做修改，只需增加一个装饰类即可实现
		 * 坏处：相似类的对象创建的过多，比如，扩展的功能很少，你是会选择增加一个装饰类呢，还是在原有类中直接做修改呢？
		 * 
		 * 如果考虑到设计模式的开闭原则：即对扩展开放，对修改关闭，那么牺牲一点内存空间达到类功能的扩展也是很有必要的
		 */
		
	}
}
