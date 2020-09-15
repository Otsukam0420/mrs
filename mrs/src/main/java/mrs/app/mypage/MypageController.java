package mrs.app.mypage;

import java.time.LocalDate;
import java.util.List;
import mrs.domain.model.ReservableRoom;
import mrs.domain.service.mypage.MypageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("mypage")
public class MypageController {
	@Autowired
	MypageService mypageService;

	@RequestMapping(method = RequestMethod.GET)
	String mypage() {
		return "mypage/mypage";
	}
}