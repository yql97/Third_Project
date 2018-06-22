/**
 * 
 */
package kugouMusic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kugouMusic.Service.SongService;

/**
 * @author 秋林
 *
 */
@Controller
public class SongController {
   @Autowired
   private SongService ss;
   @RequestMapping("SearchSong")
   public String SearchSong(@RequestParam("songname")String songname,Model model) {
	   return "";
   }
   
}
