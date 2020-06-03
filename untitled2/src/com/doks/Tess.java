package com.doks;

public class Tess implements TeaProducer {
    public static final String producer = TeaProducers.Tess.name();
    private TeaBuilderClass teaBuilder = new TeaBuilderClass();

    @Override public Tea constructGreenTea(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Green);
        this.teaBuilder.setPrice(price);
        return this.teaBuilder.getResult();
    }

    @Override public Tea constructGreenTeaWithSugar(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Green);
        this.teaBuilder.setPrice(price);
        this.teaBuilder.putSugar();
        return this.teaBuilder.getResult();
    }

    @Override public Tea constructBlackTea(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Black);
        this.teaBuilder.setPrice(price);
        return this.teaBuilder.getResult();
    }

    @Override public Tea constructBlackTeaWithSugar(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Black);
        this.teaBuilder.setPrice(price);
        this.teaBuilder.putSugar();
        return this.teaBuilder.getResult();
    }
}
