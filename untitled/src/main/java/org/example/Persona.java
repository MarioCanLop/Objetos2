package org.example;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private String ciudad;
    private String profesion;
    private char sexo;
    private int edad;

    public Persona(String nombre, String apellido, String dni,String ciudad, String profesion, char sexo , int edad) {
        setNombre(nombre);
        this.apellido=apellido;
        this.dni=dni;
        this.ciudad=ciudad;
        this.profesion=profesion;
        this.sexo=sexo;
        this.edad=edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void  setNombre(String nombre){
        if (!nombre.equals("messi")){
            this.nombre=nombre;

        }

    }

    public String getApellido(){
        return this.apellido;
    }
    public void  setapellido(String apellido){
        this.apellido=apellido;
    }
    public String getDni(){
        return this.dni;
    }
    public void  setdni(String dni){
        this.dni=dni;
    }

    public char getsexo(){
        return this.sexo;
    }
    public void  setsexo(char sexo){
        this.sexo=sexo;
    }
    public int getEdad(){
        return this.edad;
    }
    public void  setEdad(int edad){
        this.edad=edad;
    }
    public String getciudad(){
        return this.ciudad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", profesion='" + profesion + '\'' +
                ", sexo=" + sexo +
                ", edad=" + edad +
                '}';
    }

    public void  setciudad(String ciudad){
        this.ciudad=ciudad;
    }
    public String getProfesion(){
        return this.profesion;
    }
    public void  setProfesion(String profesion){
        this.profesion=profesion;
    }

    public Persona() {

    }

    public String concatenar(){
        return this.nombre +  " " + this.apellido;
    }

    public void mostrarinfo (){
        System.out.println(this.nombre  + " " + this.apellido + " " + this.dni + " " + this.ciudad +" " + this.profesion + " "+ this.sexo  + " "+ this.edad);

    }

}
