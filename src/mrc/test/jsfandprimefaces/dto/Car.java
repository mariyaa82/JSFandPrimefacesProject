package mrc.test.jsfandprimefaces.dto;

public class Car
{
    private String id;
    private String brand;
    private int year;
    private String color;
    private int price;
    private boolean soldState;
    
    public Car() {}
    
    public Car(String carId, String brand, int year, String color, int price, boolean soldState)
    {
        super();
        this.id = carId;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.soldState = soldState;
    }
    
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getBrand()
    {
        return brand;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + price;
        result = prime * result + (soldState ? 1231 : 1237);
        result = prime * result + year;
        return result;
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
        Car other = (Car) obj;
        if (brand == null)
        {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (color == null)
        {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (id == null)
        {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (price != other.price)
            return false;
        if (soldState != other.soldState)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public boolean isSoldState()
    {
        return soldState;
    }

    public void setSoldState(boolean soldState)
    {
        this.soldState = soldState;
    }

    
}
