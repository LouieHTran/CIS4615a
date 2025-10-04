/* Author: Louie Tran
*  UCF ID: 5100256
*  Due Date: 10/05/2024
*  
*  IDS03-J. Do not log unsanitized user input
*/

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizeUser(username));
} else {
  logger.severe("User login failed for: " + sanitizeUser(username));
}

public String sanitizeUser(String username) {
  return Pattern.matches("[A-Za-z0-9_]+", username)
      ? username : "unauthorized user";
}