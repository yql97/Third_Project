/**
 * 
 */
package kugouMusic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kugouMusic.Service.AdminService;
import kugouMusic.Service.RecordService;

/**
 * @author 秋林
 *
 */
@Controller
public class AdminController {
   @Autowired
   private AdminService as;
   @Autowired
   private RecordService rs;
   @RequestMapping("IndexDo")
   public String IndexDo() {
	  // as.getAllAdminInfo(name, pwd)
          // rs.getAllRecordcount(name)
	        // rs.getAllRecordInfo()
	   return "";
   }
   @RequestMapping("AdminLogin")
   public String AdminLogin() {
	   return "";
   }
   
   
}
