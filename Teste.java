import java.util.ArrayList;

class Teste {

  public void executar() {

      Aluno a = new Aluno("Dolores");
      Aluno b = new Aluno("Belmiro Silva");
      
      Avaliacao a1 = new Avaliacao(90,2);
      Avaliacao a2 = new Avaliacao(70,1);
      Avaliacao a3 = new Avaliacao(30,1);

      a.adicionaAvaliacao(a1);
      a.adicionaAvaliacao(a2);
      a.adicionaAvaliacao(a3);

      Avaliacao bmatricula = new Avaliacao(90,1);

      b.adicionaAvaliacao(bmatricula);


    //Relatorio saida
    System.out.println("Listagem de alunos:");
    mostraAluno(a);
    mostraAluno(b);



  }

    public void mostraAluno(Aluno aluno){
      
    System.out.println("\nAtleta:" + aluno.getNome());
    System.out.println(aluno.getAvaliacoes().size() + " Avaliacoes");

    ArrayList<Avaliacao> lista = aluno.getAvaliacoes();
    

    for(int i=0; i<lista.size(); i++){
    //for ( Avaliacao umadelas : lista) { <<< (FOR IT for novo java)
    Avaliacao umadelas = lista.get(i);
    System.out.println("\nAvaliacao:" + (i + 1));
    System.out.println("Indice = " + umadelas.indice());
    System.out.println("Categoria = " + umadelas.classificacao());

    
    }
    }
}