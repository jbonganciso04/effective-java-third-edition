package BuilderWhenFacedWithManyconstructorParameter;

public class BuilderClassExample {
//    Traditionally, programmers have used
//    the telescoping constructor pattern, in which you provide a
//    constructor with only the required parameters, another with a single optional parameter, a third with two optional parameters, and so on, culminating in a constructor with all the optional
//    parameters.

//    public class NutritionFacts {
//        private final int servingSize; // (mL) required
//        private final int servings; // (per container) required
//        private final int calories; // (per serving) optional
//        private final int fat; // (g/serving) optional
//        private final int sodium; // (mg/serving) optional
//        private final int carbohydrate; // (g/serving) optional
//        public NutritionFacts(int servingSize, int servings) {
//            this(servingSize, servings, 0);
//        }
//        public NutritionFacts(int servingSize, int servings, int calories) {
//            this(servingSize, servings, calories, 0);
//        }
//        public NutritionFacts(int servingSize, int servings, int calories, int fat) {
//            this(servingSize, servings, calories, fat, 0);
//        }
//        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
//            this(servingSize, servings, calories, fat, sodium, 0);
//        }
//        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
//            this.servingSize = servingSize;
//            this.servings = servings;
//            this.calories = calories;
//            this.fat = fat;
//            this.sodium = sodium;
//            this.carbohydrate = carbohydrate;
//        }
//    }


//    To solve the telescoping problem, we are currently using the builder pattern.
//    See the NutritionFacts.java to check how we did it. here's how we will implement it.

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .fat(1)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(cocaCola.toString());
    }




}
