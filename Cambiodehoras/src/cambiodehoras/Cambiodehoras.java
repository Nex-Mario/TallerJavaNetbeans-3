/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiodehoras;

/**
 *
 * @author ESTUDIANTE
 */
public class Cambiodehoras {

    public static void main(String[] args) {
        int hora_militar = 18;
        int minutos = 59;
        int hora_pm;
        String ampm;
        
        if(hora_militar>12){
            hora_pm = hora_militar - 12;
            ampm="pm";
        }else{
            hora_pm = hora_militar;
            ampm = "am";
        }
        
        System.out.println("hora militar: " + hora_pm+":"+minutos+ampm);
        System.out.println("Hora am-pm: " + hora_militar+":"+ minutos+ampm);    
    }
    
}
