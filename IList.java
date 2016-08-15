/**
 * @author Estructura de Datos
 * @version 0.0
 * @date 24/07/2016
 * ADT para Listas
 */
public interface IList<E> 
{

   public int size();
   // post: returns number of elements in list

   public boolean isEmpty();
   // post: returns true iff list has no elements

   public void clear();
   // post: empties list

   public void add(E value);
   // post: value is added to tail of list

   public E remove();
   // pre: list has at least one element
   // post: removes last value found in list

}