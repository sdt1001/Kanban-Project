
public class Item {

public Item(String Name, String Description, Integer DPS)
{
	setName(Name);
	setDescription(Description);
	setDamage(DPS);
}

private String sName = "";
private String sDescription = "";
private Integer DamagePerSecond = 0;

public String getName()
{
	return sName;
}
public void setName(String Name)
{
	sName = Name;
}

public String getDescription()
{
	return sDescription;
}
public void setDescription(String Desc)
{
	sDescription = Desc;
}

public Integer getDamage()
{
	return DamagePerSecond;
}
public void setDamage(Integer Damage)
{
	DamagePerSecond = Damage;
}


}
