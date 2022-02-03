// * @author Juan Pablo Gonzalez Marin
import java.util.Scanner;
import com.mycompany.manejo_de_clases_y_objetos_en_java.Computer;

public class Main {
   
    public static void main(String[] args) {
        Computer comp= new Computer();
        Scanner sn = new Scanner(System.in);
        int opc=0, i=0, memory=0, hd=0, screen=0;
        String type="", brand="", processor="", state="";
        System.out.println("Bienvenido, esto es una simulacion del objeto computador");
          
        System.out.println("Para ver la configuración estandar presione 1, si desea configurar su equipo presione 2");
        opc=sn.nextInt();
        switch (opc){
            case 1: comp.View_Computer();
                 break;
            case 2:
                 for(i=0;i<6;i++){
                 switch (i){
                      case 0: 
                           System.out.println("Ingrese el tipo de computador - 1 Escritorio - 2 Portatil - 3 Servidor");
                           opc=sn.nextInt();
                           if(opc==1){type= "Escritorio";}if(opc==2){type= "Portatil";}if(opc==3){type= "Servidor";}    
                           break; 
                         case 1: 
                           System.out.println("Ingrese la marca del equipo - 1 Hewlet Packard - 2 Asus - 3 Dell");
                           opc=sn.nextInt();
                           if(opc==1){brand= "Hewlet Packard";}if(opc==2){brand= "Asus";}if(opc==3){brand= "Dell";}    
                           break;
                         case 2: 
                           System.out.println("Ingrese el tipo de procesador - 1) Intel 2DUO - 2) Intel Core i5 - 3) Intel Core i9");
                           opc=sn.nextInt();
                           if(opc==1){processor= "Intel 2DUO";}if(opc==2){processor= "Intel Core i5";}if(opc==3){processor= "Intel Core i9";}    
                           break;
                         case 3: 
                           System.out.println("Ingrese la cantidad de memoria en GB - 1) 4 - 2) 8 - 3) 16");
                           opc=sn.nextInt();
                           if(opc==1){memory= 4;}if(opc==2){memory= 8;}if(opc==3){memory= 16;}    
                           break;
                         case 4: 
                           System.out.println("Ingrese el tamaño del disco duro en GB - 1) 250 - 2) 500 - 3) 1024");
                           opc=sn.nextInt();
                           if(opc==1){hd= 250;}if(opc==2){hd= 500;}if(opc==3){hd= 1024;}    
                           break;
                         case 5: 
                           System.out.println("Ingrese el tamaño de la pantalla en pulgadas - 1) 17 - 2) 21 - 3) 24");
                           opc=sn.nextInt();
                           if(opc==1){screen= 17;}if(opc==2){screen= 21;}if(opc==3){screen= 24;}    
                           break;
                         default:
                           break;
                        }
                    }
                 System.out.println("El equipo configurado pasa a ser el estandard");
                 comp.Computer(type, brand, processor, memory, hd, screen);
                 comp.View_Computer();
                 break;
            default: System.out.println("al seleccionar un numero fuera del rango se mostrara el computador por defecto");
                 comp.View_Computer();     
                 break;
            }
            System.out.println("Si desea cambiar el estado del equipo seleccine 1)Apagado, 2)Encendido y 3)Hibernando");
            opc=sn.nextInt();
            switch (opc){
                case 1:
                    state="Apagado";
                    break;
                case 2:
                    state="Encendido";
                    break;
                case 3:
                    state="Hibernando";
                    break;
                default:                    
                    break;
            }
            comp.state(state);
           
    }
}
