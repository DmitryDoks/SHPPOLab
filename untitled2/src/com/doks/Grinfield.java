package com.doks;

class Grinfield implements TeaProducer { //Конкретная фабрика
    public static final String producer = TeaProducers.Grinfield.name();

    private TeaBuilderClass teaBuilder = new TeaBuilderClass();

    @Override
    public Tea constructGreenTea(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Green);
        this.teaBuilder.setPrice(price);
        return this.teaBuilder.getResult();
    }

    @Override
    public Tea constructGreenTeaWithSugar(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Green);
        this.teaBuilder.setPrice(price);
        this.teaBuilder.putSugar();
        return this.teaBuilder.getResult();
    }

    @Override
    public Tea constructBlackTea(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Black);
        this.teaBuilder.setPrice(price);
        return this.teaBuilder.getResult();
    }

    @Override
    public Tea constructBlackTeaWithSugar(double price) {
        this.teaBuilder.setProducer(producer);
        this.teaBuilder.changeType(TeaType.Black);
        this.teaBuilder.setPrice(price);
        this.teaBuilder.putSugar();
        return this.teaBuilder.getResult();
    }
}
