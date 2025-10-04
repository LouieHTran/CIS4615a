/* Author: Louie Tran
*  UCF ID: 5100256
*  Due Date: 10/05/2024
*  
*  MSC01-J. Do not use an empty infinite loop
*/

public final int DURATION=10000; // In milliseconds
 
public void nop() throws InterruptedException {
  while (true) {
    // Useful operations
    Thread.sleep(DURATION);
  }
}