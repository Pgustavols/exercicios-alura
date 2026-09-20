package condicionais;

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Digite o primeiro lado: ");
            int l1 = sc.nextInt();

            System.out.print("Digite o segundo lado: ");
            int l2 = sc.nextInt();

            System.out.print("Digite o terceiro lado: ");
            int l3 = sc.nextInt();

            if(l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1){
                System.out.println("Os lados podem formar um triângulo");
            }else{
                System.out.println("Os lados não podem formar um triângulo");
            }
        }
    }
}
