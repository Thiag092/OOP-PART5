import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class AplicacionFacultad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionFacultad
{
    public static void main (String [] args){
        //Instanciamos una lista de cargos para un profesor----------------------
        ArrayList listaCargos1=new ArrayList();
        
        //Instanciamos una lista de profesores que trabajan en la facultad--------------------------
        ArrayList listaProfesores1=new ArrayList();
        
        //Instanciamos una fecha de nacimiento del profesor---------------------------
        Calendar fecha1=new GregorianCalendar(1992,12,12);
        
        //Aca creamos tres cargos, que es el maximo admitido por cada profesor,todos de
        //distinto tipo------------------------------------------------------------------------
        Cargo cargo1=new Cargo("JTP-Programación OO", 200000,2020,10);
        SemiExclusivo cargoSemi1=new SemiExclusivo("Titular-TFA -",300000,2018,10,10);
        Exclusivo cargoExclusivo1=new Exclusivo("JTP-Analisis de Sistemas",400000,2019,20,10,10);
        
        //Agregamos los cargos a la lista de cargos instanciada anteriormente-------------------
        listaCargos1.add(cargo1);
        listaCargos1.add(cargoSemi1);
        listaCargos1.add(cargoExclusivo1);
        
        //Instanciamos un profesor, pasando como parametros la lista cargada en el paso anterior----
        Profesor profe1=new Profesor(123123,"Juan","Gomez",fecha1,"Ing. en Sistemas",listaCargos1);
        
        //A la lista de profesores instenciada antes, le sumamos le profesor instanciado en el paso
        //anterior con todos sus cargos------------------------------------------------------
        listaProfesores1.add(profe1);
        
        //Instanciamos una facultad a la cual le pasamos la lista de profesores que trabajan ahi con
        //todos los cargos que tienen---------------------------------------------------
        Facultad facultad1=new Facultad("UNNE",listaProfesores1);
        
        //Se ejecuta el metodo que muestra la nomina de profesores de la facultad--------------------
        facultad1.nominaProfesores();
        
        //Ejecutamos el metodo que muestra la lista de profesores con todos sus datos, tales como
        //sueldo de cada cargo, sueldo total a pagar, horas, antiguedad, etc---------------------
        facultad1.listarProfesorCargos();
        //--------------------------------------------------------------------------------------------
        //Instanciamos un nuevo profesor, repitiendo los pasos anteriores, para sumarlo a la nomina
        //de profesores de la facultad con sus respectivos cargos-------------------
        System.out.println("\n************AGREGAMOS UN NUEVO PROFESOR A LA NOMINA************-----------------------------------------------------------------------");
        ArrayList listaCargos2=new ArrayList();
        Calendar fecha2=new GregorianCalendar(2000,12,12);
        Cargo cargo2=new Cargo("Prof. Paradigmas", 10000,2013,10);
        SemiExclusivo cargoSemi2=new SemiExclusivo("Titular-Sistemas Operativos -",50000,2021,10,10);
        Exclusivo cargoExclusivo2=new Exclusivo("JTP-Algebra",40000,2022,20,10,10);
        
        listaCargos2.add(cargo2);
        listaCargos2.add(cargoSemi2);
        listaCargos2.add(cargoExclusivo2);
        Profesor profe2=new Profesor(321321,"Carlos","Sanchez",fecha2,"Lic. en Sistemas",listaCargos2);
        facultad1.agregarProfesor(profe2);
        facultad1.nominaProfesores();
        System.out.println("\n*****************");
        facultad1.listarProfesorCargos();
        
    }
}
