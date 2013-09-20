package zero.hibernate.entity;

import java.sql.Date;
import java.util.Set;

public class Orders extends BaseEntity
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double qty;
	private double price;
	private Date createDate;
	private String status;
	private Date modefiyDate;
	private Customes customes;
	private Set<Items> items;
	private String info;
	public double getQty()
	{
		return qty;
	}
	public void setQty(double qty)
	{
		this.qty = qty;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public Date getCreateDate()
	{
		return createDate;
	}
	public void setCreateDate(Date createDate)
	{
		this.createDate = createDate;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public Date getModefiyDate()
	{
		return modefiyDate;
	}
	public void setModefiyDate(Date modefiyDate)
	{
		this.modefiyDate = modefiyDate;
	}
	public Customes getCustomes()
	{
		return customes;
	}
	public void setCustomes(Customes customes)
	{
		this.customes = customes;
	}
	public Set<Items> getItems()
	{
		return items;
	}
	public void setItems(Set<Items> items)
	{
		this.items = items;
	}
	public String getInfo()
	{
		return info;
	}
	public void setInfo(String info)
	{
		this.info = info;
	}
	
	
}
