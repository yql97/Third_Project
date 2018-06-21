/**
 * 
 */
package kugouMusic.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kugouMusic.Service.CoopernateService;
import kugouMusic.Service.ImgService;
import kugouMusic.Service.SongService;

/**
 * @author 秋林
 *
 */
@Controller
public class BaseController {
    @Autowired
    private SongService ss;
    @Autowired
    private CoopernateService cs;
    @Autowired
    private ImgService is; 
    @RequestMapping("/WinLoad")
    public String WinLoad(Model model) {
    	/*is.getImgInfo();
    	ss.getAllSong();
    	ss.getAllSongHeat();
    	ss.getAllSongMV();
    	ss.getAllSongOriginal();
    	ss.getAllSongRadio();
    	cs.getAllCooperateInfo();
    	model.addAttribute("","");*/
    	return "kugou";
    }
    @RequestMapping("/table1")
    public String Totable1(@RequestParam("url") String url,Model model) {
    	/*is.getImgInfo();
    	model.addAttribute("","");*/
    	return "table1";
    }
}
