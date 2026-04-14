void main() {
    Scanner sc= new Scanner(System.in);

    IO.println("digite um numero");

       int numero= sc.nextInt();
       int soma=0;
       int i=1;

       while (i<=numero){
               if (i%2==0){
    soma+=i;
}i++;
           }IO.println("soma igual:"+soma);

       }

