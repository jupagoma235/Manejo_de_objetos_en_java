package com.mycompany.manejo_de_clases_y_objetos_en_java;

public class Computer{
//variables nativas de la clase computador

String type;
String brand;
String processor;
String state;
int memory, hd, screen;    

//constructor
public Computer(){
 this.type = "Escritorio";
 this.brand = "Generico";
 this.processor = "Intel 386";
 this.memory = 4; //gigas
 this.hd = 256; //gigas
 this.screen = 21; //pulgadas
 this.state = "Apagado";
}

//funcion llamada desde Main para cambiar las propiedades del objeto
public void Computer( String type, String brand, String processor, int memory,int hd, int screen){
 this.type = type;
 this.brand = brand;
 this.processor = processor;
 this.memory = memory; //gigas
 this.hd = hd; //gigas
 this.screen = screen; //pulgadas
}

//funcion que imprime las caracteristicas del objeto
public void View_Computer(){
    System.out.println("#####   EQUIPO DE COMPUTO ACTUAL   #####");
    System.out.println("----------------------------------------");
    System.out.println("Caracteristicas");
    System.out.println("Tipo       = " + this.type);
    System.out.println("Marca      = " + this.brand);
    System.out.println("Pantalla   = " + this.screen + " pulgadas");
    System.out.println("----------------------------------------");
    System.out.println("Configuración");
    System.out.println("Procesador = " + this.processor);
    System.out.println("Memoria    = " + this.memory + " gigas");
    System.out.println("Disco duro = " + this.hd + " gigas");
    System.out.println("----------------------------------------");
    System.out.println("Estado     = " + this.state);  
    System.out.println("----------------------------------------");
}

//funcion que cambia el estado del objeto
public void state(String state){
    if(this.state==state){System.out.println("El equipo ya se encontraba en estado " + state);}
    else{
     this.state= state;
     System.out.println("cambio de estado realizado ");
     View_Computer(); 
    }
    
}

}