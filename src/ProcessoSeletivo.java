import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo  {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void  entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender ();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("Contato realizado com sucesso.");

        }while (continuarTentando && tentativaRealizadas <3);
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativaRealizadas + " tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + " Numero maximo tentativas " + tentativaRealizadas + " realizada.");
    }
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados (){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA"};
        System.out.println("Imprimindo lista de candidatos informando o indice do elemetento");
        for (int indice = 0; indice <candidatos.length; indice++){
            System.out.println("O candidato de n : " + indice + " é " + candidatos[indice]);
        }
        System.out.println("Forma abrevida de interação for each");
        for (String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos [candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato +  " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato +  "Foi Selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisandoCandidato (Double salarioPretendido){
        double salarioBase = 2000.0;
        if ( salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato .");
        }else if ( salarioBase == salarioPretendido)
            System.out.println("Ligar para o canditado contra proposta .");
        else{
            System.out.println("Aguardando o resultado. ");
        }

    }
}

