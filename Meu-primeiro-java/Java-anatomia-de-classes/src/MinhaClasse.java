public class MinhaClasse {
    public static void main (String [] args)
    {
        System.out.print ("Olá mundo" +"\n");
        //Variaveis jamais deve iniciar com numero//
        //unicos simbolos permitidos _ $
        int ano_2000 = 2021;
        ano_2000 = 2022;
      //tipo nome = valor//
        int anoFabricacao = 2020;
        String motoHonda = "Bross";
        

        final String BR = "Brasil";
        //final Não permite que a variavel seja alterada 
        //como a variavel "ano" ou valor de PI=3,14
        System.out.print ("Braaaaaaaaaazil"+"\n");
        String primeiroNome = "Carlos";
        String segundoNome = "Eduardo";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }    

    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return "Resultado método " + primeiroNome.concat(" ").concat(segundoNome);

    }

}

