import java.util.Scanner;

public class FrequenciaCardiaca{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		FrequenciaCardiaca paciente = new FrequenciaCardiaca("Bruno", "Harger", 15, 6, 2000);

        System.out.println("\nIdade: " + paciente.idade());
        System.out.println("Frequencia max: " + paciente.getFcamax());
        paciente.getInterval();
	} 
}