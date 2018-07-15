package dp.creational.prototype.model;

import dp.creational.prototype.contract.Prototype;

public class Movie implements Prototype {
   private String name = null;
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   @Override
   public Movie clone() throws CloneNotSupportedException {
       System.out.println("Cloning Movie object..");
       return (Movie) super.clone();
   }
   @Override
   public String toString() {
       return "Movie";
   }
}



