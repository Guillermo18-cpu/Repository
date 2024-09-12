import java.util.Scanner;

public class main { 
  public static void main(String[] args){ 

    Scanner sc = new Scanner(System.in);

    float altura, base, area;
    System.out.println("Ingresa la altura del triangulo: ");
   altura= sc.nextFloat();      
    System.out.println("Ingresa la base del triangulo: ");
    base= sc.nextFloat();
    area= (base*altura)/2;
    System.out.println("El area del triangulo es: "+area);
    
  }
    }