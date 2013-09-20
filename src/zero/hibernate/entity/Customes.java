package zero.hibernate.entity;

import java.sql.Date;
import java.util.Set;

public class Customes extends BaseEntity
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String phone;
	private String adds;
	private int age;
	private Date brathDate;
	private Set<Orders> orders;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getAdds()
	{
		return adds;
	}
	public void setAdds(String adds)
	{
		this.adds = adds;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public Date getBrathDate()
	{
		return brathDate;
	}
	public void setBrathDate(Date brathDate)
	{
		this.brathDate = brathDate;
	}
	public Set<Orders> getOrders()
	{
		return orders;
	}
	public void setOrders(Set<Orders> orders)
	{
		this.orders = orders;
	}


	
}
