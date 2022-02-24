package holamundo;

import java.awt.Color;
import poo.conceptos.basicos.Automovil;

public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("Hola mundo java !!!");
        Persona per1 = new Persona();
        per1.setNombre("Ricardo Landeros");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer(" Hamburguesa hawaiana!!!");

        Persona per2 = new Persona();
        per2.setNombre("Felipe");
        per2.comer(" Pizza hawaiana");
        System.out.println("Nombre per 2:" + per2.getNombre());
        System.out.println("");
        System.out.println("");

        System.out.println("Primer Automovil");
        Automovil miVocho = new Automovil();
        miVocho.setMarca("VW");
        System.out.println("Marca: " + miVocho.getMarca());
        miVocho.setSubMarca("Sedan");
        System.out.println("subMarca: " + miVocho.getSubMarca());
        miVocho.setModelo(1970);
        System.out.println("Modelo: " + miVocho.getModelo());
        miVocho.setColor(Color.BLUE);
        System.out.println("Color: " + miVocho.getColor());
        System.out.println("");
        System.out.println("Segundo Automovil");

        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        System.out.println("Marca: " + miMustang.getMarca());
        miMustang.setSubMarca("Mustang");
        System.out.println("SubMarca: " + miMustang.getSubMarca());
        miMustang.setModelo(2010);
        System.out.println("Modelo: " + miMustang.getModelo());
        miMustang.setColor(Color.yellow);
        System.out.println("Color: " + miMustang.getColor());
        System.out.println("");
        
        System.out.println("Tercer Automovil");
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        System.out.println("Marca: " + miAkura.getMarca());
        miAkura.setSubMarca("NSX");
        System.out.println("Submarca: " + miAkura.getSubMarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: " + miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color: " + miAkura.getColor());
    }
}
