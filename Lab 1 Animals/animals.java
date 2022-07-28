class Animal {
  public String name;
  private String type;
}

class legs extends Animal {
 public String pet_name;
 protected int number_of_legs;
}

class Dog extends legs {

  private String barks;
  protected Bool pet;
  public void display() {
    System.out.println("My name is " + pet_name);
  }
}

class cow extends legs {

  private String moos;
  protected Bool pet;
  public void display() {
    System.out.println("My name is " + pet_name);
  }
}