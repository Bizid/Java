/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advarithmetic;

/**
 *
 * @author lassaad
 */
public class Calculator  implements AdvancedArithmetic{
    @Override
    public int divisorSum(int n){
            // n;
            System.out.print("DD" + n);
            int sum = 0;
            
            for (int i = 1; i <= n; i++) {
                System.out.print("EE");
                if (n % i == 0) {
                   System.out.print(i + " , ");
                   sum = sum + i;
                }
            }
            return sum;
        }
    
}
