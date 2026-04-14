void main(){
    Scanner sc = new Scanner(System.in);
    IO.println("Escreva um numero");

     int numero=sc.nextInt();
     int multiplicador=1;
     int resultado=1;

     while (multiplicador<=10){
         resultado=numero*multiplicador;
         IO.println(numero + "x" + multiplicador + "=" + resultado);
         multiplicador++;

    } sc.close();


}
