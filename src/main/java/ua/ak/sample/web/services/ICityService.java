package ua.ak.sample.web.services;

import java.util.List;

import ua.ak.sample.web.models.City;

/**
 * 
 * @author alexk
 */
public interface ICityService 
{
    List<City> findAll();
}
