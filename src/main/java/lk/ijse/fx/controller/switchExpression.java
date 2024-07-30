package lk.ijse.fx.controller;

public class switchExpression {
        public static void main(String[] args) {
         /*   final int X = 2;

            String result = switch (X) {
                case 1 -> "Case 1";
                case 2 -> "Case 2";
                default -> {
                    String s2 = "Default Case";
                    yield s2;
                }
            };

            System.out.println(result);
        }*/

    final int Y = 4;
    String result = switch (Y) {
        case 1 -> "Case 1";
        case 2 -> "Case 2"; /*{ String st= "Case 2";
            yield st;

        }*/

        case 3 ->
            "Case 3";
        default -> "Default Case";/*{
            String s2 = "Default Case";
            yield s2;
        }*/
    };

            System.out.println(result);
}


    }


