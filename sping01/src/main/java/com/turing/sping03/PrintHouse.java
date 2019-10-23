package com.turing.sping03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrintHouse {


    //依赖打印机
    private Printer printer;

    public PrintHouse() {

        printer = new PinPrinter();

    }

    //构造器
    public PrintHouse(Printer printer) {
        this.printer = printer;
    }


    //set属性
//	public void setPrinter(Printer printer) {
//		this.printer = printer;
//	}

    /**
     * 提供服务
     */
    public void service() {
        printer.print();

    }

    public static void main(String[] args) {
		
		/*
		 * PrintHouse house=new PrintHouse();
		 	house.service();
		 
		 */
        //使用Sping
        //获取Spring容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/turing/sping03/config.xml");
        //从容器中获取Bean

        //---------------------找打印机-------------------------------------------

        //1、通过类型查找-必须类型唯一
			/*PinPrinter pinPrinter = ctx.getBean(PinPrinter.class);
			pinPrinter.print();
			//接口
			Printer printer=ctx.getBean(PinPrinter.class);
			printer.print();
*/
        //2、通过名称查找
		/*
		 * Printer printer = (Printer) ctx.getBean("PinPrinter");
		printer.print();
 */
        //3、通过名称和类型查找
        //Printer bean = ctx.getBean("PinPrinter", Printer.class);
        //bean.print();

        //---------------------找图文店--------------------------------------------
        PrintHouse printHouse = ctx.getBean(PrintHouse.class);
//			//调用方法
        printHouse.service();


    }
}
