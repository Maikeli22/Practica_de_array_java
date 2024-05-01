
import java.util.Scanner;

public class practica_de_array{
public static void main(String[] args) {
    Scanner te = new Scanner(System.in);
    boolean validar=false; 
    boolean vali=false;
int num,p;
String prueva;
System.err.println("¿cuantos numeros ingresaran el el array");
prueva=te.next();
while(!vali){
       
    
    try {
        p= Integer.parseInt(prueva);
        vali=true;
    } catch (Exception e) {
        System.err.println("este codigo solo es para numeros por favor vuelva a intentarlo");
        prueva=te.next();
    }
    
}
num= Integer.parseInt(prueva);

int auxiliar= num-1;


int array[] = new int [num];

for (int i=0;i<num;i++){
    System.err.println("ingresa el numero");
    prueva=te.next();
    while(!validar){
       
    
        try {
            p= Integer.parseInt(prueva);
            validar=true;
        } catch (Exception e) {
            System.err.println("este codigo solo es para numeros por favor vuelva a intentarlo");
            prueva=te.next();
        }
        
    }
    array[i]= Integer.parseInt(prueva);
   
}
System.err.println("este el el orden invertido de lectura del arrar");
for (int i=0;i<num;i++){
    System.err.println(array[auxiliar]);
    auxiliar=auxiliar-1;
}


    
}

}