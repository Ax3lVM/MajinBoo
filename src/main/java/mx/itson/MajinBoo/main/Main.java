/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.MajinBoo.main;
import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.Soundbank;
import mx.itson.MajinBoo.entidades.Capitulo;
import mx.itson.MajinBoo.entidades.Comentario;
import mx.itson.MajinBoo.entidades.Resena;
import mx.itson.MajinBoo.entidades.Usuario;
import mx.itson.MajinBoo.enumeradores.Calificacion;
/**
 *
 * @author axelt
 */
public class Main {
    public static void main(String[] args) {
    Resena resena = new Resena();
    resena.setNombre("El poder milagroso de Gohan!");
    resena.setNumeroCap(263);
    resena.setDuracion(24);
    resena.setDescripcion("El tiempo de la fusión ha terminado. Los pequeños Goten y Trunks han desperdiciado demasiado tiempo y no han logrado acabar con Bu. "
            +"\n"+ "En su estado normal son tan débiles que Bu ha perdido completamente el interés de pelear contra ellos. Piccolo siente un ki muy fuerte que se está acercando... "
            +"\n"+"es Gohan que ha llegado a la Tierra después de su entrenamiento con el gran Dai Kaioh sama, con quien ha conseguido un poder increíble. "
            +"\n"+"El combate entre Gohan y Bu está a punto de comenzar. Goten le cuenta que és lo que pasó en la Tierra incluso la muerte de su madre Milk. "
            +"\n"+"¿Conseguirá hacer frente al terrible Bu? ");
    resena.setCalificacion(Calificacion.BUENISIMO);
    List<Comentario> comentarios = new ArrayList<>();
    
    Comentario comentario1 = new Comentario();
    comentario1.setComentario("Este Capitulo Fue muy bueno");
    comentario1.setOrden(1);
    Comentario comentario2 = new Comentario();
    comentario2.setComentario("Hay mejores capitulos");
    comentario2.setOrden(2);
    comentarios.add(comentario1);
    comentarios.add(comentario2);
    resena.setComentarios(comentarios);
    
    List<Usuario> usuario = new ArrayList<>();
    
    Usuario usuario1 = new Usuario();
    usuario1.setNombre("JesusSayajin");
    usuario1.setEmail("JSayajinz1@onion.com");
    usuario1.setPassword("contrasena");
    usuario1.setOrden(1);
    
    Usuario usuario2 = new Usuario();
    usuario2.setNombre("CarlosSama");
    usuario2.setEmail("MajinCarlos@potros.itson.edu.mx");
    usuario2.setPassword("lamasdificil");
    usuario2.setOrden(2);
    
    usuario.add(usuario1);
    usuario.add(usuario2);
    
    resena.setUsuario(usuario);
    
        System.out.println("----- Reseña de capitulos de Dragon Ball Z ------");
        System.out.println("\n");
        System.out.println("Capitulo: "+resena.getNombre());
        System.out.println("Capitulo numero: "+resena.getNumeroCap());
        System.out.println("Duración: "+ resena.getDuracion()+"Minutos");
        System.out.println("\n");
        System.out.println("Descripción: " + "\n" + resena.getDescripcion());
        System.out.println("\n");
        System.out.println("Calificacion: "+resena.getCalificacion());
        System.out.println("\n");
        System.out.println("-----Comentarios-----");
        for(Comentario c : resena.getComentarios()){
        System.out.println(c.getOrden() + ".-" + c.getComentario());
        for(Usuario u : resena.getUsuario()){
         System.out.println("Agregado por:"+u.getNombre()); 
             System.out.println("Correo: "+u.getEmail());
        }
        }
//         for(Usuario u : resena.getUsuario()){
//         System.out.println("Agregado por:"+u.getNombre()); 
//             System.out.println("Correo: "+u.getEmail());
//         }
                
            
    
    
    
    
    
    
    
        
    }
}
