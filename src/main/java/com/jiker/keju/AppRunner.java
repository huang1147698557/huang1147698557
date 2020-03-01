package com.jiker.keju;

public class AppRunner {
    int receipt = 0;
    public static void main(String[] args) {
        /*TODO
          1. args[0]为resources下的测试数据文件名，例如传入的args[0]值为"testData.txt"，注意并不包含文件路径。
          2. 你写的程序将把testDataFile作为参数加载此文件并读取文件内的测试数据，并对每条测试数据计算结果。
          3. 将所有计费结果拼接并使用\n分割，然后保存到receipt变量中。
         */
        String testDataFile = args[0];
//        String receipt = "";
        System.out.println("receipt");
    }

    public int getPrice(int x,int y) {
        if(y==0){
            if (x<=2) {
                receipt=6;
            }else if (x<=8&&x>2){
                receipt = (int) Math.round(6+(x-2)*0.8);
            }else if (x>8){
                receipt = (int) Math.round(6+(x-2)*0.8+(x-8)*0.5);
            }
            return receipt;
        }else if (y!=0){
            if (x<=2){receipt=(int) Math.round(6 + 0.25*y);}
            else if (x<=8&&x>2){receipt = (int) Math.round(6+(x-2)*0.8 + 0.25*y);}
            else if (x>8){receipt = (int) Math.round(6+(x-2)*0.8+(x-8)*0.5 + 0.25*y);}
        }
        return receipt;
    }
}
