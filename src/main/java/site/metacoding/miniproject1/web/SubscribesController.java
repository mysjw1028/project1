package site.metacoding.miniproject1.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.service.SubscribesService;
import site.metacoding.miniproject1.web.dto.response.subscribes.SubscribesRespListDto;


@RequiredArgsConstructor
@Controller
public class SubscribesController {
	private final SubscribesService subscribesService;

	@GetMapping("/subscribes/{id}")
	public String subscribesform(@PathVariable Integer id, Model model) {
		List<SubscribesRespListDto> subcribesList = subscribesService.구독목록(id);
		model.addAttribute("subcribesList", subcribesList);
		return "subscribes/subscribes";
	}

}