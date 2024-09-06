package bank.study2;

public class StringBuild {

           public static void main(String[] args) {
            int iterations = 100_000;

            // Testando a performance da concatenação com String
            long startTime = System.currentTimeMillis();
            String stringConcat = "";
            for (int i = 0; i < iterations; i++) {
                stringConcat += "a";
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Tempo com String: " + (endTime - startTime) + " ms");

            // Testando a performance da concatenação com StringBuilder
            startTime = System.currentTimeMillis();
            StringBuilder stringBuilderConcat = new StringBuilder();
            for (int i = 0; i < iterations; i++) {
                stringBuilderConcat.append("a");
            }
            endTime = System.currentTimeMillis();
            System.out.println("Tempo com StringBuilder: " + (endTime - startTime) +"ms");
        }
    }


