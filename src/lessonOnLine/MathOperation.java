package lessonOnLine;

public class MathOperation {

    public int mathOperation(int a, int b, Action action){
        return action.mathOperation(a, b); // от интерфейса action берет метод mathOperation, который в нем и определен
    }
}
