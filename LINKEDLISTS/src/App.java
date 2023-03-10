
import java.util.*;


public class App {
    private List lst;
    private int info=11;
    private int initialinfo=0;
    private String menu;
    private Scanner sc;

public App(){
        this.lst= new List();
        this.sc = new Scanner(System.in); 
        this.menu =
            "Listas enlazdas \n" +
            "1. Crear listas \n"+
            "2. Imprimir lista \n" +
            "3. Agregar nodos al inicio \n" +
            "4. Agregar nodos al final \n" +
            "5. Buscar nodo \n" +
            "6. Borrar nodo inicial \n" +
            "7. Borrar nodo final\n" + 
            "8. salir\n";

        }
public void displayMenu(){
    int number =0;
    do{
        System.out.println(menu);
        number = sc.nextInt();
        switch(number){
            case 1:this.createlist(); break;
            case 2:System.out.println(this.lst.print()); break;
            case 3:this.unshiftNode();break;
            case 4:this.pushNode();break;
            case 5:this.searchNode();break;
            case 6:this.shiftNode();break;
            case 7:this.popNode();break;
            case 8:System.out.println("Adios");break;
            default:System.out.println("Opcion incorrecta"); break;
        }
    }while(number !=8);
}
/**
 * Crea una lista con 10 nodos del 1 al 10. 
 */
public void createlist(){
    this.lst = new List();
    for(int info=1; info <=10; info ++)
        this.lst.push(info);
    System.out.println(this.lst.print());

}
/**
 * Agregar dato al inicio.
 */
public void unshiftNode(){
    this.lst.unshift(initialinfo);
    --initialinfo;
    System.out.println(this.lst.print());
}
/**
 * Agrega nodo al final. 
 */
public void pushNode(){
    info ++;
    this.lst.push(info);
    System.out.println(this.lst.print());
}
/**
 * Buscar nodo. 
 */
public void searchNode(){
    int n=0;
    System.out.println("Digita el numero a buscar");
    n=sc.nextInt();
    if(this.lst.search(n)){
        System.out.println("Valor encontrado");
    }else{
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
}
/**
 * Eliminar primer nodo;
 */
public void shiftNode(){
    if (this.lst.shift()){
        System.out.println("Nodo eliminado");
    }else{
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
}
/**
 * Elimina el ultimo elemento de la lista 
 */
public void popNode(){
    if(this.lst.pop()){
       System.out.println("Nodo eliminado");
    }else{
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
}
/**
 * 
 */
public static void main(String[]args){
    App list = new App();
    list.displayMenu();
}



}
