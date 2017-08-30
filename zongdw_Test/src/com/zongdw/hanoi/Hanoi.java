package com.zongdw.hanoi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hanoi {
    
    /** 
     * Method Name: main <br>
     * Description: TODO <br> 
     * @param
     * @return 
     * @throws IOException 
     * @throws NumberFormatException 
     * @since JDK 1.6
     */
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        int n;
        BufferedReader buf = 
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入盘数：");
        n = Integer.parseInt(buf.readLine());
        Hanoi hanoi = new Hanoi();
        hanoi.move(n, 'A', 'B', 'C');
    }
    /** 
     * Method Name: move <br>
     * Description: 汉诺塔移动 ：把n个盘子从a借助b移动到c上<br> 
     * @param n:盘子数；a:初始的柱子；b:借助的柱子；c:要移动到的柱子
     * @return 
     * @since JDK 1.6
     */
    public void move(int n, char a, char b, char c) {
            if (n == 1)
                System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
            else {
                move(n - 1, a, c, b);
                System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
                move(n - 1, b, a, c);
            }
        }
    
}
