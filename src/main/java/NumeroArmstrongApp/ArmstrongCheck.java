package NumeroArmstrongApp;

public class ArmstrongCheck{
    private int numero;

    public ArmstrongCheck(int numero) {
        this.numero = numero;
    }

    public boolean IsArmstrong() {
        int suma = 0;
        int digitos = String.valueOf(numero).length(); 
        int temp = numero;
    
        while (temp > 0) {
            int digito = temp % 10;                 
            suma += Math.pow(digito, digitos);      
            temp /= 10;                             
        }

        return suma == numero; 
    }

    public int getNumero() {
        return numero;
    }
   
    
}
