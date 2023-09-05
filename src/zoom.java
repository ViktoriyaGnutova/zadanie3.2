import java.util.Scanner;

public class zoom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите текст:");
        String a=in.nextLine();
        a=a.replaceAll("[^а-яА-Я]+","").toLowerCase();
        String b="";
        String[] a1=a.split("");
        for(int i=a1.length-1;i>=0; i--){
            b += a1[i];
        }
        if(a.equals(b)){
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}