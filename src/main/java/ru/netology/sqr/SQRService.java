package ru.netology.sqr;

public class SQRService {
    public int numberSquareCounter(int border, int border2) {
        int score = 0;

        for (int i = 10; i < 99; i++) {
            if (i * i >= border) {
                if (i * i <= border2)
                    score++;
            }
        }
        return score;

    }

}