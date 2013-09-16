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

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getNmae()
	{
		return name;
	}

	public void setNmae(String name)
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

	public Date getBrathDate()
	{
		return brathDate;
	}

	public void setBrathDate(Date brathDate)
	{
		this.brathDate = brathDate;
	}

	public Set<Orders> getSet()
	{
		return orders;
	}

	public void setSet(Set<Orders> set)
	{
		this.orders = set;
	}
}
