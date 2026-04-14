void main() {

    Scanner sc = new Scanner(System.in);
        int numeroSecreto=7;
    IO.println("Digite o numero secreto!!");
        int tentativa= sc.nextInt();


        while(tentativa!=numeroSecreto)
    {
        IO.println("Tente novamente!");
        tentativa= sc.nextInt();
    }if (numeroSecreto==tentativa){
        IO.println("Número correto!");
    }
}
