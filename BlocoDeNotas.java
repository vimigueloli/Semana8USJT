import java.util.ArrayList;
public class BlocoDeNotas{
   private ArrayList<String> notas;
   public BlocoDeNotas(){
      notas= new ArrayList<String>();
   }
      
   public void addNota(String nota){
      notas.add(nota);
   }
   
   public int buscarNota (String nota){
      for(int i=0; i < notas.size(); i++){
         if(notas.get(i).equals(nota))
           return i;            
         }
      return -1;  
   }
   
   public String romoverNota(int posicao){
      if(posicao >= 0){

         notas.remove(posicao);
         return "nota removida";
      } else {
         return "nota inexistente";
      }
   }
   public String showNota(int posicao){
      return notas.get(posicao);
   }

   public void listarNotas(){
      for(int i=0; i<notas.size(); i++){
         System.out.println( notas.get(i));
      }
   }
   
   public void mudarNota(int posicao,String notaN){
   notas.set(posicao, notaN);
   }
   
   
}