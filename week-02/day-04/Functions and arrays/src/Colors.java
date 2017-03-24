/**
 * Created by Petra on 2017. 03. 23..
 */
public class Colors {
  public static void main(String[] args) {
    String[][] colors = new String[3][];
    String[] green = {"lime,", "forest green,", "olive,", "pale green,", "spring green"};
    String[] red = {"orange red,", "red,", "tomato"};
    String[] pink = {"orchid,", "violet,", "pink,", "hot pink"};
    colors[0] = green;
    colors[1] = red;
    colors[2] = pink;

    for (int i = 0; i < colors.length; i++) {
      for (int j = 0; j < colors[i].length; j++) {

        System.out.print(" " + colors[i][j]);

      }
      System.out.println();
    }
  }
}

// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

// for (String color: colors){
// System.out.println(color);
// }