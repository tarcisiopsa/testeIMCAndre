class Teste {

  public void executar() {

      Aluno a = new Aluno("Dolores");
      Aluno b = new Aluno("Belmiro Silva");
      
      Avaliacao a1 = new Avaliacao(90,2);
      Avaliacao a2 = new Avaliacao(70,1);

      a.avaliacao = a1;
      b.avaliacao = a2;


    //Relatorio saida
    System.out.println("Listagem de alunos:");
    mostraAluno(a);
    mostraAluno(b);



  }

    public void mostraAluno(Aluno a){
      
    System.out.println("\n" + a.getNome());
    System.out.println("Indice = " + a.avaliacao.indice());
    System.out.println("Categoria = " + a.avaliacao.classificacao());

    }

}