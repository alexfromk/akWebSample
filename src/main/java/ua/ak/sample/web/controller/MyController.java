package ua.ak.sample.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
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
    	return toCityList();
    }
    
    @GetMapping("/add_city")
    public ModelAndView addCity() {
        Map<String, Object> params = new HashMap<>();
        params.put("newCity", new City(0L,"",0));
        return new ModelAndView("add_city", params);
    }
    
    @PostMapping("/save_city")
    public ModelAndView saveCity(City newCity, final BindingResult bindingResult) {
    	cityService.add(newCity);
        return toCityList();
    }

    @GetMapping("/modify_city")
    public ModelAndView modifyCity(HttpServletRequest request) {
    	String idForChange = request.getParameter("id");
    	if(idForChange!=null)
    	{
    		Long id = Long.valueOf(idForChange);
    		City foundCity = cityService.findById(id);
    		if(foundCity!=null)
    		{
    			Map<String, Object> params = new HashMap<>();
    	        	params.put("newCity", foundCity);
    	        	return new ModelAndView("add_city", params);
    		}
    	}
        return toCityList();
    }

    ModelAndView toCityList()
    {
    	Map<String, Object> params = new HashMap<>();
    	params.put("cities", cityService.findAll());
    	return new ModelAndView("cities", params);
    }
}
