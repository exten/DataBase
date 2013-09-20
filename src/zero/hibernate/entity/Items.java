package zero.hibernate.entity;

public class Items extends BaseEntity
{

	public long getCode()
	{
		return code;
	}
	public void setCode(long code)
	{
		this.code = code;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getNameOther()
	{
		return nameOther;
	}
	public void setNameOther(String nameOther)
	{
		this.nameOther = nameOther;
	}
	public String getSpec()
	{
		return spec;
	}
	public void setSpec(String spec)
	{
		this.spec = spec;
	}
	public String getUnit()
	{
		return unit;
	}
	public void setUnit(String unit)
	{
		this.unit = unit;
	}
	public String getMake()
	{
		return make;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 8729762071017503371L;
	private long code;
	private String name;
	private String nameOther;
	private String spec;
	private String unit;
	private String make;
}
