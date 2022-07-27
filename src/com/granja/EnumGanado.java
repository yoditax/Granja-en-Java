package com.granja;

public enum EnumGanado {
    POLLITO ("Pollito"),
    HUEVO ("Huevo"),
    VACA ("Vaca");

    private final String animal;       

    private EnumGanado(String s) {
        animal = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false 
        return animal.equals(otherName);
    }

    public String toString() {
       return this.animal;
    }
}