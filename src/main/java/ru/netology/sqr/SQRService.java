package ru.netology.sqr;

public class SQRService {

    public int calculate(int down, int up) {
        for (int i = 10; i <= 99; i++) {
            int count = 0;
            int square = i * i;
            if (square >= down) {
                if (square <= up) {
                    count++;
                }
            }
        }
        return count;
    }
}






