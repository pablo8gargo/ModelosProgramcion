package main;

interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(int amount);
}
