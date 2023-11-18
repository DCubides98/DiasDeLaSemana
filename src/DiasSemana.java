import java.util.Scanner;

public class DiasSemana {

public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa un numero del 1 al 7: ");
    int numDia = scanner.nextInt();

    String[] diasdelasemana={"","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

    if (numDia >=1 && numDia <=7){
        System.out.println("El dia de la semana es: " + diasdelasemana[numDia]);
    } else {
        System.out.println("El numero no es valido");
    }

scanner.close();

}

}