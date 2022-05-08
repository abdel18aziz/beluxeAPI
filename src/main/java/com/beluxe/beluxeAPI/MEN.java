package com.beluxe.beluxeAPI;

public class MEN {
    private final int id;
    private final String Name;
    private String Oldprice;
    private final String Price;
    private String Description;
    private String Specification;

    public void setDescription(String description) {
        Description = description;
    }

    public void setSpecification(String specification) {
        Specification = specification;
    }

    public MEN(int id, String name, String oldprice, String price) {
        this.id = id;
        Name = name;
        Oldprice = oldprice;
        Price = price;
    }



}
