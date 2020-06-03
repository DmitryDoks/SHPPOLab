package com.doks;

public interface TeaProducer { // Абстрактная фабрика
    Tea constructGreenTea(double price);
    Tea constructGreenTeaWithSugar(double price);
    Tea constructBlackTea(double price);
    Tea constructBlackTeaWithSugar(double price);
}
