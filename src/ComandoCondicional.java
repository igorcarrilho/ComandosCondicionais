public class ComandoCondicional {
    public static void main(String[] args){
        //Testar IF
        int num1 = 10, num2 = 30;
        if (num1 < num2){
            System.out.println("Num1 é menor que num2");
        }

        if (num1 > num2){
            System.out.println("num1 é menor que num2");
        }else{
            System.out.println("num1 não é menor que num2");
        }

        //Condição composta - situação num1 < num2
        if (num1 > num2){
            System.out.println("num1 é maior que num2");
        }else if (num1 < num2){
            System.out.println("num1 é menor que o num2");
        }else{
            System.out.println("num1 é igual ao num2");
        }

        //Condição composta - situação num1 = num2
        num1 = 10;
        num2 = 10;
        if (num1 > num2){
            System.out.println("num1 é maior que num2");
        }else if (num1 < num2){
            System.out.println("num1 é menor que o num2");
        }else{
            System.out.println("num1 é igual ao num2");
        }

        //Comando Switch
        char opcao = '3';
        switch (opcao){
            case '1': {
                System.out.println("Chame o programa de Inclusão");
                break;
            }
            case '2': {
                System.out.println("Chame o programa de Alteração");
                break;
            }
            case '3': {
                System.out.println("Chame o programa de Exclusão");
                break;
            }
            case '4': {
                System.out.println("Chame o programa de Consulta");
                break;
            }
        }
    }
}
