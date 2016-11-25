
public class ElementalHero {
	String  Nombre, Atributo, Tipo;
	boolean Efecto;
	int     Nivel, ATK, DEF;
      
  public ElementalHero(String nombre,String atributo,int nivel, boolean efecto,
                                String tipo, int atk, int def) {
    	this.Nombre   = nombre;
    	this.Atributo = atributo;
    	this.Nivel    = nivel;
    	this.Efecto   = efecto;
    	this.Tipo     = tipo;
    	this.ATK      = atk;
    	this.DEF      = def;
    }//constructor
    
  public void Mostrar_Hero() {
       System.out.println("\t\t\tMOSTRANDO HEROE ELEMENTAL\n ");
       System.out.println("Nombre del heroe: "+Nombre);
       System.out.println("Atributo:         "+Atributo);
       System.out.println("Nivel:            "+Nivel);
       System.out.println("Tipo:             "+Tipo);
       System.out.println("Efecto:           "+Efecto);
       System.out.println("ATK "+ATK+" DEF "+DEF+"\n");
    } //metodo mostrar
    
  public static void main(String[] args) {
    ElementalHero B = new ElementalHero("Bubbleman","Agua",4,true,"Guerrero",800,1200);
    B.Mostrar_Hero();	 
   }//fin de main
}//fin de clase

