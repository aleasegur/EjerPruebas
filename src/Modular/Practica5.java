package Modular;

import java.util.Scanner;

/*ALEJANDRO ASENCIO GURAU
* Escribe un programa que simule un sistema de votación entre tres opciones (por ejemplo, tres candidatos).
* Solicita al usuario el número de votos para cada opción y determina cuál es la más votada o si hay empate.
Funciones sugeridas:
boolean validateVotes(votes) para verificar que los votos sean válidos.
int findWinner(votes1, votes2, votes3) para determinar el ganador.*/
public class Practica5 {
    public static boolean validateVotes(int votes){
        boolean res = votes==1|| votes==2||votes==3;
        return res;
    }

    public static int findWinner(int votes1,int votes2, int votes3){
        int res=0;
        if (votes1>votes2 && votes1>votes3){
            res=1;
        } else if (votes2>votes1 && votes2>votes3) {
            res=2;
        } else if (votes3>votes1 && votes3>votes2) {
            res=3;
        }else {
            System.out.println("EMPATE");
        }
        return res;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int votos1=0,votos2=0,votos3=0;
        int cantVotantes, votoVotante;
        int resultVotos;
        do {
            System.out.println("Introduce la cantidad de votantes que van ha votar: ");
            cantVotantes = sc.nextInt();
            if (cantVotantes<=0){
                System.err.println("La cantidad de votantes no puede ser menor o igual a 0.");
            }
        }while (cantVotantes<=0);
        for (int i = 1; i <=cantVotantes ; i++) {
            do {
                System.out.println("1.Candidato1.\n2.Candidato2.\n3.Candidato3.");
                System.out.println("Introduce tu voto, votante " + i + " :");
                votoVotante = sc.nextInt();
                if (!validateVotes(votoVotante)){
                    System.err.println("ERROR. EL CANDIDATO INTRODUCIDO NO EXISTE. VUELVA A INTRODUCIR EL VOTO");
                }
            }while (!validateVotes(votoVotante));
            if (votoVotante==1){
                votos1++;
            } else if (votoVotante==2) {
                votos2++;
            }else {
                votos3++;
            }
        }
        resultVotos=findWinner(votos1,votos2,votos3);
        System.out.println("EL GANADOR ES EL CANDIDATO: "+resultVotos);
        sc.close();
    }
}
