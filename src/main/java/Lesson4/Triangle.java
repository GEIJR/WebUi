package Lesson4;

public class Triangle {

    public double triangleSide(int a, int b, int c) throws MyException {

        if (a <= 0 || b <= 0 || c <= 0){
            throw new MyException("Задано некорректное значение");
        }
        if (a+b<c || a+c<b || b+c<a){
            throw new MyException("Это не треугольник");
        }
        double p = (a+b+c)/2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if (S == 0){
            throw new MyException("Площадь не может быть равна нулю");
        }
        return S;
    }
//    public double triangleArea(int a, int b, int c) throws MyException{

//        System.out.println(S);

    }













