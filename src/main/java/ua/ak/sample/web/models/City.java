package ua.ak.sample.web.models;

import java.util.Objects;

/**
 * Model City
 * @author alexk
 */
public class City {

    private Long id=0L;
    private String name="+";
    private int population=0;
	public City()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public City(Long id, String name, int population)
	{
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getPopulation()
	{
		return population;
	}
	public void setPopulation(int population)
	{
		this.population = population;
	}
	@Override
	public String toString()
	{
		return String.format("City [id=%s, name=%s, population=%s]",id,name,
				population);
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City)obj;
		return Objects.equals(id,other.id);
	}
    
    

}
