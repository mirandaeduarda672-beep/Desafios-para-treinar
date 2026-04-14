void main() {
    Scanner sc= new Scanner(System.in);

    IO.println("Digite a primeira nota (ou-1 para finalizar)");
    int nota=sc.nextInt();
    int repeticao=0;
    double media=0;
    int soma= 0;
    int i=2;

    if (nota==-1){
        IO.println("Processo finalizado");
    }else {

       while(nota!=-1){
           IO.println("Digite a nota"+ i + "(ou digite -1 para finalizar)");
           soma+=nota;
           i++;
           repeticao++;
           nota= sc.nextInt();

       } media= soma/repeticao;
    IO.println("Media dos numeros digitados: "+media);
}}
