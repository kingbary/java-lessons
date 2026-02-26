public class TwoDArrayLesson {
    static void main(String[] arg) {
        String[] fruits = { "Apple", "Mango", "Strawberry" };
        String[] vegetables = { "Pumpkin", "Carrot", "Cucumber" };
        String[] meats = { "Pork", "Beef", "Chicken" };

        String[][] foods = { fruits, vegetables, meats };

        // To update an item in array
        foods[0][1] = "Paw-paw";
        foods[1][2] = "Green pepper";

        for (String[] foodItem : foods) {
            for (String eachItem : foodItem) {
                System.out.print(eachItem + " ");
            }
            System.out.println(" ");
        }
    }
}
