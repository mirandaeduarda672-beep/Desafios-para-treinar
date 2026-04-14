void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("Digite um número!");
    int numero= sc.nextInt();
    int i=1;
    int soma=0;

     while(i<=numero)
    {
        soma+=i;
        i++;
        sc.close();

    }IO.println("soma de todos os numeros"+"\n"+soma);


}
