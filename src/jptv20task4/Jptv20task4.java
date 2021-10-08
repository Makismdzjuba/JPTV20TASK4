
package jptv20task4;

public class Jptv20task4 {

    public static void main(String[] args) {
        int mas1 [] = new int [100];
        for (int i = 0; i < mas1.length; i++) {
            mas1 [i] = (int)(Math.random()*100) +1;
        } 
        System.out.println("Mассивы: ");
        for (int i = 0; i < mas1.length; i++) {
            
        if (i % 10 == 0 && i > 0) {
            System.out.println();
        }
        System.out.print(mas1[i] + " ");
    }
        int sumMas1 = 0;
        for (int i = 0; i < mas1.length; i++) {
            sumMas1 = sumMas1 + mas1[i];
        }
        System.out.println("");
        System.out.println("Сумма массива = " + sumMas1);
        int avarageMas1 = sumMas1 / mas1.length;
        System.out.println("Среднее арифмитическоe = " + avarageMas1);
        
    }
    
}
