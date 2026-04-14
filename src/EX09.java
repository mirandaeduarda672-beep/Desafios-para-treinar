void main(){
    Scanner sc= new Scanner(System.in);

    IO.println("digite um numero");
    int numero= sc.nextInt();
    int numeroMaior=0;

    while (numero>0){
        IO.println("digite um numero");
       numero= sc.nextInt();
      if (numero>numeroMaior){
          numeroMaior=numero;
      }
    }
    IO.println("o maior numero digitado foi:"+numeroMaior);
}
