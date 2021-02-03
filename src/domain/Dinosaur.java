package domain;

public class Dinosaur extends Predator {

    private String kind;

    public Dinosaur(String name, int weight, int height, String kind) {
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.kind=kind;
    }

    public Dinosaur() {
        this("iqos", 7, 12,"T-Rex");
    }

    public Dinosaur(String name) {
        this( name, 7, 12,"T-Rex");
    }

    public void scare() {
        System.out.println("Dinosaur is scareing");
    }
    
   
     
    @Override
    public String toString() {
       return super.toString()+"\nKind:\t"+this.kind+"\n\n Dinosaurs became extinct 243 million years ago ( ";
    }
    
    @Override
    public void speak() {
        System.out.println("grrrrrr");
    }
    
    @Override
    public void eat() {
        System.out.println("Dinosaur eats people");
    }
    
     public void kills() {
        System.out.println("Dinosaur kills everyone");
    }
}
