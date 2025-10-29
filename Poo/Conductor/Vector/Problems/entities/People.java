package Conductor.Vector.Problems.entities;

// Declaração da classe pública chamada 'People'
public class People {
    // Declara um atributo (variável) privado do tipo String, chamado 'name'
    private String name;
    // Declara um atributo privado do tipo int (número inteiro), chamado 'age'
    private int age;
    // Declara um atributo privado do tipo double (número decimal), chamado 'height'
    private double height;

    // Construtor da classe 'People'
    public People( String name, int age, double height ){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Get and Setters
    public String getName( ) {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public int getAge( ) {
        return age;
    }


    public void setAge( int age ) {
        this.age = age;
    }


    public double getHeight( ) {
        return height;
    }


    public void setHeight( double height ) {
        this.height = height;
    }


    // To String
    @Override
    public String toString(  ) {
        return "Name: " + name +
                "\n Age: " + age +
                "\n Height: " + height; 
    }


    

}
