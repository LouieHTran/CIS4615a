/* Author: Louie Tran
*  UCF ID: 5100256
*  Due Date: 10/05/2024
*  
*  VNA00-J. Ensure visibility when accessing shared primitive variables
*/

final class ControlledStop implements Runnable {
  private boolean done = false;
  
  @Override public void run() {
    while (!done) {
      try {
        // ...
        Thread.currentThread().sleep(1000); // Do something
      } catch(InterruptedException ie) {
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }   
  }
 
  public void shutdown() {
    done = true;
  }
}