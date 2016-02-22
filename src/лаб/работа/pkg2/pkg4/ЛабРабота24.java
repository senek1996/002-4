/*
 * Эта прога выводит минимальное из 2-х чисел
 */
package лаб.работа.pkg2.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ЛабРабота24 {

    
    public static int min(int a, int b) {
        if (a>b) return b;
        else return a;
    }
    
    public static void main(String[] args) {
        
        String abcd="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNMйцукенгшщзхъфывапролджэячсмитьбюЙЦУКЕНГШЩЗХЪФЫВАПРОЛДЖЭЧСМИТЬБЮ";
      
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s1 = null;

        System.out.print("Введите 1-е число: ");
        
        try {
            s1 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }


        String s2 = null;

        System.out.print("\nВведите 2-е число: \n");

        try {
            s2 = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex) {
            System.out.println("\nОшибка считывания.");
        }
        
        for (int i=0; i<abcd.length(); i++) {
                if ((s1.contains(""+abcd.charAt(i))) || (s2.contains(""+abcd.charAt(i)))) {
                System.out.print("Неправильные числа");
                return;
            }
        }
        
        int m=Integer.parseInt(s1);
        int n=Integer.parseInt(s2);
        int k=min(m,n);
        System.out.println("Минимум: "+k);
        
    }
    
}
