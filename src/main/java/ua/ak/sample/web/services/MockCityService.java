package ua.ak.sample.web.services;

import java.util.ArrayList;
import java.util.List;

import ua.ak.sample.web.models.City;

public class MockCityService implements ICityService
{

	@Override
	public List<City> findAll()
	{
		List<City> list=new ArrayList<>();
		list.add(new City(10L,"New York",10000000));
		list.add(new City(20L,"Athens",2000000));
		list.add(new City(30L,"Kyev",3000000));
		list.add(new City(40L,"Istanbul",9000000));
		list.add(new City(50L,"Cairo",21000000));
		list.add(new City(60L,"London",9500000));
		list.add(new City(70L,"Madrid",2500000));
		return list;
	}
	

}
