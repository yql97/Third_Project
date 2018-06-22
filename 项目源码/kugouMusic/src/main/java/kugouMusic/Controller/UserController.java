/**
 * 
 */
package kugouMusic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kugouMusic.Service.UserService;

/**
 * @author 秋林
 *
 */
@Controller
public class UserController {
   @Autowired
   private UserService us;
   @RequestMapping("LoginDo")
   public String LoginDo() {
	  // us.getAllUserInfoByName(name, pwd)
	   return "";
   }
   @RequestMapping("RegisterDo")
   public String RegisterDo() {
	 //   us.insertUserInfo();
	   return "";
   }
   
}
