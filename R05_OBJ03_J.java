/* Author: Louie Tran
*  UCF ID: 5100256
*  Due Date: 10/05/2024
*  
*  OBJ03-J. Prevent heap pollution
*/

class ListUtility {
  private static void addToList(List<String> list, String str) {
    list.add(str);     // No warning generated
  }
 
  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    addToList(list, "42");
    System.out.println(list.get(0));
  }
}