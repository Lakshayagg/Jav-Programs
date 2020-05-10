package com.company;

public class ProduceConsume {
    public static void main(String[] args) {
        ProducerConsumer pro = new ProducerConsumer();
        new Consumer(pro);
        new Producer(pro);
    }
}
