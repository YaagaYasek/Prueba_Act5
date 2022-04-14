public class Alumno {

    private String nombre;
    private int edad;
    private String sexo;

    public Alumno(){
        nombre = "";
        edad = 0;
        sexo = "";
    }

    public Alumno(String n,int e,String s){
        nombre = n;
        edad = e;
        sexo = s;
    }

    public void setNombre(String n){
        nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int e){
        edad = e;
    }

    public int getEdad(){
        return edad;
    }

    public void setSexo(String s){
       sexo = s;
    }

    public String getSexo(){
        return sexo;
    }
}

