import java.util.ArrayList;

public class Registro {
    private ArrayList<Persona> pacientes;

    public Registro(){
        this.pacientes = new ArrayList<>();
    }
    public Persona buscarPersona(String nombre, String apellido ){
        for(Persona paciente : this.pacientes){
            if(paciente.getNombre().equals(nombre) && paciente.getApellido().equals(apellido)){
                return paciente;
            }
        }
        return null;
    }
    public boolean agregarPaciente(String nombre, String apellido,int edad){
        if(buscarPersona(nombre,apellido) == null) {
            Persona paciente = new Persona(nombre, apellido, edad);
            this.pacientes.add(paciente);
            return true;
        }
        else{
            return false;
        }
    }
    public void mostrarPacientesMayoresDe60(){
        for(Persona paciente : this.pacientes){
            if(paciente.getEdad() > 60){
                System.out.println(paciente.getEdad()+paciente.getApellido());
            }
        }
    }
}
