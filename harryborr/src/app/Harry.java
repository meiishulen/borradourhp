package app;

public class Harry extends Persona {
    private String nombre= "HarryPotter";
    private int edad= 14;
    private int salud= 1;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad( int edad){
        this.edad = edad;
    }

    public int getSalud(){
        return this.salud;
    }
    public void setSalud( int salud){
        this.salud= salud;
    }

    public Harry(String nombre, int edad, int salud) {
        super(nombre, edad, salud);
        // TODO Auto-generated constructor stub
    }
    

    public void showHarry(){
        System.out.println("            _            _.,----,");
        System.out.println(" __  _.-._ / '-.        -  ,._  /) ");
        System.out.println("|  `-)_   '-.   \\       / < _ )/\" }");
        System.out.println("/__    '-.   \\   '-, ___(c-(6)=(6)");
        System.out.println(" , `'.    `._ '.  _,'   >\\    \"  )");
        System.out.println(" :;;,,'-._   '---' (  ( \"/`. -='/");
        System.out.println(";:;;:;;,  '..__    ,`-.`)'- '--'");
        System.out.println(";';:;;;;;'-._ /'._|   Y/   _/' \\");
        System.out.println("      '''\"._ F    |  _/ _.'._   `\\");
        System.out.println("             L     \\   \\/     '._  \\");
        System.out.println("      .-,-,_ |     `.  `'---,  \\_ _|");
        System.out.println("      //    'L    /  \\,   (\"--',=`)7");
        System.out.println("     | `._       : _,  \\  /'`-._L,_'-._");
        System.out.println("     '--' '-.\\__/ _L   .`'         './/");
        System.out.println("                 [ (  /");
        System.out.println("                  ) `{");
        System.out.println("                  \\__)");
    }
    


    
}