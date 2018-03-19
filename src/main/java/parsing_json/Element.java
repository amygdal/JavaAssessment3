package parsing_json;

/*
The Element class should be a POJO that only implements getters. You should refer to the json to see what the attribute
 types should be. for decimal places, use double and avoid using float.
 */

/*

--Element--

added by amy:
 */

public class Element
{
    private String summary;

    private String[] shells;

    private String appearance;

    private String symbol;

    private String density;

    private String number;

    private String period;

    private String boil;

    private String category;

    private String xpos;

    private String atomic_mass;

    private String source;

    private String color;

    private String name;

    private String named_by;

    private String ypos;

    private String discovered_by;

    private String spectral_img;

    private String phase;

    private String melt;

    private String molar_heat;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String[] getShells ()
    {
        return shells;
    }

    public void setShells (String[] shells)
    {
        this.shells = shells;
    }

    public String getAppearance ()
    {
        return appearance;
    }

    public void setAppearance (String appearance)
    {
        this.appearance = appearance;
    }

    public String getSymbol ()
    {
        return symbol;
    }

    public void setSymbol (String symbol)
    {
        this.symbol = symbol;
    }

    public String getDensity ()
    {
        return density;
    }

    public void setDensity (String density)
    {
        this.density = density;
    }

    public String getNumber ()
    {
        return number;
    }

    public void setNumber (String number)
    {
        this.number = number;
    }

    public String getPeriod ()
    {
        return period;
    }

    public void setPeriod (String period)
    {
        this.period = period;
    }

    public String getBoil ()
    {
        return boil;
    }

    public void setBoil (String boil)
    {
        this.boil = boil;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getXpos ()
    {
        return xpos;
    }

    public void setXpos (String xpos)
    {
        this.xpos = xpos;
    }

    public String getAtomic_mass ()
    {
        return atomic_mass;
    }

    public void setAtomic_mass (String atomic_mass)
    {
        this.atomic_mass = atomic_mass;
    }

    public String getSource ()
    {
        return source;
    }

    public void setSource (String source)
    {
        this.source = source;
    }

    public String getColor ()
{
    return color;
}

    public void setColor (String color)
    {
        this.color = color;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getNamed_by ()
    {
        return named_by;
    }

    public void setNamed_by (String named_by)
    {
        this.named_by = named_by;
    }

    public String getYpos ()
    {
        return ypos;
    }

    public void setYpos (String ypos)
    {
        this.ypos = ypos;
    }

    public String getDiscovered_by ()
    {
        return discovered_by;
    }

    public void setDiscovered_by (String discovered_by)
    {
        this.discovered_by = discovered_by;
    }

    public String getSpectral_img ()
    {
        return spectral_img;
    }

    public void setSpectral_img (String spectral_img)
    {
        this.spectral_img = spectral_img;
    }

    public String getPhase ()
    {
        return phase;
    }

    public void setPhase (String phase)
    {
        this.phase = phase;
    }

    public String getMelt ()
    {
        return melt;
    }

    public void setMelt (String melt)
    {
        this.melt = melt;
    }

    public String getMolar_heat ()
    {
        return molar_heat;
    }

    public void setMolar_heat (String molar_heat)
    {
        this.molar_heat = molar_heat;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [summary = "+summary+", shells = "+shells+", appearance = "+appearance+", symbol = "+symbol+"," +
                " density = "+density+", number = "+number+", period = "+period+", boil = "+boil+", " +
                "category = "+category+", xpos = "+xpos+", atomic_mass = "+atomic_mass+", source = "+source+", " +
                "color = "+color+", name = "+name+", named_by = "+named_by+", ypos = "+ypos+"," +
                " discovered_by = "+discovered_by+", spectral_img = "+spectral_img+", phase = "+phase+", " +
                "melt = "+melt+", molar_heat = "+molar_heat+"]";
    }
}