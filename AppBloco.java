import javax.swing.JOptionPane;
public class AppBloco{
   public static void main(String [] args){
      String nota;
      int posicao;
      BlocoDeNotas bloco= new BlocoDeNotas();
      nota = JOptionPane.showInputDialog("anote algo");
      bloco.addNota(nota);
      nota = JOptionPane.showInputDialog("anote outra coisa");
      bloco.addNota(nota);
      nota = JOptionPane.showInputDialog("digite alguma das coisas que você já anotou pra eu procurar");
      posicao= bloco.buscarNota(nota);
      if(posicao > -1 ){
         nota = JOptionPane.showInputDialog("o indice dessa nota é: " + posicao + "    digite um novo texto para substituir essa nota!" );
         bloco.mudarNota(posicao,nota);
      }else{
         JOptionPane.showMessageDialog(null,"essa nota não foi feita ainda então eu armazenei ela");
         bloco.addNota(nota);
      }
      posicao=Integer.parseInt(JOptionPane.showInputDialog("acho que temos muitas notas! digite o numero de alguma delas para que seja eliminada"));
      nota = bloco.romoverNota(posicao);
      JOptionPane.showMessageDialog(null,"...\n" + nota);
      System.out.println("notas armazenadas: "); 
      bloco.listarNotas();
      
   }   
}