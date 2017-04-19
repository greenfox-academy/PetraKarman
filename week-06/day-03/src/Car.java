public class Car {
  CarType myCarType;
  CarColor myCarColor;

  public Car(CarType myCarType, CarColor myCarColor) {
    this.myCarType = myCarType;
    this.myCarColor = myCarColor;
  }

  @Override
  public String toString() {
    return myCarType + " " + myCarColor;
  }
}

/*
Create a Car class with 2 enum properties
enum of car types
The types of these cars or vehicles is up to you
enum of colors

Create 256 Vehicles randomly and put them into a List
Count and Print the number of same vehicles for each type
Count and Print the number of same vehicles for each color
Print the most frequently occurring vehicle

 */