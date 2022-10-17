public class Launcher {
    public void main(String[] args){
        Launcher menu = new Launcher();
    }
    public void inicializar(){
        Registro pacientes = new Registro();
        Registro registro = new Registro();
        registro.agregarPaciente("david","ortega",19);
        registro.agregarPaciente("juan","poza",67);
        registro.agregarPaciente("rodrigo","sepulveda",65);
        registro.agregarPaciente("nacho","herrero",45);
        registro.agregarPaciente("francisco","reyes",23);
        registro.mostrarPacientesMayoresDe60();
    }
}
