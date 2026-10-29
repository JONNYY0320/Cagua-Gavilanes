import java.util.Arrays;


public static void main(String[] args) {
    Student[] students = {
            new Student("Ana", 8.5),
            new Student("Carlos", 9.2),
            new Student("Bea", 7.8),
            new Student("Daniel", 6.5),
            new Student("Elena", 9.8),
    };


    Arrays.sort(students, (e1, e2) -> Double.compare(e2.note, e1.note));

    System.out.println("TOP 3 ESTUDENTS");
    int limit = Math.min(3, students.length);
    for (int i = 0; i < limit; i++) {
        System.out.println((i + 1) + ". " + students[i].name + " - Note: " + students[i].note);
    }

    int pasadas = 0;
    int iteracionesTotales = 0;
    boolean cambiado;

    do {
        cambiado = false;
        pasadas++;
        for (int i = 0; i < students.length - 1; i++) {
            iteracionesTotales++;
            if (students[i].note < students[i + 1].note) {
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
                cambiado = true;
            }
        }
    } while (cambiado);

    System.out.println("Total number of passes: " + pasadas);
    System.out.println("Total number of iterations (comparisons): " + iteracionesTotales);
}





