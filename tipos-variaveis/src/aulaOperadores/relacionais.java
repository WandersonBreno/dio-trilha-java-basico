package aulaOperadores;
public class relacionais {
    public static void main(String[] args) {
        String nomeUm = "WANDERSON";
        String nomeDois = new String("WANDERSON");
       
        //System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero2){
            System.out.println("a nossa condição é verdadeira");
        }
        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual numeroDois? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente do numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior do que o numeroDois? " + simNao);

        

    }

}
