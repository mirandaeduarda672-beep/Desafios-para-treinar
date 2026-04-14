void main() {

  Scanner sc= new Scanner(System.in);

    IO.println("digite um numero");
      int numero= sc.nextInt(); ;
    String entrada= sc.nextLine();
        int fatorial=1;



        if (numero<0){
            IO.println("numero negativo, sem fatorial!!");
        } else if (numero==0) {
            IO.println("fatorial é 1");
        } else if (numero>0) {
            while (numero>1){
                fatorial *=numero;
                numero--;

            }
            IO.println(numero+"!"+fatorial);
          sc.close();


        }

}
