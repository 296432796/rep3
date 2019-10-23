package com.turing.sping02;

public class PrintHouse {


    //依赖打印机
    private Printer printer;

    public PrintHouse() {

        printer = new PinPrinter();

    }

    /**
     * 提供服务
     */
    public void service() {
        printer.print();

    }

    public static void main(String[] args) {

        PrintHouse house = new PrintHouse();
        house.service();

    }
}
