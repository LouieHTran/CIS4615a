/* Author: Louie Tran
*  UCF ID: 5100256
*  Due Date: 10/05/2024
*  
*  EXP00-J. Do not ignore values returned by methods
*/

public void deleteFile(){
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
}