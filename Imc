import java.util.Calendar;

public class PerfilMedico extends HeartRates{
    private String gender;
    private double height;
    private double weight;
    private double imc;
    

    public PerfilMedico(String name, String lastName, String gender, double height, double weight, int day, int month, int year){
        
        super(name, lastName, day, month, year);
        this.gender = gender;
        this.height = height;
        this.weight = weight;

    }

    public void setGender(String gender)
    {
        this.gender = gender; 
    }

    public String getGender()
    {
        return gender;
    }

    public void setHeight(int height)
    {
        this.height = height; 
    }

    public double getHeight()
    {
        return height;
    }

    public void setWeight(int weight)
    {
        this.weight = weight; 
    }

    public double getWeight()
    {
        return weight;
    }

    public void getImc(){
        this.imc = this.weight / (this.height * this.height);

        if (this.imc < 18.5){
            System.out.printf("Seu IMC eh %.2f e voce esta abaixo do peso%n", this.imc);
        }
        else if (this.imc > 18.5 && imc < 24.9){
            System.out.printf("Seu IMC eh %.2f e voce esta normal%n", this.imc);
        }
        else if (this.imc > 25 && this.imc < 29.9){
            System.out.printf("Seu IMC eh %.2f e voce esta em sobrepeso%n", this.imc);
        }
        else if (this.imc > 30){
            System.out.printf("Seu IMC eh %.2fe voce esta obeso%n", this.imc);
        }

    }

}
