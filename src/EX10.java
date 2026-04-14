void main() {
    Scanner sc= new Scanner(System.in);
    IO.println("digite um numero primeiramente");
    int numero= sc.nextInt();
    int numeroNegativo=0;
    int numeroPositivo=0;
      while (numero!=0){
          IO.println("digite um numero");
          numero= sc.nextInt();

          if (numero<0)
          {numeroNegativo++; }
          else if (numero>0) {
              numeroPositivo++;
          }
          IO.println("quantidade de positivos:"+numeroPositivo);
          IO.println("quantidade de negativos:"+numeroNegativo);
      }
}
