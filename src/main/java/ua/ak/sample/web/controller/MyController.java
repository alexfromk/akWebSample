package ua.ak.sample.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ua.ak.sample.web.models.City;
import ua.ak.sample.web.services.ICityService;

@Controller
public class MyController
{	
	@Autowired
	@Qualifier("cityService")
    private ICityService cityService;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }

    @GetMapping("/cities")
    public ModelAndView showCities() {

        List<City> cities = cityService.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("cities", cities);

        return new ModelAndView("cities", params);
    }
}
